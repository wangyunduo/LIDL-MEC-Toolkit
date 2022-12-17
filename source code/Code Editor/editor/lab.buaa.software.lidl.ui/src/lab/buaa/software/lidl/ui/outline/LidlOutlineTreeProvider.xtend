/*
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import lab.buaa.software.lidl.lidl.TypeElement
import lab.buaa.software.lidl.lidl.LidlInteractionID

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class LidlOutlineTreeProvider extends DefaultOutlineTreeProvider {
	def _isLeaf(TypeElement te)
	{
		true
	}
	
	def _isLeaf(LidlInteractionID te)
	{
		true
	}
}