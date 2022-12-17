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
class LidlDataParsingTest {
	@Inject extension ParseHelper<LidlProgram>
	@Inject extension ValidationTestHelper

	def dataLib() {
		dataLibRaw.parse.eResource.resourceSet
	}

	@Test
	def void dataSimpleDefinition() {
		'''
			package default;
			data
				MyData1
			is
				lidl.lang.Text
			
			data
				MyData2
			is
				lidl.lang.Number
			
			data
				MyData3
			is
				lidl.lang.Boolean
			
			data
				MyData4
			is
				lidl.lang.Activation
		'''.parse(dataLib).assertNoErrors
	}

	@Test
	def void dataNestedDefinition() {
		val p = '''
			package default;
			data
				MyData
			with
				data 
					MyAnotherData 
				with
					data MyNestedData is Number
				is
				{
					x:MyNestedData
					y:Boolean
				}
			is
			{
				attr1 : MyAnotherData
				attr2 : Text
			}
		'''.parse(dataLib)
		p.assertNoErrors
	}

	@Test
	def void dataComplexDefinition() {
		val p = '''
			package default;
			import lidl.lang.*;
			data
				MyData
			with
				data MyAnotherData is Text
			is
			{
				attr1 : MyAnotherData,
				attr2 : Text
			}
		'''.parse(dataLib)
		p.assertNoErrors
	}

	@Test
	def void dataArrayDefinition() {
		val p = '''
			package default;
			import lidl.lang.*;
			
			data
				AlarmState
			is
				Text
			
			data
				Rover
			is
				Boolean
			
			data
				TroubleShootingStep
			is
				Number
			
			data 
				Alarm
			with
				data Date is Text
			is
			{
				message:Text,
				severity:Number,
				date:Date,
				state:AlarmState,
				rovers:Rover,
				steps:TroubleShootingStep
			}
		'''.parse(dataLib)
		p.assertNoErrors
	}
}
