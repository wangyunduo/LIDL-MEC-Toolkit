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
public class LidlInteractionParsingTest {
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
  public void simpleDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface1): Number out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("( 1 )");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface2): Text out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("( \"hello\" )");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface3): Activation out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("( active )");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface4): Activation out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("( inactive )");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface5): Boolean out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("( false )");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface6): Boolean out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("( true )");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void complexDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("(My Simple User Interface (a:Number in) (b:Text out) ): {x: Activation in, y: Boolean out}");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("( My Another User Interface )");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("( My Another User Interface (txt: Text in) ): Text out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("( txt )");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void nestedDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("(My Simple User Interface (a:Number in) (b:Text out) ): {x: Activation in, y: Boolean out}");
      _builder.newLine();
      _builder.append("with");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("( My Another User Interface (txt: Text in) ): Text out");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("is");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("( txt )");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("( My Another User Interface )");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void case1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface(x:Number in) And (y:Number in)): Number out");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("(z)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("With Behaviour");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("(Apply (function addOne) To (x,y) And Get (z) )");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(")");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void case2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import lidl.lang.*;");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface(theConst: Number in) (theResult: Number out)): Activation in");
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
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void case3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import lidl.lang.*;");
      _builder.newLine();
      _builder.append("interaction");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(My Simple User Interface(theConst: Number in) (theResult: Number out)): Activation in");
      _builder.newLine();
      _builder.append("is");
      _builder.newLine();
      _builder.append("(");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("(reset).Test");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder, this.dataLib()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
