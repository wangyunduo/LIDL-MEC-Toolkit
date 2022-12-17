package lab.buaa.software.lidl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static extension lab.buaa.software.lidl.tests.LidlTestUtil.*
import lab.buaa.software.lidl.lidl.LidlProgram

@ExtendWith(InjectionExtension)
@InjectWith(LidlInjectorProvider)
class LidlPackageParsingTest {
	@Inject extension ParseHelper<LidlProgram>
	@Inject extension ValidationTestHelper

	def dataLib() {
		dataLibRaw.parse.eResource.resourceSet
	}

	@Test
	def void dataLibParsing() {
		dataLibRaw.parse.assertNoErrors
	}
}
