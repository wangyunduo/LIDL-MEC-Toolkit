/*
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LidlStandaloneSetup extends LidlStandaloneSetupGenerated {

	def static void doSetup() {
		new LidlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
