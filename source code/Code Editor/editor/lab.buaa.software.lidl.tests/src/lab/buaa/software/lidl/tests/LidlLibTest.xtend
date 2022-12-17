package lab.buaa.software.lidl.tests

import org.eclipse.xtext.testing.util.ParseHelper
import lab.buaa.software.lidl.lib.LidlLib
import org.junit.jupiter.api.Test
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import com.google.inject.Inject
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import lab.buaa.software.lidl.lidl.LidlProgram

@ExtendWith(InjectionExtension)
@InjectWith(LidlInjectorProvider)
class LidlLibTest {
	@Inject extension ParseHelper<LidlProgram>
	@Inject extension ValidationTestHelper
	@Inject extension LidlLib

	@Test def void testImplicitImports() {
		'''
			data C
			is Text
		'''.loadLibAndParse.assertNoErrors
	}

	@Test def void testLibHasNoError() {
		loadLibrary
	}

	def private loadLibAndParse(CharSequence sequence) {
		sequence.parse(loadLibrary)
	}

	def private loadLibrary() {
		loadLib => [
			resources.forEach[contents.get(0).assertNoErrors]
		]
	}

}
