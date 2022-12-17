package lab.buaa.software.lidl.tests;

import com.google.inject.Inject;
import lab.buaa.software.lidl.lidl.LidlProgram;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(LidlInjectorProvider.class)
@SuppressWarnings("all")
public class LidlDataFormatterTest {
  @Inject
  @Extension
  private ParseHelper<LidlProgram> _parseHelper;
  
  @Inject
  @Extension
  private FormatterTestHelper _formatterTestHelper;
  
  public ResourceSet dataLib() {
    try {
      return this._parseHelper.parse(LidlTestUtil.dataLibRaw()).eResource().getResourceSet();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Test Utility
   */
  public void assertFormattedAs(final CharSequence input, final CharSequence expected) {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      it.setToBeFormatted(input);
      it.setExpectation(expected);
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
  
  @Test
  public void testSimpleData() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("data d is Number");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("data");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("d");
    _builder_1.newLine();
    _builder_1.append("is");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Number");
    _builder_1.newLine();
    _builder_1.newLine();
    this.assertFormattedAs(_builder, _builder_1);
  }
  
  @Test
  public void testCompositeData() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("data point is {x:Number, y:Number}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("data");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("point");
    _builder_1.newLine();
    _builder_1.append("is");
    _builder_1.newLine();
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("x: Number,");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("y: Number");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    this.assertFormattedAs(_builder, _builder_1);
  }
  
  @Test
  public void testSimpleInf() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("interface d is Number out");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("interface");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("d");
    _builder_1.newLine();
    _builder_1.append("is");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Number out");
    _builder_1.newLine();
    _builder_1.newLine();
    this.assertFormattedAs(_builder, _builder_1);
  }
  
  @Test
  public void test() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import lidl.lang.*;");
    _builder.newLine();
    _builder.append("interaction");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(Counter Start From(theConst: Number in) Output");
    _builder.newLine();
    _builder.append("(theResult: Number out)): Activation in");
    _builder.newLine();
    _builder.append("is");
    _builder.newLine();
    _builder.append("(");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("(All");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("((theResult) = (y))");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("((y) = ((Previous(y))+(1)))");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("With Behaviour");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("(Make (y) Is A Flow Initially (theConst))");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    _builder.append("interaction ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(test) : Activation out ");
    _builder.newLine();
    _builder.append("is (active)");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import lidl.lang.*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("interaction");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("(Counter Start From( theConst : Number in ) Output");
    _builder_1.newLine();
    _builder_1.append("( theResult : Number out )) : Activation in");
    _builder_1.newLine();
    _builder_1.append("is");
    _builder_1.newLine();
    _builder_1.append("(");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("(All");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("((theResult) = (y))");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("((y) = ((Previous(y))+(1)))");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append(")");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("With Behaviour");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("(Make (y) Is A Flow Initially (theConst))");
    _builder_1.newLine();
    _builder_1.append(")");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("interaction ");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("(test) : Activation out");
    _builder_1.newLine();
    _builder_1.append("is");
    _builder_1.newLine();
    _builder_1.append("(");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("active");
    _builder_1.newLine();
    _builder_1.append(")");
    _builder_1.newLine();
    _builder_1.newLine();
    this.assertFormattedAs(_builder, _builder_1);
  }
  
  @Test
  public void test2() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import lidl.lang.*;");
    _builder.newLine();
    _builder.append("interface");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Behaviour");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("is");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Activation in");
    _builder.newLine();
    _builder.append("interaction");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(Counter Start From (theConst : Number in) Output ");
    _builder.newLine();
    _builder.append("(theResult: Number out )): Behaviour");
    _builder.newLine();
    _builder.append("is");
    _builder.newLine();
    _builder.append("(");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("(All");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("((theResult) = (y))");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("((y) = ((Previous(y))+(1)))");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("With Behaviour");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("(Make (y) Is A Flow Initially (theConst))");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import lidl.lang.*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("interface");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Behaviour");
    _builder_1.newLine();
    _builder_1.append("is");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Activation in");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("interaction");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("(Counter Start From (theConst: Number in) Output ");
    _builder_1.newLine();
    _builder_1.append("(theResult: Number out)): Behaviour");
    _builder_1.newLine();
    _builder_1.append("is");
    _builder_1.newLine();
    _builder_1.append("(");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("(All");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("((theResult) = (y))");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("((y) = ((Previous(y))+(1)))");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append(")");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("With Behaviour");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("(Make (y) Is A Flow Initially (theConst))");
    _builder_1.newLine();
    _builder_1.append(")");
    _builder_1.newLine();
    _builder_1.newLine();
    this.assertFormattedAs(_builder, _builder_1);
  }
}
