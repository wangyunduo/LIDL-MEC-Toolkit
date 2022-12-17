/*
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.ide

import com.google.inject.Guice
import lab.buaa.software.lidl.LidlRuntimeModule
import lab.buaa.software.lidl.LidlStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LidlIdeSetup extends LidlStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LidlRuntimeModule, new LidlIdeModule))
	}
	
}
