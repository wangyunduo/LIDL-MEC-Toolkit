package lab.buaa.software.lidl.lib

import org.eclipse.emf.ecore.resource.ResourceSet
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI

class LidlLib {
	@Inject Provider<ResourceSet> resourceSetProvider
	public val static MAIN_LIB = "lidl/lang/data.lidl"

	def loadLib() {
		val stream = getClass().getClassLoader().getResourceAsStream(MAIN_LIB)
		if(stream === null)
			println("error main lib not found")
		resourceSetProvider.get() => [ resourceSet |
			val resource = resourceSet.createResource(URI::createURI(MAIN_LIB))
			resource.load(stream, resourceSet.getLoadOptions())
		]
	}
}