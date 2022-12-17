package lab.buaa.software.lidl.postprocessor;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor;

@SuppressWarnings("all")
public class LidlEcorePostProcessor implements IXtext2EcorePostProcessor {
  @Override
  public void process(final GeneratedMetamodel metamodel) {
    this.process(metamodel.getEPackage());
  }
  
  public void process(final EPackage p) {
    Iterable<EClass> _filter = Iterables.<EClass>filter(p.getEClassifiers(), EClass.class);
    for (final EClass la : _filter) {
      {
        String _name = la.getName();
        boolean _equals = Objects.equal(_name, "LidlInteraction");
        if (_equals) {
          this.handleInteractionDef(la);
          this.handleInteractionDefSimple(la);
        }
        String _name_1 = la.getName();
        boolean _equals_1 = Objects.equal(_name_1, "IDPart");
        if (_equals_1) {
          this.handleIDPart(la);
        }
        String _name_2 = la.getName();
        boolean _equals_2 = Objects.equal(_name_2, "TextIDPart");
        if (_equals_2) {
          this.handleTextPart(la);
          this.handleTextPartSimple(la);
        }
        String _name_3 = la.getName();
        boolean _equals_3 = Objects.equal(_name_3, "ParamIDPart");
        if (_equals_3) {
          this.handleParamPart(la);
          this.handleParamPartSimple(la);
        }
      }
    }
  }
  
  public boolean handleInteractionDef(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("getName");
      op.setEType(EcorePackage.eINSTANCE.getEString());
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EObject _create = EcoreFactory.eINSTANCE.create(
        EcorePackage.eINSTANCE.getEStringToStringMapEntry());
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("String s = \"\";");
      _builder.newLine();
      _builder.append("for(int i=0;i<getId().getItems().size();i++)");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s+=getId().getItems().get(i).toString();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("return s;");
      _builder.newLine();
      map.setValue(_builder.toString());
      body.getDetails().add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
  
  public boolean handleTextPart(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("toString");
      op.setEType(EcorePackage.eINSTANCE.getEString());
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EObject _create = EcoreFactory.eINSTANCE.create(
        EcorePackage.eINSTANCE.getEStringToStringMapEntry());
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return getText();");
      _builder.newLine();
      map.setValue(_builder.toString());
      body.getDetails().add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
  
  public boolean handleParamPart(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("toString");
      op.setEType(EcorePackage.eINSTANCE.getEString());
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EObject _create = EcoreFactory.eINSTANCE.create(
        EcorePackage.eINSTANCE.getEStringToStringMapEntry());
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return \"(\"+getLabel()+\":\"+getInterface()+\")\";");
      _builder.newLine();
      map.setValue(_builder.toString());
      body.getDetails().add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
  
  public boolean handleInteractionDefSimple(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("getName");
      op.setEType(EcorePackage.eINSTANCE.getEString());
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EObject _create = EcoreFactory.eINSTANCE.create(
        EcorePackage.eINSTANCE.getEStringToStringMapEntry());
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("String s = \"\";");
      _builder.newLine();
      _builder.append("for(int i=0;i<getId().getItems().size();i++)");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s+=getId().getItems().get(i).toStringSimple();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("return s;");
      _builder.newLine();
      map.setValue(_builder.toString());
      body.getDetails().add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
  
  public boolean handleTextPartSimple(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("toStringSimple");
      op.setEType(EcorePackage.eINSTANCE.getEString());
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EObject _create = EcoreFactory.eINSTANCE.create(
        EcorePackage.eINSTANCE.getEStringToStringMapEntry());
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return getText();");
      _builder.newLine();
      map.setValue(_builder.toString());
      body.getDetails().add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
  
  public boolean handleParamPartSimple(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("toStringSimple");
      op.setEType(EcorePackage.eINSTANCE.getEString());
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EObject _create = EcoreFactory.eINSTANCE.create(
        EcorePackage.eINSTANCE.getEStringToStringMapEntry());
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return \"()\";");
      _builder.newLine();
      map.setValue(_builder.toString());
      body.getDetails().add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
  
  public boolean handleIDPart(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("toStringSimple");
      op.setEType(EcorePackage.eINSTANCE.getEString());
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EObject _create = EcoreFactory.eINSTANCE.create(
        EcorePackage.eINSTANCE.getEStringToStringMapEntry());
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return \"\";");
      _builder.newLine();
      map.setValue(_builder.toString());
      body.getDetails().add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
}
