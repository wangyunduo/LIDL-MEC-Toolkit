/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Table Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.DatatypeTableFactory#getDatatypetables <em>Datatypetables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatypeTableFactory()
 * @model
 * @generated
 */
public interface DatatypeTableFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatypetables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.DatatypeTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypetables</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatypeTableFactory_Datatypetables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatatypeTable> getDatatypetables();

} // DatatypeTableFactory
