package lab.buaa.software.lidl.tests;

import com.google.inject.Inject;
import java.util.function.Consumer;
import lab.buaa.software.lidl.lib.LidlLib;
import lab.buaa.software.lidl.lidl.LidlProgram;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(LidlInjectorProvider.class)
@SuppressWarnings("all")
public class LidlLibTest {
  @Inject
  @Extension
  private ParseHelper<LidlProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private LidlLib _lidlLib;
  
  @Test
  public void testImplicitImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("data C");
    _builder.newLine();
    _builder.append("is Text");
    _builder.newLine();
    this._validationTestHelper.assertNoErrors(this.loadLibAndParse(_builder));
  }
  
  @Test
  public void testLibHasNoError() {
    this.loadLibrary();
  }
  
  private LidlProgram loadLibAndParse(final CharSequence sequence) {
    try {
      return this._parseHelper.parse(sequence, this.loadLibrary());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private ResourceSet loadLibrary() {
    ResourceSet _loadLib = this._lidlLib.loadLib();
    final Procedure1<ResourceSet> _function = (ResourceSet it) -> {
      final Consumer<Resource> _function_1 = (Resource it_1) -> {
        this._validationTestHelper.assertNoErrors(it_1.getContents().get(0));
      };
      it.getResources().forEach(_function_1);
    };
    return ObjectExtensions.<ResourceSet>operator_doubleArrow(_loadLib, _function);
  }
}
