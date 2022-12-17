/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Widget Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getMyComboWidget <em>My Combo Widget</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getGui <em>Gui</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getInteraction_diagram <em>Interaction diagram</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidgetFactory()
 * @model
 * @generated
 */
public interface ComboWidgetFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>My Combo Widget</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.ComboWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Combo Widget</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidgetFactory_MyComboWidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComboWidget> getMyComboWidget();

	/**
	 * Returns the value of the '<em><b>Gui</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.GUI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidgetFactory_Gui()
	 * @model containment="true"
	 * @generated
	 */
	EList<GUI> getGui();

	/**
	 * Returns the value of the '<em><b>Interaction diagram</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction diagram</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidgetFactory_Interaction_diagram()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getInteraction_diagram();

} // ComboWidgetFactory
