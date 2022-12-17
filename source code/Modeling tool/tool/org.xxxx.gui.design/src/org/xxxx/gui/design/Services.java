package org.xxxx.gui.design;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.internal.dialect.NotYetOpenedDiagramAdapter;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.*;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;

//import architect.ArchitectFactory;
//import architect.Component;
//import architect.Model;
//import architect.Package;

import org.eclipse.sirius.LIDLGUI.LIDLGUIFactory;
import org.eclipse.sirius.LIDLGUI.MetaDatatype;
import org.eclipse.sirius.LIDLGUI.MetaInterface;
import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.Datatype;
import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.Interface;
import org.eclipse.sirius.LIDLGUI.InterfaceConnector;
import org.eclipse.sirius.LIDLGUI.InterfaceTable;

///**
// * The services class used by VSM.
// */
//public class Services {
//    
//    /**
//    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
//    */
//	
//	// 
//	
//    public EObject myService(EObject self, String arg) {
//       // TODO Auto-generated code
//      return self;
//    }
//}

/**
 * The services class used by VSM.
 */
public class Services {
	
	Interaction impl_interation;
	private static Pattern argPattern = Pattern.compile("(?<=\\()(.+?)(?=\\))");
	
	public List<ComboWidget> getComboWidgetCandidates(EObject object) {// 需改动
		List<ComboWidget> combowidgetCandidates = new ArrayList<ComboWidget>();
		for(ComboWidget gui: GuiUtils.getFactory().getMyComboWidget()) {
			combowidgetCandidates.add(gui.getCombowidget().get(0));
		}
		return combowidgetCandidates;
	}
	
	
	public boolean isGUI(EObject self) {
		return self instanceof GUI;
	}
	
	public boolean isComboWidget(EObject self) {
		return self instanceof ComboWidget;
	}
	
	public boolean isComboWidgetButCUI(EObject self) {
		return isComboWidget(self) && !isGUI(self);
	}
	
	public void addSelectedComboWidgetToLibrary(EObject selected) {
		System.out.println(selected);
		
		Session session = GuiUtils.getSession();

		ComboWidgetFactory factory = GuiUtils.getFactory();
		
		GUI cGUI = LIDLGUIFactory.eINSTANCE.createGUI();
		cGUI.getCombowidget().add((ComboWidget)EcoreUtil.copy(selected));
		
		
		factory.getMyComboWidget().add(cGUI);
		
		List<ComboWidget> components = factory.getMyComboWidget();
		ComolUtils.setProperIndex(components, (ComboWidget)cGUI);
		
		cGUI.setName("Com@ " + (int)cGUI.getIndex());
		
		
		RepresentationDescription combowidgetDiagram = null;
		Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), cGUI);
		
		for (RepresentationDescription description : representationDescriptions) {
			System.out.println(description.getName());
			if (description.getName().equals(GuiGlobalConfig.COMBOWIDGET_REPRESENTATION)) {
				combowidgetDiagram = description;
			}
		}
		
		DRepresentation representation = DialectManager.INSTANCE.createRepresentation(
				GuiGlobalConfig.COMBOWIDGET_IDENTIFIER+ cGUI.getIndex(), cGUI,
				combowidgetDiagram, session, new NullProgressMonitor());
		
		if (representation == null) {
			System.out.println("representation is null !!!");
		}
		else {
			System.out.print("There it is!");
			System.out.println(representation);
		}
		
		final DSemanticDiagram diagram = (DSemanticDiagram) representation;
		if (diagram.eAdapters().contains(NotYetOpenedDiagramAdapter.INSTANCE)) {
			diagram.eAdapters().remove(NotYetOpenedDiagramAdapter.INSTANCE);
		}
		
		DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());

		session.save(new NullProgressMonitor());
		return;
	}
	
	
	// Tool 调用, create MyPackage in MyModel(定义)
	public EObject addSelectedComboWidgetToGUI(EObject parent, ComboWidget child) {
		
		System.out.println("selected parent is " + parent.getClass());
		System.out.println("selected child is "  + child.getClass());
		
		ComboWidget selected = EcoreUtil.copy(child); // 复制，深拷贝
		
		if(parent instanceof GUI) {
			parent = (GUI) parent;
			((GUI) parent).getCombowidget().add(selected);
		}
		else if(parent instanceof ComboWidget) {
			parent = (ComboWidget) parent;
			((ComboWidget) parent).getCombowidget().add(selected);
		}
		
		
		return parent;
	}
	
	public void generateInteractionDiagram(EObject self, EObject obj) {
		System.out.println("Interaction Diagram Generating");
		
		Session session = GuiUtils.getSession();

		ComboWidgetFactory factory = GuiUtils.getFactory();
		
		Interaction impl_inter;
		
		ComboWidget selected = (ComboWidget) obj;
		
		DRepresentation representation = null;
		
		
		if(selected.getImplement_interaction().size()==0) {
			
			System.out.println("Create Interaction Diagram");
			
			impl_inter = LIDLGUIFactory.eINSTANCE.createInteraction();
			impl_inter.setName("");
			selected.getImplement_interaction().add(EcoreUtil.copy(impl_inter));
			factory.getInteraction_diagram().add(impl_inter);
			
			List<Interaction> interactions = factory.getInteraction_diagram();
			ComolUtils.setProperIndex(interactions, impl_inter);
			
			RepresentationDescription interactionDiagram = null;
			
			Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
					.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), impl_inter);
			
			for (RepresentationDescription description : representationDescriptions) {
				System.out.println(description.getName());
				if (description.getName().equals(GuiGlobalConfig.INTERACTION_DIAGRAM_REPRESENTATION)) {
					interactionDiagram = description;
				}
			}
			
			System.out.println(interactionDiagram);
			
			representation = DialectManager.INSTANCE.createRepresentation(
					GuiGlobalConfig.INTERACTION_DIAGRAM_IDENTIFIER+ (int)impl_inter.getIndex(), impl_inter,
					interactionDiagram, session, new NullProgressMonitor());
			
			selected.setInteractionURL(GuiGlobalConfig.INTERACTION_DIAGRAM_IDENTIFIER+ (int)impl_inter.getIndex());
			
			if (representation == null) {
				System.out.println("representation is null !!!");
			}
			else {
				System.out.print("There it is!");
				System.out.println(representation);
			}
			
			final DSemanticDiagram diagram = (DSemanticDiagram) representation;
			if (diagram.eAdapters().contains(NotYetOpenedDiagramAdapter.INSTANCE)) {
				diagram.eAdapters().remove(NotYetOpenedDiagramAdapter.INSTANCE);
			}
		}
		else {
			
			System.out.println("Search for Interaction Diagram");
			
			impl_inter =  selected.getImplement_interaction().get(0);
			String representationName = selected.getInteractionURL();
			
			Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
			
			for (DRepresentation inter : representations) {
				if (inter.getName().contains(representationName)) {
					representation = inter;
					break;
				}
			}
			
		}
		
		DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
		
		session.save(new NullProgressMonitor());
		
		System.out.println("Interaction Diagram Generated");
		return;
	}
    
	
	
	public boolean isTwoInterfaceBelongToDifferInteraction(EObject obj, Interface preSource, Interface preTarget) {
		Interaction p1 = (Interaction)preSource.eContainer();
		Interaction p2 = (Interaction)preTarget.eContainer();
		
		return !p1.equals(p2);
	}
	
	public void createInterfaceConnector(EObject obj, Interface source, Interface target) {
		InterfaceConnector intfConnector = LIDLGUIFactory.eINSTANCE.createInterfaceConnector();
		intfConnector.setSource(source);
		intfConnector.setTarget(target);
		
		Interaction parentInteraction = (Interaction)obj.eContainer().eContainer();
		parentInteraction.getInterfaceConnectors().add(intfConnector);
		if(target.getActualPar()==null || target.getActualPar().equals(""))
			target.setActualPar(source.getActualPar());
		else{
			target.setActualPar(getActualList(target));
		}
	}
	
	public static InteractionTable getInteractionTable() {
		
		Session session = GuiUtils.getSession();

		TableFactory factory = LidlTableUtils.getFactory();
		
		return factory.getInteractiontable().size()==0?LIDLGUIFactory.eINSTANCE.createInteractionTable():factory.getInteractiontable().get(0);
	}
	
	public List<Interaction> getInteractionDefinitions(EObject obj) {
		return getInteractionTable().getInteractions();
	}
	
	public boolean isInteraction(EObject obj) {
		return obj instanceof Interaction;
	}
	
	public boolean isInteractionTable(EObject obj) {
		return obj instanceof InteractionTable;
	}
	
	public void insertSelectedInteraction(Interaction parent, Interaction child) {
		System.out.println("Selected Interaction is "+child.getName());
		Interaction selected = EcoreUtil.copy(child);
		System.out.println(selected);
		parent.getCandidates_interactions().add(selected);
	}
	

	
	public Interaction copyInteraction(Interaction inter) {
		Interaction res = LIDLGUIFactory.eINSTANCE.createInteraction();
		res.setName(inter.getName());
		res.setLabel(inter.getLabel());
		res.setSignature(inter.getSignature());
		res.setExpression(inter.getExpression());
		res.setInterface(copyInterface(inter.getInterface()));
		for(Interface intfItm:inter.getSignature_interfaces()) {
			res.getSignature_interfaces().add(copyInterface(intfItm));
		}
		for(Interaction interItm:inter.getCandidates_interactions()) {
			res.getCandidates_interactions().add(copyInteraction(interItm));
		}
		return res;
	}
	
	public Interface copyInterface(Interface intf) {
		Interface res = LIDLGUIFactory.eINSTANCE.createInterface();
		res.setName(intf.getName());
		res.setScope(intf.getScope());
		res.setInterface(intf.getInterface());
		res.setLabel(intf.getLabel());
		res.setDirection(intf.getDirection());
		res.setDatatype(copyDatatype(intf.getDatatype()));
		
		for(Interface intfCandidate:intf.getCandidate_interfaces()) {
			res.getCandidate_interfaces().add(copyInterface(intfCandidate));
		}
		
		return res;
	}
	
	public Datatype copyDatatype(Datatype dtp) {
		Datatype res = LIDLGUIFactory.eINSTANCE.createDatatype();
		res.setName(dtp.getName());
		res.setLabel(dtp.getLabel());
		res.setDatatype(dtp.getDatatype());
		
		for(Datatype dtpCandidate:dtp.getCandidate_datatypes()) {
			res.getCandidate_datatypes().add(copyDatatype(dtpCandidate));
		}
		
		return res;
	}
	
	public List<Interaction> getInteractionInstanceCandidates(EObject self) {
		System.out.println(self);
		System.out.println(self.eContainer());
		return null;
	}
	
	public String getWidgetInteractionInstanceName(EObject self) {
		
		return "Item";
	}
	
	public String getInteractionInstanceName(EObject self, Interaction candidate) {
		return "";
	}
	
	public void generateLIDLCode(EObject obj) {
		String code="";
		System.out.println("Begin To Generate Code!");
		TableFactory factory = LidlTableUtils.getFactory();
		
		
		for(DatatypeTable datatypeTable : factory.getDatatypetable()) {
			code+=generateCodeFromDatatypeTable(datatypeTable);
//			System.out.println(datatypeTable);
//			System.out.println(generateCodeFromDatatypeTable(datatypeTable));
		}

		for(InterfaceTable interfaceTable : LidlTableUtils.getFactory().getInterfacetable()) {
			code+=generateCodeFromInterfaceTable(interfaceTable);
//			System.out.println(interfaceTable);
//			System.out.println(generateCodeFromInterfaceTable(interfaceTable));
		}
		
		for(InteractionTable interactionTable : LidlTableUtils.getFactory().getInteractiontable()) {
			code+=generateCodeFromInteractionTable(interactionTable);
//			System.out.println(interactionTable);
//			System.out.println(generateCodeFromInteractionTable(interactionTable));
		}
		
		exportCodeToFile(code);
		
		System.out.println("Code Generation Finished");
		
		return;
	}
	
	public static String generateCodeFromDatatypeTable(DatatypeTable datatypeTable) {
		String code = "";
		
		for(Datatype parent: datatypeTable.getDatatypes()) {
			code += "data\n  "+parent.getName()+"\nis\n  {\n";
			for(Datatype child : parent.getCandidate_datatypes()) {
				if(child.getDatatype()==MetaDatatype.COMPOSITE)
					code += "    "+child.getLabel()+": "+child.getName()+",\n";
				else
					code += "    "+child.getLabel()+": "+child.getDatatype().getLiteral()+",\n";
			}
			if(parent.getCandidate_datatypes()!=null && parent.getCandidate_datatypes().size()!=0)
				code = code.substring(0, code.length()-2);
			code += "\n  }\n\n";
		}
		return code;
	}
	
	public static String generateCodeFromInterfaceTable(InterfaceTable interfaceTable) {
		String atomIntfCode = "";
		String comboIntfCode = "";
		
		for(Interface parent: interfaceTable.getInterfaces()) {
			if(parent.getInterface()==MetaInterface.ATOMIC) {
				atomIntfCode += "interface\n  "+parent.getName()+"\nis\n  "+getDatatypeLiteral(parent.getDatatype())+" "+parent.getDirection()+"\n\n";
			}
			else {
				comboIntfCode += "interface\n  "+parent.getName()+"\nis\n  {\n";
				for(Interface child: parent.getCandidate_interfaces()) {
					if(child.getInterface()==MetaInterface.ATOMIC)
						comboIntfCode+="    "+child.getLabel()+": "+getDatatypeLiteral(child.getDatatype())+" "+child.getDirection()+",\n";
					else
						comboIntfCode+="    "+child.getLabel()+": "+child.getName()+",\n";
				}
				if(parent.getCandidate_interfaces()!=null && parent.getCandidate_interfaces().size()!=0)
					comboIntfCode = comboIntfCode.substring(0, comboIntfCode.length()-2);
				comboIntfCode += "\n  }\n\n";
			}
		}
		
		return  atomIntfCode+comboIntfCode;
	}
	
	public static String generateCodeFromInteractionTable(InteractionTable interactionTable) {
		String code = "";
		for(Interaction parent: interactionTable.getInteractions()) {
			System.out.println("My Interface is");
			System.out.println(parent.getInterface());
			code += "interaction\n  ("+getInteractionSignature(parent)+"): ";
			code += parent.getSignature_interfaces().get(0).getName()+"\nis\n  (\n";
			if(parent.getExpression()!=null) {
				String[] lines = parent.getExpression().split("\n");
				for(String line:lines) {
					code += "    "+line+"\n";
				}
			}
			else {
				code += "    \n";
			}
			code += "  )\n\n";
		}
		return code;
	}
	
	public static String getInteractionSignature(Interaction inter) {
		String signature = inter.getSignature();
		if(signature==null) return "";
		Matcher matcher = argPattern.matcher(signature);
		Map<String, String> map = new HashMap();
		
		for(Interface intf: inter.getSignature_interfaces()) {
			if(intf.getLabel()!=null) {
				map.put(intf.getLabel(), intf.getLabel()+": "+getSignatureInterfaceName(intf));
			}
		}
		
		
		while(matcher.find()) {
			String name = matcher.group();
			signature.replace("("+name+")", "("+map.get(name)+")");
		}
		
		return signature;
	}
	
	public static String getSignatureInterfaceName(Interface intf) {
		if(isSignatureInterface(intf)) return getInterfaceName(intf);
		else return "";
	}
	
	public static boolean isSignatureInterface(Interface intf) {
		return intf.eContainer() instanceof Interaction;
	}
	
	public static String getInterfaceName(Interface intf) {
		return intf.getName();
	}
	
	public static boolean isBasicDatatype(Datatype dtp) {
		return dtp.getDatatype()!=MetaDatatype.COMPOSITE;
	}
	
	public static String getDatatypeLiteral(Datatype data) {
		if(isBasicDatatype(data)) return data.getDatatype().getLiteral();
		else return data.getName();
	}
	
	public boolean isAtomInterface(Interface intf) {
		return intf.getInterface()==MetaInterface.ATOMIC;
	}
	
	public String getInterfaceLiteral(Interface intf) {
		if(isAtomInterface(intf)) return getDatatypeLiteral(intf.getDatatype())+" "+intf.getDirection();
		else return intf.getName();
	}
	
	public static void exportCodeToFile(String code) {
		System.out.println("line1");
		Locale.setDefault(Locale.ENGLISH);
		JFileChooser chooser = new JFileChooser();
		System.out.println("line2");
		//打开选择器面板
		int returnVal = chooser.showSaveDialog(new JPanel());  
		                      //保存文件从这里入手，输出的是文件名
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("你打开的文件夹是: " +
		    chooser.getSelectedFile().getPath());
		    String path = chooser.getSelectedFile().getPath();
		    try {
		    	File f = new File(path+".lidl");
		        System.out.println(f.getAbsolutePath());
		        f.createNewFile();
		        FileOutputStream out = new FileOutputStream(f);

 		        out.write(code.getBytes());
 		        out.close();
		    } catch (Exception e) {
		    	// TODO Auto-generated catch block
		    	System.out.println("There is something wrong");
		    	e.printStackTrace();
		    }
		}
	} 
	
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public static boolean isInIntf(Interface intf) {
		return intf.getDirection().getValue()==0;
	}
    
    public static boolean isOutIntf(Interface intf) {
		return intf.getDirection().getValue()==1;
	}
    
    
    
    public static boolean isInIntf2(Interface intf) {
		return intf.getDirection().getValue()==0 && !isNoRelation(intf);
	}
    
    public static boolean isOutIntf2(Interface intf) {
		return intf.getDirection().getValue()==1 && !isNoRelation(intf);
	}
    
    public static boolean isIOIntf(Interface intf) {
    	System.out.println(intf.getDirection().getValue());
    	System.out.println(intf.getDirection().getName());
    	
		return intf.getDirection().getValue()==2;
	}
    
    public static boolean isInGlobalIntf(Interface intf) {
		return intf.getDirection().getValue()==0 && intf.getScope().getValue()==0;
	}
    
    public static boolean isOutGlobalIntf(Interface intf) {
		return intf.getDirection().getValue()==1 && intf.getScope().getValue()==0;
	}
    public static boolean isIOGlobalIntf(Interface intf) {
		return intf.getDirection().getValue()==2 && intf.getScope().getValue()==0;
	}
    public static boolean isInLocalIntf(Interface intf) {
		return intf.getDirection().getValue()==0 && intf.getScope().getValue()==1;
	}
    
    public static boolean isOutLocalIntf(Interface intf) {
		return intf.getDirection().getValue()==1 && intf.getScope().getValue()==1;
	}
    public static boolean isIOLocalIntf(Interface intf) {
		return intf.getDirection().getValue()==2 && intf.getScope().getValue()==1;
	}
    
    
    public static boolean isGlobalIntf(Interface intf) {
		return intf.getScope().getValue()==0;
	}
    
    public static String getIntfNameOrLabel(Interface intf) {
		if(intf.getScope().getValue()==0)
			return intf.getName();
		else {
			if(intf.getActualPar()!=null)
				return intf.getActualPar();
			else
				return intf.getLabel();
		}
			
	}
    
    public static boolean isNoRelation(Interface intf) {
//    	System.out.println(intf.getFrom());
//    	System.out.println(intf.getTo());
//    	System.out.println(intf.getFrom().size()==0);
//    	System.out.println(intf.getTo()==null);
//    	System.out.println(intf.getFrom().size()==0 && intf.getTo().size()==0);
    	if(intf.getFrom().size()==0 && intf.getTo().size()==0)
    		return true;
    	else
    		return false;
	}
    
    public static boolean isButton(Interaction inter) {
    	return inter.getName().equals("Button");	
	}
    
    public static boolean isCounter(Interaction inter) {
    	return inter.getName().equals("Counter");	
	}
    
    public static boolean isDisplay(Interaction inter) {
    	return inter.getName().equals("NumberDisplay");	
	}
    
    public static String getConnectorSource(InterfaceConnector intfConnector) {
    	return "Interface "+intfConnector.getSource().getName();
    }
    
    public static String getConnectorTarget(InterfaceConnector intfConnector) {
    	return "Interface "+intfConnector.getTarget().getName();
    }
    
    public static List<String> getScopeList(Interface intf){
    	List<String> scopeList = Arrays.asList("Global","Local") ;
    	return scopeList;
    }
    
    public static String getScopeString(Interface intf) {
    	return intf.getScope().getName();
    }
    
    public static List<String> getDirectionList(Interface intf){
    	List<String> directionList = Arrays.asList("in","out","io","null") ;
    	return directionList;
    }
    
    public static String getDirectionString(Interface intf) {
    	return intf.getDirection().getName();
    }
    
    public static List<String> getInterfaceList(Interface intf){
    	List<String> typeList = Arrays.asList("Composite","Atomic","Simple") ;
    	return typeList;
    }
    
    public static String getInterfaceString(Interface intf) {
    	return intf.getInterface().getName();
    }
    
    public void generateInteractionDiagram2(EObject self, Interaction inter) {
    	System.out.println("aaaaaa");
    	Session session = GuiUtils.getSession();
		ComboWidgetFactory factory = GuiUtils.getFactory();
		Interaction impl_inter;
		impl_inter = LIDLGUIFactory.eINSTANCE.createInteraction();
		impl_inter.setName("Main");
		System.out.println("bbbbb");
		factory.getInteraction_diagram().add(impl_inter);
		System.out.println("ccccc");
		List<Interaction> interactions = factory.getInteraction_diagram();
		ComolUtils.setProperIndex(interactions, impl_inter);
		
		RepresentationDescription interactionDiagram = null;
		
		Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), impl_inter);
		
		for (RepresentationDescription description : representationDescriptions) {
			System.out.println(description.getName());
			if (description.getName().equals(GuiGlobalConfig.INTERACTION_DIAGRAM_REPRESENTATION)) {
				interactionDiagram = description;
			}
		}
		DRepresentation representation = null;
		representation = DialectManager.INSTANCE.createRepresentation(
				GuiGlobalConfig.INTERACTION_DIAGRAM_IDENTIFIER+ (int)impl_inter.getIndex(), impl_inter,
				interactionDiagram, session, new NullProgressMonitor());
		
		DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
		
		session.save(new NullProgressMonitor());
		
		System.out.println("Interaction Diagram Generated");
		return;
    }		
		
    public List<Interaction> getMainInteraction(EObject obj) {
    
    	Interaction impl_inter;
    	impl_inter = LIDLGUIFactory.eINSTANCE.createInteraction();
    	impl_inter.setName("Main");
    	List<Interaction>  interList = getInteractionTable().getInteractions();
    	List<Interaction>  interList2 = new ArrayList<>();
       	System.out.println(interList.size());
      	System.out.println(interList2.size());
    	for(int i=0;i<interList.size();i++) {
    		System.out.println(interList.get(i).getName());
    		if(interList.get(i).getName().equals("MainUI")) {
    			System.out.println(i);
    			interList2.add(interList.get(i));
    		}
    	}
    	System.out.println(interList.size());
      	System.out.println(interList2.size());
		return interList2;
	}
  
    public String displaySource(EObject obj) {
    	Interface intf = (Interface) obj;
    	List<InterfaceConnector> list = intf.getTo();
    	String ret = "";
    	for(int i=0;i<list.size();i++) {
    		ret += list.get(i).getSource().getLabel() ;
    		if(i!=list.size()-1)
    			ret += ", ";
    	}
    	System.out.println(ret);
    	return ret;
    }
    
    public String displayTarget(EObject obj) {
    	Interface intf = (Interface) obj;
    	List<InterfaceConnector> list = intf.getFrom();
    	String ret = "";
    	for(int i=0;i<list.size();i++) {
    		ret += list.get(i).getTarget().getLabel();
    		if(i!=list.size()-1)
    			ret += ", ";
    	}
    	System.out.println(ret);
    	return ret;
    }
    
    public void changeActualPar(Interface intf, String str) {
    	intf.setActualPar(str);
    	
    	if(intf.getFrom().size()>1 || intf.getTo().size()>1) {
    		return;
    	}
    	else {
    		for(int i=0;i<intf.getFrom().size();i++){
        		intf.getFrom().get(i).getTarget().setActualPar(getActualList(intf.getFrom().get(i).getTarget()));
        	}
        	for(int i=0;i<intf.getTo().size();i++){
        		intf.getTo().get(i).getSource().setActualPar(getActualList(intf.getTo().get(i).getSource()));
        	}
    	}
    	
//    	if(intf.getFrom()!=null) {
//    		List<InterfaceConnector> listFrom = intf.getFrom();
//    		for(int i=0;i<listFrom.size();i++) {
//    			listFrom.get(i).getTarget().setActualPar(str);
//    		}
//    	}
//    	if(intf.getTo()!=null) {
//    		List<InterfaceConnector> listTo = intf.getTo();
//    		for(int i=0;i<listTo.size();i++) {
//    			listTo.get(i).getSource().setActualPar(str);
//    		}
//    	}
    }
    public String getActualList(Interface intf) {
    	String actual = "";
    	for(int i=0;i<intf.getFrom().size();i++) {
    		if(i!=0) {
    			actual+=" or ";
    		}
    		actual+=intf.getFrom().get(i).getTarget().getActualPar();
    	}
    	for(int i=0;i<intf.getTo().size();i++) {
    		if(i!=0) {
    			actual+=" or ";
    		}
    		actual+=intf.getTo().get(i).getSource().getActualPar();
    	}
    	System.out.println(actual);
    	return actual;
    }
    public void setInteractionLabel(Interaction inter, String str) {
    	inter.setLabel(str);
    }

}
