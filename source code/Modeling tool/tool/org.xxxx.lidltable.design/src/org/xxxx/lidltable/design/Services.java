package org.xxxx.lidltable.design;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.LIDLGUI.*;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
	private ArrayList<Datatype> datatypeDefinitions = new ArrayList<Datatype>();
	
	private static Set<String> datatypeSet = new HashSet<String>(); // datatype
	
	private static boolean isCheckPassed = true;
	private static String  checkErrorLog = new String();
	private static Pattern argPattern = Pattern.compile("(?<=\\()(.+?)(?=\\))");
	
//	private static Map<String, EObject> allElement = new HashMap<>();
//	static {
//		InterfaceTable intfTable = LidlTableUtils.getFactory().getInterfacetable().get(0);
//		for(Interface intfDef : intfTable.getInterfaces()) {
//			allElement.put(intfDef.getName(),intfDef);
//		}
//	}
	
	
	public boolean checkStringEmpty(EObject obj, String value) {
		return null == value || value.trim().length()==0;
	}
	
	public String blankThenDefault(EObject obj, String value, String defaultValue) {
		return checkStringEmpty(obj, value)? defaultValue:value;
	}
	
	
	// datatype
	public boolean isDatatype(EObject obj) {
		return obj instanceof Datatype;
	}
	
	public boolean isBasicDatatype(Datatype dtp) {
		return dtp.getDatatype()!=MetaDatatype.COMPOSITE;
	}
	
	public boolean isBasicDatatype(EObject obj) {
		return isDatatype(obj)&&isBasicDatatype((Datatype)obj);
	}
	
	public boolean isComboDatatype(Datatype dtp) {
		return dtp.getDatatype()==MetaDatatype.COMPOSITE;
	}
	
	public boolean isComboDatatype(EObject obj) {
		return isDatatype(obj)&&isComboDatatype((Datatype)obj);
	}
	
	public boolean isCandidateComboDatatype(Datatype dtp) {
		return isCandidateDatatype(dtp) && isComboDatatype(dtp);
	}
	
	public boolean isCandidateComboDatatype(EObject obj) {
		return isDatatype(obj) && isCandidateComboDatatype((Datatype)obj);
	}
	
	public boolean isDatatypeTableItem(EObject obj) {
		return obj instanceof DatatypeTable;
	}
	
	
	public boolean isDatatypeItem(EObject obj) {
		return obj instanceof Datatype;
	}
	
	public boolean isTopDatatype(EObject obj) {
		return obj instanceof Datatype && (obj.eContainer() instanceof DatatypeTable);
	}
	
	public boolean isCandidateDatatype(EObject obj) {
		return obj instanceof Datatype && ! (obj.eContainer() instanceof DatatypeTable);
	}
	
	public boolean isCompositeDatatype(EObject obj) {
		Datatype candidate = (Datatype) obj;
		return candidate.getDatatype()==MetaDatatype.COMPOSITE;
	}
	
	public String getDatatypeLiteral(Datatype data) {
		if(isBasicDatatype(data)) return data.getDatatype().getLiteral();
		else return data.getName();
	}
	
	public String getDatatypeName(Datatype data) {
		if(isBasicDatatype(data)) return data.getDatatype().getLiteral();
		else return data.getName();
	}
	
	public void setAtomInterfaceComboDatatype(Interface intf, String newValue) {
		intf.getDatatype().setName(newValue);
	}
	
	public String newCandidateDatatypeLabel(Datatype candidate_datatype) {
		Datatype datatype = (Datatype) candidate_datatype.eContainer();
		return "label@"+datatype.getCandidate_datatypes().size();
	}
	
	public void createNewDatatype(EObject object) {
		Datatype datatype = LIDLGUIFactory.eINSTANCE.createDatatype();
		// 将数据类型添加到当前功能函数表中
		DatatypeTable dtb = (DatatypeTable) object;
		String name = "name@"+(dtb.getDatatypes().size()+1);
		datatype.setName(name);
		datatypeSet.add(name);
		dtb.getDatatypes().add(datatype);
	}
	
	
	
	public EObject editDatatypeName(Datatype datatype, String name) {
		datatype.setName(name);
		return datatype;
	}
	
	public EObject editDatatypeLabel(Datatype datatype, String label) {
		datatype.setLabel(label);
		return datatype;
	}
	
	
	public String cadidateDatatypeLabel(EObject obj) {
		return isCandidateDatatype(obj)?
				blankThenDefault(obj, ((Datatype) obj).getLabel(), "")
				:
				"";
	}
	
	public String cadidateDatatypeName(EObject obj) {
		if(!isCandidateDatatype(obj))
			return "";
		MetaDatatype candidate = ((Datatype) obj).getDatatype();
		return candidate==MetaDatatype.COMPOSITE?blankThenDefault(obj, ((Datatype) obj).getName(), ""):candidate.getLiteral();
	}
	
	public List<MetaDatatype> getMetaDatatypeCandidates(EObject obj) {
		MetaDatatype[] gets = new MetaDatatype[]{MetaDatatype.COMPOSITE, MetaDatatype.NUMBER, MetaDatatype.TEXT, MetaDatatype.BOOLEAN, MetaDatatype.ACTIVATION};;
		ArrayList<MetaDatatype> candidates = new ArrayList<MetaDatatype> (Arrays.asList(gets));
		return candidates;
	}
	
	public List<String> getDatatypeCandidates(Datatype dtp) {
		
		ArrayList<String> datatypeDefinitionsName = new ArrayList<String>();
		
		DatatypeTable dtpTable = LidlTableUtils.getFactory().getDatatypetable().get(0);
		
		for(Datatype dtpDef : dtpTable.getDatatypes()) {
			if(!dtpDef.equals(dtp.eContainer())) {
				datatypeDefinitionsName.add(dtpDef.getName());
			}
		}
		return datatypeDefinitionsName;
	}
	
	public List<String> getDatatypeCandidates(Interface intf) {
		
		ArrayList<String> datatypeDefinitionsName = new ArrayList<String>();
		
		DatatypeTable dtpTable = LidlTableUtils.getFactory().getDatatypetable().get(0);
		
		for(Datatype dtpDef : dtpTable.getDatatypes()) {
			datatypeDefinitionsName.add(dtpDef.getName());
		}
		return datatypeDefinitionsName;
	}
	
	public String getMetaDatatypeLabel(MetaDatatype mdtp) {
		return mdtp.getLiteral();
	}
	
	public boolean checkMultipleName(EObject self, String str) {
		boolean isRepeated = datatypeSet.contains(str);
		if(!isRepeated) {
			datatypeSet.add(str);
			Datatype cur = (Datatype)self;
			datatypeSet.remove(cur.getName());
			cur.setName(str);
			
			System.out.println("Inside Set:");
			for(String s:datatypeSet)
				System.out.println(s);
		}
		return isRepeated;
	}
	
	public void removeDatatypeName(EObject self) {
		Datatype cur = (Datatype)self;
		datatypeSet.remove(cur.getName());
	}
	
	
	
	// interface
	
	public boolean isInterface(EObject obj) {
		return obj instanceof Interface;
	}
	
	public boolean isAtomInterface(Interface intf) {
		return intf.getInterface()==MetaInterface.ATOMIC;
	}
	
	public boolean isAtomInterface(EObject obj) {
		return isInterface(obj) && isAtomInterface((Interface)obj);
	}
	
	public boolean isComboInterface(Interface intf) {
		return intf.getInterface()==MetaInterface.COMPOSITE;
	}
	
	public boolean isComboInterface(EObject obj) {
		return isInterface(obj) && isComboInterface((Interface)obj);
	}
	
	public boolean isSignatureInterface(Interface intf) {
		return intf.eContainer() instanceof Interaction;
	}
	
	public boolean isSignatureInterface(EObject obj) {
		return isInterface(obj)&&isSignatureInterface((Interface)obj);
	}
	
	public String parIntfName(Interface intf) {
		if (isSignatureInterface(intf)&&intf.getScope()==Scope.LOCAL)
			// Local interface parameter
			return "Parameter interface " + intf.getLabel();
		else
			// Global interface
			return "Interface " + intf.getName();
	}
	
	public String parIntfGroup(Interface intf) {
		if (isSignatureInterface(intf)&&intf.getScope()==Scope.LOCAL)
			// Local interface parameter
			return "Configure parameter interface";
		else
			// Global interface
			return "Configure interaction interface";
	}
	
	public String nameInterfaceHelp(Interface intf) {
		if (isSignatureInterface(intf)&&intf.getScope()==Scope.LOCAL)
			// Local interface parameter
			return "Naming the interface parameter";
		else
			// Global interface
			return "";
	}
	
	public void deleteParameterIntf(Interface intf) {
		Interaction ia = (Interaction)intf.eContainer();
		System.out.println(ia.getSignature_interfaces().toString());
		ia.getSignature_interfaces().remove(intf);
		System.out.println(ia.getSignature_interfaces().toString());
	}
	
	public boolean isNameInterface(Interface intf) {
		return isSignatureInterface(intf)&&intf.getScope()==Scope.LOCAL;
	}
	
	public boolean isGlobalInterface(Interface intf) {
		return isSignatureInterface(intf)&&intf.getScope()==Scope.GLOBAL;
	}
	
	public boolean isNameInterface(EObject obj) {
		return isInterface(obj)&&isNameInterface((Interface)obj);
	}
	
	public boolean isNameAtomInterface(Interface intf) {
		return isNameInterface(intf)&&isAtomInterface(intf);
	}
	
	public boolean isNameAtomInterface(EObject obj) {
		return isInterface(obj)&&isNameAtomInterface((Interface)obj);
	}
	
	public boolean isNameComboInterface(Interface intf) {
		return isNameInterface(intf)&&isComboInterface(intf);
	}
	
	public boolean isNameComboInterface(EObject obj) {
		return isInterface(obj)&&isNameComboInterface((Interface)obj);
	}
	
	public boolean isInteractionInterface(Interface intf) {
		return isSignatureInterface(intf)&&intf.getScope()==Scope.GLOBAL;
	}
	
	public boolean isInteractionInterface(EObject obj) {
		return isInterface(obj)&&isInteractionInterface((Interface)obj);
	}
	
	public boolean isInterfaceTable(EObject obj) {
		return obj instanceof InterfaceTable;
	}
	
	public boolean isInterfaceDefinition(Interface intf) {
		return isInterfaceTable(intf.eContainer());
	}
	
	public boolean isInterfaceDefinition(EObject obj) {
		return isInterface(obj)&&isInterfaceDefinition((Interface)obj);
	}
	
	public boolean isCandidateInterface(Interface intf) {
		return intf.eContainer() instanceof Interface;
	}
	
	public boolean isCandidateInterface(EObject obj) {
		return isInterface(obj)&&isCandidateInterface((Interface)obj);
	}
	
	public boolean isCandidateAtomInterface(Interface intf) {
		return isCandidateInterface(intf)&&isAtomInterface(intf);
	}
	
	public boolean isCandidateAtomInterface(EObject obj) {
		return isInterface(obj)&&isCandidateAtomInterface((Interface)obj);
	}
	
	public boolean isCandidateComboInterface(Interface intf) {
		return isCandidateInterface(intf)&&isComboInterface(intf);
	}
	
	public boolean isCandidateComboInterface(EObject obj) {
		return isInterface(obj)&&isCandidateComboInterface((Interface)obj);
	}
	
	public boolean isAtomInterfaceDefinition(Interface intf) {
		return isAtomInterface(intf)&&isInterfaceDefinition(intf);
	}
	
	public boolean isAtomInterfaceDefinition(EObject obj) {
		return isInterface(obj)&&isAtomInterfaceDefinition((Interface)obj);
	}
	
	public boolean isComboInterfaceDefinition(Interface intf) {
		return isComboInterface(intf)&&isInterfaceDefinition(intf);
	}
	
	public boolean isComboInterfaceDefinition(EObject obj) {
		return isInterface(obj)&&isComboInterface((Interface)obj);
	}
	
	public Collection<Interface> getAtomInterfaces(EObject obj) {
		if(!isInterfaceTable(obj)) return null;
		
		Collection<Interface> res = new ArrayList<Interface>();
		for(Interface intf : ((InterfaceTable) obj).getInterfaces()) {
			if(isAtomInterface(intf)) {
				res.add(intf);
			}
		}
		return res;
	}
	
	public boolean isAtomInterfaceDatatypeBasicDatatype(Interface intf) {
		return isBasicDatatype(intf.getDatatype());
	}
	
	public boolean isAtomInterfaceDatatypeComboDatatype(Interface intf) {
		return isComboDatatype(intf.getDatatype());
	}
	
	public List<String> getInterfaceCandidates(Interface intf) {
		
		ArrayList<String> interfaceDefinitionsName = new ArrayList<String>();
		
		InterfaceTable intfTable = LidlTableUtils.getFactory().getInterfacetable().get(0);
		
		for(Interface intfDef : intfTable.getInterfaces()) {
			if(!intfDef.equals(intf.eContainer())) {
				interfaceDefinitionsName.add(intfDef.getName());
			}
		}
		return interfaceDefinitionsName;
	}
	
	public List<String> getInteractionInterfaceCandidates(Interface intf) {
		
		ArrayList<String> interfaceDefinitionsName = new ArrayList<String>();
		
		InterfaceTable intfTable = LidlTableUtils.getFactory().getInterfacetable().get(0);
		
		for(Interface intfDef : intfTable.getInterfaces()) {
			interfaceDefinitionsName.add(intfDef.getName());
		}
		return interfaceDefinitionsName;
	}
	
	public String getComboInterfaceTableLineLabel(Interface intf) {
		// For consistency with the data type definition table, 
		// no distinction is made here between atomic and composite interfaces
		if(isAtomInterface(intf)) return "Member " + intf.getLabel();
		return "Member " + intf.getLabel();
	}
	
	public Collection<Interface> getComboInterfaces(EObject obj) {
		if(!isInterfaceTable(obj)) return null;
		
		Collection<Interface> res = new ArrayList<Interface>();
		for(Interface intf : ((InterfaceTable) obj).getInterfaces()) {
			if(isComboInterface(intf)) {
				res.add(intf);
			}
		}
		return res;
	}
	
	public String getCandidateInterfaceLabel(Interface intf) {
		if(isCandidateInterface(intf)) return intf.getLabel();
		else return "";
	}
	
	public String getCandidateInterfaceLabel(EObject obj) {
		if(isInterface(obj)) return getCandidateInterfaceLabel((Interface)obj);
		else return "";
	}
	
	public String getCandidateInterfaceName(Interface intf) {
		if(isAtomInterface(intf)) return getDatatypeName(intf.getDatatype());
		else if(isCandidateComboInterface(intf)) return intf.getName();
		else return "";
	}
	
	public String getCandidateInterfaceName(EObject obj) {
		if(isInterface(obj)) return getCandidateInterfaceName((Interface)obj);
		else return "";
	}
	
	public String getAtomInterfaceDirection(Interface intf) {
		if(isAtomInterface(intf)) {
			return intf.getDirection().getLiteral();
		}
		return "";
	}
	
	public String getAtomInterfaceDirection(EObject obj) {
		if(isInterface(obj)) return getAtomInterfaceDirection((Interface)obj);
		else return "";
	}
	
	public MetaDatatype getAtomInterfaceDatatypeMetaDatatype(Interface intf) {
		return intf.getDatatype().getDatatype();
	}
	
	public String getAtomInterfaceDatatypeName(Interface intf) {
		return getDatatypeName(intf.getDatatype());
	}
	
	public List<Direction> getInterfaceDirectionCandidates(Interface itm) {
		Direction[] gets = new Direction[]{Direction.IN, Direction.OUT};
		ArrayList<Direction> candidates = new ArrayList<Direction> (Arrays.asList(gets));
		return candidates;
	}

	public String getInterfaceCandidateDirectionLabel(Direction candidate) {
		return candidate==Direction.IN?"in":"out";
	}
	
	
	public void setAtomInterfaceDatatypeMetaDatatype(Interface intf,MetaDatatype newValue) {
		intf.getDatatype().setDatatype(newValue);
	}
	
	public void setAtomInterfaceDatatypeNewName(EObject obj, String name) {
		if(!isAtomInterface(obj)) return;
		//	System.out.println(name);
		Interface intfm = (Interface)obj;
		//	System.out.println(intfm.getDatatype());
		intfm.getDatatype().setName(name);
	}
	

	
	public void createNewAtomInterfaceDefinition(EObject obj) {
		
		if(!isInterfaceTable(obj)) return;
		
		Interface interf = LIDLGUIFactory.eINSTANCE.createInterface();
		interf.setInterface(MetaInterface.ATOMIC);
		
		Datatype dtp = LIDLGUIFactory.eINSTANCE.createDatatype();
		dtp.setDatatype(MetaDatatype.ACTIVATION);
		interf.setDatatype(dtp);
		
		InterfaceTable itb = (InterfaceTable) obj;
		interf.setName("MyInterface@"+(itb.getInterfaces().size()+1));
		itb.getInterfaces().add(interf);
	}
	
	
	public void createNewComboInterfaceDefinition(EObject obj) {
		
		if(!isInterfaceTable(obj)) return;
		
		Interface interf = LIDLGUIFactory.eINSTANCE.createInterface();
		interf.setInterface(MetaInterface.COMPOSITE);
		
		InterfaceTable itb = (InterfaceTable) obj;
		interf.setName("MyInterface@"+(itb.getInterfaces().size()+1));
		itb.getInterfaces().add(interf);
	}

	public void createNewCandidateAtomInterface(EObject obj) {
		
		 if(!isComboInterfaceDefinition(obj)) return;

		 Interface intfDef = (Interface)obj;
		 Interface intf    = LIDLGUIFactory.eINSTANCE.createInterface();
		 
		 int index = intfDef.getCandidate_interfaces().size()+1;
		 intf.setLabel("label@"+index);
		 intf.setInterface(MetaInterface.ATOMIC);
		 
		 Datatype dtp = LIDLGUIFactory.eINSTANCE.createDatatype();
		 dtp.setDatatype(MetaDatatype.ACTIVATION);
		 intf.setDatatype(dtp);
		 
		 intfDef.getCandidate_interfaces().add(intf);
	}
	
	public void createNewCandidateComboInterface(EObject obj) {
		
		 if(!isComboInterfaceDefinition(obj)) return;

		 Interface intfDef = (Interface)obj;
		 Interface intf    = LIDLGUIFactory.eINSTANCE.createInterface();
		 
		 int index = intfDef.getCandidate_interfaces().size()+1;
		 intf.setLabel("label@"+index);
		 intf.setInterface(MetaInterface.COMPOSITE);
		 intfDef.getCandidate_interfaces().add(intf);
	}
	
	
	// interaction container interface
	public boolean checkInteraction(EObject obj, EObject container) {
		return isInteraction(container);
	}
	
	// interaction
	// interaction is
		public boolean isInteraction(EObject obj) {
			return obj instanceof Interaction;
		}
		
		public boolean isInteractionTable(EObject obj) {
			return obj instanceof InteractionTable;
		}
		
		
		// datatype get
		public String getInterfaceName(Interface intf) {
			return intf.getName();
		}
		
		public String getInterfaceLiteral(Interface intf) {
			if(isAtomInterface(intf)) return getDatatypeLiteral(intf.getDatatype())+" "+intf.getDirection();
			else return intf.getName();
		}
		
		public String getSignatureInterfaceName(Interface intf) {
			if(isSignatureInterface(intf)) return getInterfaceName(intf);
			else return "";
		}
		
		public String getSignatureInterfaceName(EObject obj) {
			if(isInterface(obj)) return getSignatureInterfaceName((Interface)obj);
			else return "";
		}
		
		
		
		public void createInteractionDefinition(EObject obj) {
			if(!isInteractionTable(obj)) return;
			
			InteractionTable interTable = (InteractionTable)obj;
			
			Datatype data  = LIDLGUIFactory.eINSTANCE.createDatatype();
			
			
			Interface intf = LIDLGUIFactory.eINSTANCE.createInterface();
			intf.setScope(Scope.GLOBAL);
			intf.setDatatype(data);
			intf.setDirection(Direction.IN);
			
			Interaction inter = LIDLGUIFactory.eINSTANCE.createInteraction();
			inter.setName("MyInteraction@"+(interTable.getInteractions().size()+1));
			inter.setInterface(intf);
			inter.getSignature_interfaces().add(intf);
			
			interTable.getInteractions().add(inter);
			
		}
		
		public void createNewInteractionArgument(EObject obj) {
			if(!isInteraction(obj)) return;
			
			Interaction inter = (Interaction)obj;
			
			Datatype data  = LIDLGUIFactory.eINSTANCE.createDatatype();
			data.setDatatype(MetaDatatype.ACTIVATION);
			
			Interface intf = LIDLGUIFactory.eINSTANCE.createInterface();
			
			int index = inter.getSignature_interfaces().size()+1;
			
			intf.setLabel("label@" + index);
			
			intf.setScope(Scope.LOCAL);
			intf.setInterface(MetaInterface.ATOMIC);
			intf.setDatatype(data);
			intf.setDirection(Direction.IN);
			
			inter.getSignature_interfaces().add(intf);
		}
		
		
		public void checkInteractionArguments(Interaction inter) {
			checkErrorLog = "";
			String signature = inter.getSignature();
			Matcher matcher = argPattern.matcher(signature);
			
			Set<String>  argNameDef = new HashSet<String>();
			for(Interface intf: inter.getSignature_interfaces()) {
				String label = intf.getLabel();
				if(label!=null)
					argNameDef.add(label);
			}
			System.out.println(argNameDef);
			
			
			Set<String> argNameUse = new HashSet<String>();
			while(matcher.find()) {
				String name = matcher.group();
				
				if(name.contains(" ")) {
					System.out.println(name+"should not contain space");
					isCheckPassed = false;
					checkErrorLog ="Spaces in parameter name(s)"+"\n";
					break;
				}
				
				if(!argNameDef.contains(name)) {
					System.out.println(name+"is Not Defined");
					isCheckPassed = false;
					checkErrorLog ="Parameter " + name + " undefined\n";
					break;
				}
				
				if( argNameUse.contains(name)) {
					System.out.println(name+" is Duplicated");
					isCheckPassed = false;
					checkErrorLog ="Parameter " + name + " duplicated\n";
					break;
				}
				argNameUse.add(name);
			}
			return;
		}
		
		public boolean isCheckPassed(EObject self) {
			return isCheckPassed;
		}
		
		public boolean isCheckError(EObject self) {
			boolean isCheckError = !isCheckPassed;
			isCheckPassed = true;
			return isCheckError;
		}
		
		public String getCheckError(EObject self) {
			System.out.println(checkErrorLog);
			return checkErrorLog;
		}
		
		public String getInteractionSignature(Interaction inter)
		{
			return inter.getSignature().replace('\n', ' ');
		}
		
		public String getInteractionExpression(Interaction inter)
		{
			return inter.getExpression().replace('\n', ' ');
		}
	
	
	/**
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    **/
	    public void changeInterface(EObject obj,String str ) {
	    	InterfaceTable intfTable1 = LidlTableUtils.getFactory().getInterfacetable().get(0);
			for(Interface intfDef : intfTable1.getInterfaces()) {
				System.out.println(intfDef.getName());
				System.out.println(intfDef.getDatatype());
			}
	    	System.out.println(obj);
	    	Interface intf = (Interface) obj;
	    	System.out.println(str);
	    	Map<String, EObject> allElement = new HashMap<>();
			InterfaceTable intfTable = LidlTableUtils.getFactory().getInterfacetable().get(0);
			for(Interface intfDef : intfTable.getInterfaces()) {
				allElement.put(intfDef.getName(),intfDef);
			}
	    	Interface srcIntf =  (Interface) allElement.get(str);
//	    	String tempLabel = intf.getLabel();
//	    	Scope tempScope = intf.getScope();
	    	intf.setDirection(srcIntf.getDirection());
	    	intf.setName(srcIntf.getName());
	    	intf.setInterface(srcIntf.getInterface());
	    	
	    	
	    }
	    
	    public void changeComboInterface(EObject obj,String str ) {
	    	System.out.println(obj);
	    	System.out.println(str);
	    	
	    	Interface intf = (Interface) obj;
	    	MetaInterface meta = MetaInterface.COMPOSITE;
	    	intf.setInterface(meta);
	    	Map<String, EObject> allElement = new HashMap<>();
			InterfaceTable intfTable = LidlTableUtils.getFactory().getInterfacetable().get(0);
			for(Interface intfDef : intfTable.getInterfaces()) {
				allElement.put(intfDef.getName(),intfDef);
			}
	    	Interface srcIntf =  (Interface) allElement.get(str);
	    	
	    	System.out.println(srcIntf);
	    	
	    	intf.setDirection(srcIntf.getDirection());
	    	intf.setName(srcIntf.getName());
	    	
	    	System.out.println(intf);
	    	
	    	updateDirection(obj,srcIntf.getDirection());
	    	
	    }
	    
	    public void updateDirection(EObject obj, Direction direction) {
	    	
	    	Interface intf = (Interface) obj.eContainer();
	    	Interface atomIntf = (Interface) obj;
	    	atomIntf.setDirection(direction);
	    	System.out.println("the interface is :" + intf);
	    	List<Interface> listIntf = intf.getCandidate_interfaces();
	    	System.out.println("the interfaceList is :" + listIntf);
	    	int key = 0;
	    	int in = 0;
	    	int out = 0;
	    	for(int i = 0; i < listIntf.size(); i++) {
	    		if(listIntf.get(i).getDirection().getName().equals("in")) {
	    			in = 1;
	    			key++;
	    			break;
	    		}
	    	}
	    	for(int i = 0; i < listIntf.size(); i++) {
	    		if(listIntf.get(i).getDirection().getName().equals("out")) {
	    			out = 1;
	    			key++;
	    			break;
	    		}
	    	}
	    	if(key==1 && in==1)
	    		intf.setDirection(Direction.IN);
	    	if(key==1 && out==1)
	    		intf.setDirection(Direction.OUT);
	    	if(key==2)
	    		intf.setDirection(Direction.IO);
	    	System.out.println("the interface is :" + intf);
	  
	    }
}
