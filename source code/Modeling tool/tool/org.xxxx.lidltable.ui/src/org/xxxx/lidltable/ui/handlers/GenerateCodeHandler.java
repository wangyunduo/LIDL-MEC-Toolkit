package org.xxxx.lidltable.ui.handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.LIDLGUI.Datatype;
import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.Interface;
import org.eclipse.sirius.LIDLGUI.InterfaceTable;
import org.eclipse.sirius.LIDLGUI.MetaDatatype;
import org.eclipse.sirius.LIDLGUI.MetaInterface;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.utils.ComolUtils;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;

public class GenerateCodeHandler extends AbstractHandler  {
	
	private static Pattern argPattern = Pattern.compile("(?<=\\()(.+?)(?=\\))");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
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
		
		return null;
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
}


