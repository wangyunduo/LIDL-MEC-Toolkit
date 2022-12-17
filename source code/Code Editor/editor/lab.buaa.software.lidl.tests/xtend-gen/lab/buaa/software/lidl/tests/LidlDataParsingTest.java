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
public class LidlDataParsingTest {
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
  public void dataSimpleDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package default;");
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyData1");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("lidl.lang.Text");
      _builder.newLine();
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyData2");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("lidl.lang.Number");
      _builder.newLine();
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyData3");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("lidl.lang.Boolean");
      _builder.newLine();
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyData4");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("lidl.lang.Activation");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void dataNestedDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package default;");
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyData");
      _builder.newLine();
      _builder.append("with");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("data ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("MyAnotherData ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("with");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("data MyNestedData is Number");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("x:MyNestedData");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("y:Boolean");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr1 : MyAnotherData");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr2 : Text");
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
  public void dataComplexDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package default;");
      _builder.newLine();
      _builder.append("import lidl.lang.*;");
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyData");
      _builder.newLine();
      _builder.append("with");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("data MyAnotherData is Text");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr1 : MyAnotherData,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr2 : Text");
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
  public void dataArrayDefinition() {
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
      _builder.append("AlarmState");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Text");
      _builder.newLine();
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Rover");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Boolean");
      _builder.newLine();
      _builder.newLine();
      _builder.append("data");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TroubleShootingStep");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Number");
      _builder.newLine();
      _builder.newLine();
      _builder.append("data ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Alarm");
      _builder.newLine();
      _builder.append("with");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("data Date is Text");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("message:Text,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("severity:Number,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("date:Date,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("state:AlarmState,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("rovers:Rover,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("steps:TroubleShootingStep");
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
