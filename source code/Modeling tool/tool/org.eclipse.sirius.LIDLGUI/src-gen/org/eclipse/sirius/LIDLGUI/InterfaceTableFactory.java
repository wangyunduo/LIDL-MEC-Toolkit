/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Table Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.InterfaceTableFactory#getInterfacetables <em>Interfacetables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterfaceTableFactory()
 * @model
 * @generated
 */
public interface InterfaceTableFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfacetables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.InterfaceTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacetables</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterfaceTableFactory_Interfacetables()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceTable> getInterfacetables();

} // InterfaceTableFactory
