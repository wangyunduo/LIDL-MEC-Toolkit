package lab.buaa.software.lidl.postprocessor

import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.BasicEMap

class LidlEcorePostProcessor implements IXtext2EcorePostProcessor {

	override process(GeneratedMetamodel metamodel) {
		metamodel.EPackage.process
	}

	def process(EPackage p) {
		for (la : p.EClassifiers.filter(typeof(EClass))) {
			if (la.name == "LidlInteraction") {
				la.handleInteractionDef
				la.handleInteractionDefSimple
			}
			if (la.name == "IDPart")
			{
				la.handleIDPart
			}
			if (la.name == "TextIDPart") {
				la.handleTextPart
				la.handleTextPartSimple
			}
			if (la.name == "ParamIDPart")
			{
				la.handleParamPart
				la.handleParamPartSimple
			}
		}
	}

	def handleInteractionDef(EClass c) {
		val op = EcoreFactory::eINSTANCE.createEOperation
		op.name = "getName"
		op.EType = EcorePackage::eINSTANCE.EString
		val body = EcoreFactory::eINSTANCE.createEAnnotation
		body.source = GenModelPackage::eNS_URI
		val map = EcoreFactory::eINSTANCE.create(
			EcorePackage::eINSTANCE.EStringToStringMapEntry) as BasicEMap$Entry<String, String>
		map.key = "body"
		map.value = '''
			String s = "";
			for(int i=0;i<getId().getItems().size();i++)
			{
				s+=getId().getItems().get(i).toString();
			}
			return s;
		'''
		body.details.add(map)
		op.EAnnotations += body
		c.EOperations += op
	}

	def handleTextPart(EClass c) {
		val op = EcoreFactory::eINSTANCE.createEOperation
		op.name = "toString"
		op.EType = EcorePackage::eINSTANCE.EString
		val body = EcoreFactory::eINSTANCE.createEAnnotation
		body.source = GenModelPackage::eNS_URI
		val map = EcoreFactory::eINSTANCE.create(
			EcorePackage::eINSTANCE.EStringToStringMapEntry) as BasicEMap$Entry<String, String>
		map.key = "body"
		map.value = '''
			return getText();
		'''
		body.details.add(map)
		op.EAnnotations += body
		c.EOperations += op
	}
	
	def handleParamPart(EClass c) {
		val op = EcoreFactory::eINSTANCE.createEOperation
		op.name = "toString"
		op.EType = EcorePackage::eINSTANCE.EString
		val body = EcoreFactory::eINSTANCE.createEAnnotation
		body.source = GenModelPackage::eNS_URI
		val map = EcoreFactory::eINSTANCE.create(
			EcorePackage::eINSTANCE.EStringToStringMapEntry) as BasicEMap$Entry<String, String>
		map.key = "body"
		map.value = '''
			return "("+getLabel()+":"+getInterface()+")";
		'''
		body.details.add(map)
		op.EAnnotations += body
		c.EOperations += op
	}

	def handleInteractionDefSimple(EClass c)
	{
		val op = EcoreFactory::eINSTANCE.createEOperation
		op.name = "getName"
		op.EType = EcorePackage::eINSTANCE.EString
		val body = EcoreFactory::eINSTANCE.createEAnnotation
		body.source = GenModelPackage::eNS_URI
		val map = EcoreFactory::eINSTANCE.create(
			EcorePackage::eINSTANCE.EStringToStringMapEntry) as BasicEMap$Entry<String, String>
		map.key = "body"
		map.value = '''
			String s = "";
			for(int i=0;i<getId().getItems().size();i++)
			{
				s+=getId().getItems().get(i).toStringSimple();
			}
			return s;
		'''
		body.details.add(map)
		op.EAnnotations += body
		c.EOperations += op
	}
	
	def handleTextPartSimple(EClass c)
	{
		val op = EcoreFactory::eINSTANCE.createEOperation
		op.name = "toStringSimple"
		op.EType = EcorePackage::eINSTANCE.EString
		val body = EcoreFactory::eINSTANCE.createEAnnotation
		body.source = GenModelPackage::eNS_URI
		val map = EcoreFactory::eINSTANCE.create(
			EcorePackage::eINSTANCE.EStringToStringMapEntry) as BasicEMap$Entry<String, String>
		map.key = "body"
		map.value = '''
			return getText();
		'''
		body.details.add(map)
		op.EAnnotations += body
		c.EOperations += op
	}
	
	def handleParamPartSimple(EClass c)
	{
		val op = EcoreFactory::eINSTANCE.createEOperation
		op.name = "toStringSimple"
		op.EType = EcorePackage::eINSTANCE.EString
		val body = EcoreFactory::eINSTANCE.createEAnnotation
		body.source = GenModelPackage::eNS_URI
		val map = EcoreFactory::eINSTANCE.create(
			EcorePackage::eINSTANCE.EStringToStringMapEntry) as BasicEMap$Entry<String, String>
		map.key = "body"
		map.value = '''
			return "()";
		'''
		body.details.add(map)
		op.EAnnotations += body
		c.EOperations += op
	}
	
	def handleIDPart(EClass c)
	{
		val op = EcoreFactory::eINSTANCE.createEOperation
		op.name = "toStringSimple"
		op.EType = EcorePackage::eINSTANCE.EString
		val body = EcoreFactory::eINSTANCE.createEAnnotation
		body.source = GenModelPackage::eNS_URI
		val map = EcoreFactory::eINSTANCE.create(
			EcorePackage::eINSTANCE.EStringToStringMapEntry) as BasicEMap$Entry<String, String>
		map.key = "body"
		map.value = '''
			return "";
		'''
		body.details.add(map)
		op.EAnnotations += body
		c.EOperations += op
	}
}
