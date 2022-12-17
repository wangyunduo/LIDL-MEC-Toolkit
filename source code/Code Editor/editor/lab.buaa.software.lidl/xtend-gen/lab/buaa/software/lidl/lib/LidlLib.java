package lab.buaa.software.lidl.lib;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.InputStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LidlLib {
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  public static final String MAIN_LIB = "lidl/lang/data.lidl";
  
  public ResourceSet loadLib() {
    ResourceSet _xblockexpression = null;
    {
      final InputStream stream = this.getClass().getClassLoader().getResourceAsStream(LidlLib.MAIN_LIB);
      if ((stream == null)) {
        InputOutput.<String>println("error main lib not found");
      }
      ResourceSet _get = this.resourceSetProvider.get();
      final Procedure1<ResourceSet> _function = (ResourceSet resourceSet) -> {
        try {
          final Resource resource = resourceSet.createResource(URI.createURI(LidlLib.MAIN_LIB));
          resource.load(stream, resourceSet.getLoadOptions());
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(_get, _function);
    }
    return _xblockexpression;
  }
}
