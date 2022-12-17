/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.TableFactory#getInteractiontable <em>Interactiontable</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.TableFactory#getInterfacetable <em>Interfacetable</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.TableFactory#getDatatypetable <em>Datatypetable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getTableFactory()
 * @model
 * @generated
 */
public interface TableFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Interactiontable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.InteractionTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactiontable</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getTableFactory_Interactiontable()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionTable> getInteractiontable();

	/**
	 * Returns the value of the '<em><b>Interfacetable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.InterfaceTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacetable</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getTableFactory_Interfacetable()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceTable> getInterfacetable();

	/**
	 * Returns the value of the '<em><b>Datatypetable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.DatatypeTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypetable</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getTableFactory_Datatypetable()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatatypeTable> getDatatypetable();

} // TableFactory
