package lab.buaa.software.lidl.tests


import com.google.inject.Inject
import lab.buaa.software.lidl.lidl.LidlProgram
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static lab.buaa.software.lidl.tests.LidlTestUtil.*

@ExtendWith(InjectionExtension)
@InjectWith(LidlInjectorProvider)
class LidlDataFormatterTest {
	@Inject extension ParseHelper<LidlProgram>
	@Inject extension FormatterTestHelper;

	def dataLib() {
		dataLibRaw.parse.eResource.resourceSet
	}

	/**
	 * Test Utility
	 */
	def void assertFormattedAs(CharSequence input, CharSequence expected) {
		assertFormatted[
			toBeFormatted = input
			expectation = expected
		]
	}

	@Test
	def void testSimpleData() {
		'''
			data d is Number
		'''.assertFormattedAs(
			'''
			data
				d
			is
				Number
			
			'''
		)
	}
	
	@Test
	def void testCompositeData() {
		'''
			data point is {x:Number, y:Number}
		'''.assertFormattedAs(
			'''
			data
				point
			is
			{
				x: Number,
				y: Number
			}
			
			'''
		)
	}
	
	@Test
	def void testSimpleInf() {
		'''
			interface d is Number out
		'''.assertFormattedAs(
			'''
			interface
				d
			is
				Number out
			
			'''
		)
	}
	
	@Test
	def void test() {
		'''
			import lidl.lang.*;
			interaction
				(Counter Start From(theConst: Number in) Output
			(theResult: Number out)): Activation in
			is
			(
			    (All
			        ((theResult) = (y))
			        ((y) = ((Previous(y))+(1)))
			    )
			    With Behaviour
			    (Make (y) Is A Flow Initially (theConst))
			)
			interaction 
				(test) : Activation out 
			is (active)
		'''.assertFormattedAs(
			'''
			import lidl.lang.*;
			
			interaction
				(Counter Start From( theConst : Number in ) Output
			( theResult : Number out )) : Activation in
			is
			(
				(All
			        ((theResult) = (y))
			        ((y) = ((Previous(y))+(1)))
			    )
			    With Behaviour
			    (Make (y) Is A Flow Initially (theConst))
			)
			
			interaction 
				(test) : Activation out
			is
			(
				active
			)
			
			'''
		)
	}
	
	@Test
	def void test2() {
		'''
			import lidl.lang.*;
			interface
							Behaviour
						is
							Activation in
			interaction
				(Counter Start From (theConst : Number in) Output 
			(theResult: Number out )): Behaviour
			is
			(
			    (All
			        ((theResult) = (y))
			        ((y) = ((Previous(y))+(1)))
			    )
			    With Behaviour
			    (Make (y) Is A Flow Initially (theConst))
			)
		'''.assertFormattedAs(
			'''
			import lidl.lang.*;
			
			interface
				Behaviour
			is
				Activation in
			
			interaction
				(Counter Start From (theConst: Number in) Output 
			(theResult: Number out)): Behaviour
			is
			(
				(All
			        ((theResult) = (y))
			        ((y) = ((Previous(y))+(1)))
			    )
			    With Behaviour
			    (Make (y) Is A Flow Initially (theConst))
			)
			
			'''
		)
	}
}
