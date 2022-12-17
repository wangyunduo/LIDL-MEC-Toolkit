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
class LidlInteractionParsingTest {
	@Inject extension ParseHelper<LidlProgram>
	@Inject extension ValidationTestHelper

	def dataLib() {
		dataLibRaw.parse.eResource.resourceSet
	}
	
	@Test
	def void simpleDefinition() {
		'''
			interaction
			  (My Simple User Interface1): Number out
			is
			  ( 1 )
			  
			interaction
			  (My Simple User Interface2): Text out
			is
			  ( "hello" )
			  
			interaction
			  (My Simple User Interface3): Activation out
			is
			  ( active )
			  
			interaction
			  (My Simple User Interface4): Activation out
			is
			  ( inactive )
			  
			interaction
			  (My Simple User Interface5): Boolean out
			is
			  ( false )
			  
			interaction
			  (My Simple User Interface6): Boolean out
			is
			  ( true )
		'''.parse(dataLib).assertNoErrors
	}
	
	@Test
	def void complexDefinition() {
		'''
			interaction
				(My Simple User Interface (a:Number in) (b:Text out) ): {x: Activation in, y: Boolean out}
			is
				( My Another User Interface )
			  
			interaction
				( My Another User Interface (txt: Text in) ): Text out
			is
				( txt )
		'''.parse(dataLib).assertNoErrors
	}
	
	@Test
	def void nestedDefinition() {
		'''
			interaction
				(My Simple User Interface (a:Number in) (b:Text out) ): {x: Activation in, y: Boolean out}
			with
			    interaction
			    	( My Another User Interface (txt: Text in) ): Text out
			    is
			    	( txt )
			is
				( My Another User Interface )
			  
		'''.parse(dataLib).assertNoErrors
	}
	

	@Test
	def void case1() {
		'''
			interaction
			  (My Simple User Interface(x:Number in) And (y:Number in)): Number out
			is
			  (
			    (z)
			    With Behaviour
			    (Apply (function addOne) To (x,y) And Get (z) )
			  )
		'''.parse(dataLib).assertNoErrors
	}
	
	@Test
	def void case2() {
		'''
			import lidl.lang.*;
			interaction
			  (My Simple User Interface(theConst: Number in) (theResult: Number out)): Activation in
			is
			(
			    (All
			        ((theResult) = (y))
			        ((y) = ((Previous(y))+(1)))
			    )
			    With Behaviour
			    (Make (y) Is A Flow Initially (theConst))
			)
		'''.parse(dataLib).assertNoErrors
	}
	
	@Test
	def void case3() {
		'''
			import lidl.lang.*;
			interaction
			  (My Simple User Interface(theConst: Number in) (theResult: Number out)): Activation in
			is
			(
			    (reset).Test
			)
		'''.parse(dataLib).assertNoErrors
	}
}
