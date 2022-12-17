package lab.buaa.software.lidl.tests;

import com.google.inject.Inject;
import lab.buaa.software.lidl.lidl.LidlProgram;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(LidlInjectorProvider.class)
@SuppressWarnings("all")
public class LidlInterfaceParsingTest {
  @Inject
  @Extension
  private ParseHelper<LidlProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  public ResourceSet dataLib() {
    try {
      return this._parseHelper.parse(LidlTestUtil.dataLibRaw()).eResource().getResourceSet();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void interfaceSimpleDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package default;");
      _builder.newLine();
      _builder.append("interface");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyInterface1");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Text in");
      _builder.newLine();
      _builder.newLine();
      _builder.append("interface");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyInterface2");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Number out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("interface");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyInterface3");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Boolean in");
      _builder.newLine();
      _builder.newLine();
      _builder.append("interface");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyInterface4");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Activation out");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void interfaceNestedDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package default;");
      _builder.newLine();
      _builder.append("interface");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyInterface");
      _builder.newLine();
      _builder.append("with");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("interface ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("MyAnotherInterface");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("with");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("interface MyNestedInterface is Number out");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("x:MyNestedInterface,");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("y:Boolean in");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr1 : MyAnotherInterface,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr2 : Text out");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final LidlProgram p = this._parseHelper.parse(_builder, this.dataLib());
      this._validationTestHelper.assertNoErrors(p);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void interfaceComplexDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package default;");
      _builder.newLine();
      _builder.append("import lidl.lang.*;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Date");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Text");
      _builder.newLine();
      _builder.newLine();
      _builder.append("interface");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyInterface");
      _builder.newLine();
      _builder.append("with");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("interface MyAnotherInterface is Date out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr1 : MyAnotherInterface,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr2 : Text in");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final LidlProgram p = this._parseHelper.parse(_builder, this.dataLib());
      this._validationTestHelper.assertNoErrors(p);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
