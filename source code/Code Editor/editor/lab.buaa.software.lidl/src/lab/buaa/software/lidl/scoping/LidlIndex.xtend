package lab.buaa.software.lidl.scoping

import com.google.inject.Inject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import lab.buaa.software.lidl.lidl.LidlPackage

class LidlIndex {
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer$Manager cm

	def getVisibleEObjectDescriptions(EObject o) {
		o.getVisibleContainers.map [ container |
			container.getExportedObjects
		].flatten
	}

	def getVisibleEObjectDescriptions(EObject o, EClass type) {
		o.getVisibleContainers.map [ container |
			container.getExportedObjectsByType(type)
		].flatten
	}

	def getVisibleDataDescriptions(EObject o) {
		o.getVisibleEObjectDescriptions(LidlPackage::eINSTANCE.lidlData)
	}

	def getVisibleContainers(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.URI)
		cm.getVisibleContainers(rd, index)
	}
}
