package lab.buaa.software.lidl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static lab.buaa.software.lidl.tests.LidlTestUtil.*
import lab.buaa.software.lidl.lidl.LidlProgram

@ExtendWith(InjectionExtension)
@InjectWith(LidlInjectorProvider)
class LidlInterfaceParsingTest {
	@Inject extension ParseHelper<LidlProgram>
	@Inject extension ValidationTestHelper

	def dataLib() {
		dataLibRaw.parse.eResource.resourceSet
	}

	@Test
	def void interfaceSimpleDefinition() {
		'''
			package default;
			interface
				MyInterface1
			is
				Text in
			
			interface
				MyInterface2
			is
				Number out
			
			interface
				MyInterface3
			is
				Boolean in
			
			interface
				MyInterface4
			is
				Activation out
		'''.parse(dataLib).assertNoErrors
	}

	@Test
	def void interfaceNestedDefinition() {
		val p = '''
			package default;
			interface
				MyInterface
			with
				interface 
					MyAnotherInterface
				with
					interface MyNestedInterface is Number out
				is
				{
					x:MyNestedInterface,
					y:Boolean in
				}
			is
			{
				attr1 : MyAnotherInterface,
				attr2 : Text out
			}
		'''.parse(dataLib)
		p.assertNoErrors
	}

	@Test
	def void interfaceComplexDefinition() {
		val p = '''
			package default;
			import lidl.lang.*;
			
			data
				Date
			is
				Text
			
			interface
				MyInterface
			with
				interface MyAnotherInterface is Date out
			is
			{
				attr1 : MyAnotherInterface,
				attr2 : Text in
			}
		'''.parse(dataLib)
		p.assertNoErrors
	}
}
