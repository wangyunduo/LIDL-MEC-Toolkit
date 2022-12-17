/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIFactory
 * @model kind="package"
 * @generated
 */
public interface LIDLGUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LIDLGUI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/LIDLGUI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LIDLGUI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LIDLGUIPackage eINSTANCE = org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.WidgetImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 31;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IMPLEMENT_INTERACTION = 0;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl <em>Combo Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getComboWidget()
	 * @generated
	 */
	int COMBO_WIDGET = 22;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET__IMPLEMENT_INTERACTION = WIDGET__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Basicwidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET__BASICWIDGET = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Combowidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET__COMBOWIDGET = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET__INDEX = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET__NAME = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interaction URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET__INTERACTION_URL = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Combo Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Combo Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.GUIImpl <em>GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.GUIImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getGUI()
	 * @generated
	 */
	int GUI = 0;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__IMPLEMENT_INTERACTION = COMBO_WIDGET__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Basicwidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__BASICWIDGET = COMBO_WIDGET__BASICWIDGET;

	/**
	 * The feature id for the '<em><b>Combowidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__COMBOWIDGET = COMBO_WIDGET__COMBOWIDGET;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__INDEX = COMBO_WIDGET__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__NAME = COMBO_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Interaction URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__INTERACTION_URL = COMBO_WIDGET__INTERACTION_URL;

	/**
	 * The feature id for the '<em><b>Main interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__MAIN_INTERACTION = COMBO_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_FEATURE_COUNT = COMBO_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OPERATION_COUNT = COMBO_WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.BasicWidgetImpl <em>Basic Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.BasicWidgetImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getBasicWidget()
	 * @generated
	 */
	int BASIC_WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WIDGET__IMPLEMENT_INTERACTION = WIDGET__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WIDGET__INDEX = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WIDGET__NAME = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.ContainerImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMPLEMENT_INTERACTION = COMBO_WIDGET__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Basicwidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BASICWIDGET = COMBO_WIDGET__BASICWIDGET;

	/**
	 * The feature id for the '<em><b>Combowidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMBOWIDGET = COMBO_WIDGET__COMBOWIDGET;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INDEX = COMBO_WIDGET__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = COMBO_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Interaction URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INTERACTION_URL = COMBO_WIDGET__INTERACTION_URL;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = COMBO_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = COMBO_WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.ButtonImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMPLEMENT_INTERACTION = BASIC_WIDGET__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__INDEX = BASIC_WIDGET__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = BASIC_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ENABLE = BASIC_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = BASIC_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = BASIC_WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.PanelImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 4;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__IMPLEMENT_INTERACTION = CONTAINER__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Basicwidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__BASICWIDGET = CONTAINER__BASICWIDGET;

	/**
	 * The feature id for the '<em><b>Combowidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__COMBOWIDGET = CONTAINER__COMBOWIDGET;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__INDEX = CONTAINER__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Interaction URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__INTERACTION_URL = CONTAINER__INTERACTION_URL;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__SIZE_X = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__SIZE_Y = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.IndicatorImpl <em>Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.IndicatorImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getIndicator()
	 * @generated
	 */
	int INDICATOR = 5;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__IMPLEMENT_INTERACTION = BASIC_WIDGET__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__INDEX = BASIC_WIDGET__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__NAME = BASIC_WIDGET__NAME;

	/**
	 * The number of structural features of the '<em>Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_FEATURE_COUNT = BASIC_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_OPERATION_COUNT = BASIC_WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.SensorImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IMPLEMENT_INTERACTION = BASIC_WIDGET__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__INDEX = BASIC_WIDGET__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = BASIC_WIDGET__NAME;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = BASIC_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = BASIC_WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.RadioBoxImpl <em>Radio Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.RadioBoxImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getRadioBox()
	 * @generated
	 */
	int RADIO_BOX = 7;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX__IMPLEMENT_INTERACTION = BUTTON__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX__INDEX = BUTTON__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX__ENABLE = BUTTON__ENABLE;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX__SIZE_X = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX__SIZE_Y = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label String Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX__LABEL_STRING_ARRAY = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Radio Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Radio Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BOX_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.RotarySwitchImpl <em>Rotary Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.RotarySwitchImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getRotarySwitch()
	 * @generated
	 */
	int ROTARY_SWITCH = 8;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH__IMPLEMENT_INTERACTION = BUTTON__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH__INDEX = BUTTON__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH__ENABLE = BUTTON__ENABLE;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH__RADIUS = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH__LEGEND = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH__LABELS = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rotary Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rotary Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_SWITCH_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.ComboBoxImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 9;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__IMPLEMENT_INTERACTION = BUTTON__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__INDEX = BUTTON__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ENABLE = BUTTON__ENABLE;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__SIZE_X = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__SIZE_Y = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__LABEL_STRING = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.KnobImpl <em>Knob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.KnobImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getKnob()
	 * @generated
	 */
	int KNOB = 10;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__IMPLEMENT_INTERACTION = BUTTON__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__INDEX = BUTTON__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__ENABLE = BUTTON__ENABLE;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__RADIUS = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__LEGEND = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__MIN = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB__MAX = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Knob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Knob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOB_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.PushButtonImpl <em>Push Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.PushButtonImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getPushButton()
	 * @generated
	 */
	int PUSH_BUTTON = 11;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__IMPLEMENT_INTERACTION = BUTTON__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__INDEX = BUTTON__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__ENABLE = BUTTON__ENABLE;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__SIZE_X = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__SIZE_Y = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__LABEL_STRING = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__SELECTION = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Push Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Push Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.ToggleButtonImpl <em>Toggle Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.ToggleButtonImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getToggleButton()
	 * @generated
	 */
	int TOGGLE_BUTTON = 12;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__IMPLEMENT_INTERACTION = BUTTON__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__INDEX = BUTTON__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__ENABLE = BUTTON__ENABLE;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__SIZE_X = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__SIZE_Y = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON__LABEL_STRING = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.SliderImpl <em>Slider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.SliderImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getSlider()
	 * @generated
	 */
	int SLIDER = 13;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__IMPLEMENT_INTERACTION = BUTTON__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__INDEX = BUTTON__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__ENABLE = BUTTON__ENABLE;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__SIZE_X = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__SIZE_Y = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__VALUE = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__MIN_VALUE = BUTTON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Slider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Slider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl <em>Scroll List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getScrollList()
	 * @generated
	 */
	int SCROLL_LIST = 14;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__IMPLEMENT_INTERACTION = CONTAINER__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Basicwidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__BASICWIDGET = CONTAINER__BASICWIDGET;

	/**
	 * The feature id for the '<em><b>Combowidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__COMBOWIDGET = CONTAINER__COMBOWIDGET;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__INDEX = CONTAINER__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Interaction URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__INTERACTION_URL = CONTAINER__INTERACTION_URL;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__SIZE_X = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__SIZE_Y = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inner X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__INNER_X = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inner Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST__INNER_Y = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scroll List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Scroll List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_LIST_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.CounterImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 15;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__IMPLEMENT_INTERACTION = INDICATOR__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__INDEX = INDICATOR__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__NAME = INDICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__RADIUS = INDICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__VALUE = INDICATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__MIN_VALUE = INDICATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__MAX_VALUE = INDICATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = INDICATOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = INDICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.TextDisplayImpl <em>Text Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.TextDisplayImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getTextDisplay()
	 * @generated
	 */
	int TEXT_DISPLAY = 16;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY__IMPLEMENT_INTERACTION = INDICATOR__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY__INDEX = INDICATOR__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY__NAME = INDICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY__TEXT = INDICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY__LEGEND = INDICATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY_FEATURE_COUNT = INDICATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DISPLAY_OPERATION_COUNT = INDICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.LEDImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getLED()
	 * @generated
	 */
	int LED = 17;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__IMPLEMENT_INTERACTION = INDICATOR__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__INDEX = INDICATOR__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = INDICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__SIZE_X = INDICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__SIZE_Y = INDICATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LED On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__LED_ON = INDICATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__LEGEND = INDICATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = INDICATOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = INDICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.NumberDisplayImpl <em>Number Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.NumberDisplayImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getNumberDisplay()
	 * @generated
	 */
	int NUMBER_DISPLAY = 18;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DISPLAY__IMPLEMENT_INTERACTION = INDICATOR__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DISPLAY__INDEX = INDICATOR__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DISPLAY__NAME = INDICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DISPLAY__VALUE = INDICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DISPLAY__LEGEND = INDICATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DISPLAY_FEATURE_COUNT = INDICATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DISPLAY_OPERATION_COUNT = INDICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.GaugeImpl <em>Gauge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.GaugeImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getGauge()
	 * @generated
	 */
	int GAUGE = 19;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__IMPLEMENT_INTERACTION = INDICATOR__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__INDEX = INDICATOR__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__NAME = INDICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__SIZE_X = INDICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__SIZE_Y = INDICATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__VALUE = INDICATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gauge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_FEATURE_COUNT = INDICATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gauge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_OPERATION_COUNT = INDICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.DateAndTimeImpl <em>Date And Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.DateAndTimeImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDateAndTime()
	 * @generated
	 */
	int DATE_AND_TIME = 20;

	/**
	 * The feature id for the '<em><b>Implement interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME__IMPLEMENT_INTERACTION = SENSOR__IMPLEMENT_INTERACTION;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME__INDEX = SENSOR__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Date And Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME__DATE_AND_TIME = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date And Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date And Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetFactoryImpl <em>Combo Widget Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.ComboWidgetFactoryImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getComboWidgetFactory()
	 * @generated
	 */
	int COMBO_WIDGET_FACTORY = 21;

	/**
	 * The feature id for the '<em><b>My Combo Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET = 0;

	/**
	 * The feature id for the '<em><b>Gui</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET_FACTORY__GUI = 1;

	/**
	 * The feature id for the '<em><b>Interaction diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM = 2;

	/**
	 * The number of structural features of the '<em>Combo Widget Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Combo Widget Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_WIDGET_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DIRECTION = 4;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DATATYPE = 5;

	/**
	 * The feature id for the '<em><b>Candidate interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CANDIDATE_INTERFACES = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FROM = 7;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TO = 8;

	/**
	 * The feature id for the '<em><b>Actual Par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ACTUAL_PAR = 9;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.DatatypeImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__DATATYPE = 2;

	/**
	 * The feature id for the '<em><b>Candidate datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__CANDIDATE_DATATYPES = 3;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.DatatypeTableImpl <em>Datatype Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.DatatypeTableImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDatatypeTable()
	 * @generated
	 */
	int DATATYPE_TABLE = 25;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TABLE__DATATYPES = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TABLE__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Datatype Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Datatype Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceTableImpl <em>Interface Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.InterfaceTableImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInterfaceTable()
	 * @generated
	 */
	int INTERFACE_TABLE = 26;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TABLE__INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TABLE__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Interface Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.InteractionImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 27;

	/**
	 * The feature id for the '<em><b>Signature interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SIGNATURE_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Candidates interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CANDIDATES_INTERACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Interface Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INTERFACE_CONNECTORS = 7;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INDEX = 8;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.InterfaceConnectorImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInterfaceConnector()
	 * @generated
	 */
	int INTERFACE_CONNECTOR = 28;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.InteractionTableImpl <em>Interaction Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.InteractionTableImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInteractionTable()
	 * @generated
	 */
	int INTERACTION_TABLE = 29;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TABLE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TABLE__INTERACTIONS = 2;

	/**
	 * The number of structural features of the '<em>Interaction Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interaction Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.impl.TableFactoryImpl <em>Table Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.TableFactoryImpl
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getTableFactory()
	 * @generated
	 */
	int TABLE_FACTORY = 30;

	/**
	 * The feature id for the '<em><b>Interactiontable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FACTORY__INTERACTIONTABLE = 0;

	/**
	 * The feature id for the '<em><b>Interfacetable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FACTORY__INTERFACETABLE = 1;

	/**
	 * The feature id for the '<em><b>Datatypetable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FACTORY__DATATYPETABLE = 2;

	/**
	 * The number of structural features of the '<em>Table Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.activationStat <em>activation Stat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.activationStat
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getactivationStat()
	 * @generated
	 */
	int ACTIVATION_STAT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.Direction
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.MetaDatatype <em>Meta Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.MetaDatatype
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getMetaDatatype()
	 * @generated
	 */
	int META_DATATYPE = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.MetaInterface <em>Meta Interface</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.MetaInterface
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getMetaInterface()
	 * @generated
	 */
	int META_INTERFACE = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.LIDLGUI.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.Scope
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 36;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 37;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 38;

	/**
	 * The meta object id for the '<em>Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 39;

	/**
	 * The meta object id for the '<em>Activation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activationStat
	 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 40;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.GUI <em>GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.GUI
	 * @generated
	 */
	EClass getGUI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.GUI#getMain_interaction <em>Main interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Main interaction</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.GUI#getMain_interaction()
	 * @see #getGUI()
	 * @generated
	 */
	EReference getGUI_Main_interaction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.BasicWidget <em>Basic Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Widget</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.BasicWidget
	 * @generated
	 */
	EClass getBasicWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.BasicWidget#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.BasicWidget#getIndex()
	 * @see #getBasicWidget()
	 * @generated
	 */
	EAttribute getBasicWidget_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.BasicWidget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.BasicWidget#getName()
	 * @see #getBasicWidget()
	 * @generated
	 */
	EAttribute getBasicWidget_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Button#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Button#getEnable()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Enable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Panel#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Panel#getSizeX()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Panel#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Panel#getSizeY()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_SizeY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Indicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Indicator
	 * @generated
	 */
	EClass getIndicator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.RadioBox <em>Radio Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Box</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RadioBox
	 * @generated
	 */
	EClass getRadioBox();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.RadioBox#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RadioBox#getSizeX()
	 * @see #getRadioBox()
	 * @generated
	 */
	EAttribute getRadioBox_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.RadioBox#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RadioBox#getSizeY()
	 * @see #getRadioBox()
	 * @generated
	 */
	EAttribute getRadioBox_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.RadioBox#getLabelStringArray <em>Label String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label String Array</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RadioBox#getLabelStringArray()
	 * @see #getRadioBox()
	 * @generated
	 */
	EAttribute getRadioBox_LabelStringArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.RotarySwitch <em>Rotary Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotary Switch</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RotarySwitch
	 * @generated
	 */
	EClass getRotarySwitch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RotarySwitch#getRadius()
	 * @see #getRotarySwitch()
	 * @generated
	 */
	EAttribute getRotarySwitch_Radius();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RotarySwitch#getLegend()
	 * @see #getRotarySwitch()
	 * @generated
	 */
	EAttribute getRotarySwitch_Legend();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.RotarySwitch#getLabels()
	 * @see #getRotarySwitch()
	 * @generated
	 */
	EAttribute getRotarySwitch_Labels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ComboBox#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboBox#getSizeX()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ComboBox#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboBox#getSizeY()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ComboBox#getLabelString <em>Label String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label String</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboBox#getLabelString()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_LabelString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Knob <em>Knob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knob</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Knob
	 * @generated
	 */
	EClass getKnob();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Knob#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Knob#getRadius()
	 * @see #getKnob()
	 * @generated
	 */
	EAttribute getKnob_Radius();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Knob#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Knob#getLegend()
	 * @see #getKnob()
	 * @generated
	 */
	EAttribute getKnob_Legend();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Knob#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Knob#getMin()
	 * @see #getKnob()
	 * @generated
	 */
	EAttribute getKnob_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Knob#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Knob#getMax()
	 * @see #getKnob()
	 * @generated
	 */
	EAttribute getKnob_Max();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.PushButton <em>Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Button</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.PushButton
	 * @generated
	 */
	EClass getPushButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.PushButton#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.PushButton#getSizeX()
	 * @see #getPushButton()
	 * @generated
	 */
	EAttribute getPushButton_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.PushButton#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.PushButton#getSizeY()
	 * @see #getPushButton()
	 * @generated
	 */
	EAttribute getPushButton_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.PushButton#getLabelString <em>Label String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label String</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.PushButton#getLabelString()
	 * @see #getPushButton()
	 * @generated
	 */
	EAttribute getPushButton_LabelString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.PushButton#isSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.PushButton#isSelection()
	 * @see #getPushButton()
	 * @generated
	 */
	EAttribute getPushButton_Selection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.ToggleButton <em>Toggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Button</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ToggleButton
	 * @generated
	 */
	EClass getToggleButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ToggleButton#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ToggleButton#getSizeX()
	 * @see #getToggleButton()
	 * @generated
	 */
	EAttribute getToggleButton_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ToggleButton#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ToggleButton#getSizeY()
	 * @see #getToggleButton()
	 * @generated
	 */
	EAttribute getToggleButton_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ToggleButton#getLabelString <em>Label String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label String</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ToggleButton#getLabelString()
	 * @see #getToggleButton()
	 * @generated
	 */
	EAttribute getToggleButton_LabelString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Slider <em>Slider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Slider
	 * @generated
	 */
	EClass getSlider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Slider#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Slider#getSizeX()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Slider#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Slider#getSizeY()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Slider#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Slider#getValue()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Slider#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Slider#getMinValue()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_MinValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.ScrollList <em>Scroll List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll List</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ScrollList
	 * @generated
	 */
	EClass getScrollList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ScrollList#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ScrollList#getSizeX()
	 * @see #getScrollList()
	 * @generated
	 */
	EAttribute getScrollList_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ScrollList#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ScrollList#getSizeY()
	 * @see #getScrollList()
	 * @generated
	 */
	EAttribute getScrollList_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ScrollList#getInnerX <em>Inner X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ScrollList#getInnerX()
	 * @see #getScrollList()
	 * @generated
	 */
	EAttribute getScrollList_InnerX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ScrollList#getInnerY <em>Inner Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ScrollList#getInnerY()
	 * @see #getScrollList()
	 * @generated
	 */
	EAttribute getScrollList_InnerY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Counter#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Counter#getRadius()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Radius();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Counter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Counter#getValue()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Counter#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Counter#getMinValue()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Counter#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Counter#getMaxValue()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_MaxValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.TextDisplay <em>Text Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Display</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.TextDisplay
	 * @generated
	 */
	EClass getTextDisplay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.TextDisplay#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.TextDisplay#getText()
	 * @see #getTextDisplay()
	 * @generated
	 */
	EAttribute getTextDisplay_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.TextDisplay#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.TextDisplay#getLegend()
	 * @see #getTextDisplay()
	 * @generated
	 */
	EAttribute getTextDisplay_Legend();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.LED#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.LED#getSizeX()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.LED#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.LED#getSizeY()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.LED#getLEDOn <em>LED On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LED On</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.LED#getLEDOn()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_LEDOn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.LED#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.LED#getLegend()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Legend();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.NumberDisplay <em>Number Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Display</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.NumberDisplay
	 * @generated
	 */
	EClass getNumberDisplay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.NumberDisplay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.NumberDisplay#getValue()
	 * @see #getNumberDisplay()
	 * @generated
	 */
	EAttribute getNumberDisplay_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.NumberDisplay#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.NumberDisplay#getLegend()
	 * @see #getNumberDisplay()
	 * @generated
	 */
	EAttribute getNumberDisplay_Legend();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Gauge <em>Gauge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gauge</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Gauge
	 * @generated
	 */
	EClass getGauge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Gauge#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Gauge#getSizeX()
	 * @see #getGauge()
	 * @generated
	 */
	EAttribute getGauge_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Gauge#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Gauge#getSizeY()
	 * @see #getGauge()
	 * @generated
	 */
	EAttribute getGauge_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Gauge#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Gauge#getValue()
	 * @see #getGauge()
	 * @generated
	 */
	EAttribute getGauge_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.DateAndTime <em>Date And Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date And Time</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.DateAndTime
	 * @generated
	 */
	EClass getDateAndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.DateAndTime#getDateAndTime <em>Date And Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date And Time</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.DateAndTime#getDateAndTime()
	 * @see #getDateAndTime()
	 * @generated
	 */
	EAttribute getDateAndTime_DateAndTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.ComboWidgetFactory <em>Combo Widget Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Widget Factory</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidgetFactory
	 * @generated
	 */
	EClass getComboWidgetFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getMyComboWidget <em>My Combo Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Combo Widget</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getMyComboWidget()
	 * @see #getComboWidgetFactory()
	 * @generated
	 */
	EReference getComboWidgetFactory_MyComboWidget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getGui <em>Gui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gui</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getGui()
	 * @see #getComboWidgetFactory()
	 * @generated
	 */
	EReference getComboWidgetFactory_Gui();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getInteraction_diagram <em>Interaction diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction diagram</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidgetFactory#getInteraction_diagram()
	 * @see #getComboWidgetFactory()
	 * @generated
	 */
	EReference getComboWidgetFactory_Interaction_diagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.ComboWidget <em>Combo Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Widget</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidget
	 * @generated
	 */
	EClass getComboWidget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getBasicwidget <em>Basicwidget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basicwidget</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidget#getBasicwidget()
	 * @see #getComboWidget()
	 * @generated
	 */
	EReference getComboWidget_Basicwidget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getCombowidget <em>Combowidget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combowidget</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidget#getCombowidget()
	 * @see #getComboWidget()
	 * @generated
	 */
	EReference getComboWidget_Combowidget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidget#getIndex()
	 * @see #getComboWidget()
	 * @generated
	 */
	EAttribute getComboWidget_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidget#getName()
	 * @see #getComboWidget()
	 * @generated
	 */
	EAttribute getComboWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getInteractionURL <em>Interaction URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction URL</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.ComboWidget#getInteractionURL()
	 * @see #getComboWidget()
	 * @generated
	 */
	EAttribute getComboWidget_InteractionURL();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interface#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getScope()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getInterface()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interface#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getLabel()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interface#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getDirection()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.LIDLGUI.Interface#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getDatatype()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.Interface#getCandidate_interfaces <em>Candidate interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Candidate interfaces</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getCandidate_interfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Candidate_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.LIDLGUI.Interface#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getFrom()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_From();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.LIDLGUI.Interface#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getTo()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_To();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interface#getActualPar <em>Actual Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Par</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getActualPar()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_ActualPar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Datatype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Datatype#getName()
	 * @see #getDatatype()
	 * @generated
	 */
	EAttribute getDatatype_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Datatype#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Datatype#getLabel()
	 * @see #getDatatype()
	 * @generated
	 */
	EAttribute getDatatype_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Datatype#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Datatype#getDatatype()
	 * @see #getDatatype()
	 * @generated
	 */
	EAttribute getDatatype_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.Datatype#getCandidate_datatypes <em>Candidate datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Candidate datatypes</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Datatype#getCandidate_datatypes()
	 * @see #getDatatype()
	 * @generated
	 */
	EReference getDatatype_Candidate_datatypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.DatatypeTable <em>Datatype Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Table</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.DatatypeTable
	 * @generated
	 */
	EClass getDatatypeTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.DatatypeTable#getDatatypes()
	 * @see #getDatatypeTable()
	 * @generated
	 */
	EReference getDatatypeTable_Datatypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.DatatypeTable#getIndex()
	 * @see #getDatatypeTable()
	 * @generated
	 */
	EAttribute getDatatypeTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.DatatypeTable#getName()
	 * @see #getDatatypeTable()
	 * @generated
	 */
	EAttribute getDatatypeTable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.InterfaceTable <em>Interface Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Table</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceTable
	 * @generated
	 */
	EClass getInterfaceTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.InterfaceTable#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceTable#getInterfaces()
	 * @see #getInterfaceTable()
	 * @generated
	 */
	EReference getInterfaceTable_Interfaces();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.InterfaceTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceTable#getIndex()
	 * @see #getInterfaceTable()
	 * @generated
	 */
	EAttribute getInterfaceTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.InterfaceTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceTable#getName()
	 * @see #getInterfaceTable()
	 * @generated
	 */
	EAttribute getInterfaceTable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.Interaction#getSignature_interfaces <em>Signature interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature interfaces</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getSignature_interfaces()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Signature_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.Interaction#getCandidates_interactions <em>Candidates interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Candidates interactions</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getCandidates_interactions()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Candidates_interactions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interaction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getLabel()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getName()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interaction#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getSignature()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Signature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.LIDLGUI.Interaction#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getInterface()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interaction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getExpression()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.Interaction#getInterfaceConnectors <em>Interface Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Connectors</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getInterfaceConnectors()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_InterfaceConnectors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.Interaction#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Interaction#getIndex()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Index();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connector</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceConnector
	 * @generated
	 */
	EClass getInterfaceConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceConnector#getSource()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceConnector#getTarget()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.InteractionTable <em>Interaction Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Table</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InteractionTable
	 * @generated
	 */
	EClass getInteractionTable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.InteractionTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InteractionTable#getIndex()
	 * @see #getInteractionTable()
	 * @generated
	 */
	EAttribute getInteractionTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.LIDLGUI.InteractionTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InteractionTable#getName()
	 * @see #getInteractionTable()
	 * @generated
	 */
	EAttribute getInteractionTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.InteractionTable#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactions</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.InteractionTable#getInteractions()
	 * @see #getInteractionTable()
	 * @generated
	 */
	EReference getInteractionTable_Interactions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.TableFactory <em>Table Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Factory</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.TableFactory
	 * @generated
	 */
	EClass getTableFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.TableFactory#getInteractiontable <em>Interactiontable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactiontable</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.TableFactory#getInteractiontable()
	 * @see #getTableFactory()
	 * @generated
	 */
	EReference getTableFactory_Interactiontable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.TableFactory#getInterfacetable <em>Interfacetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacetable</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.TableFactory#getInterfacetable()
	 * @see #getTableFactory()
	 * @generated
	 */
	EReference getTableFactory_Interfacetable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.TableFactory#getDatatypetable <em>Datatypetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypetable</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.TableFactory#getDatatypetable()
	 * @see #getTableFactory()
	 * @generated
	 */
	EReference getTableFactory_Datatypetable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.LIDLGUI.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.LIDLGUI.Widget#getImplement_interaction <em>Implement interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implement interaction</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Widget#getImplement_interaction()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Implement_interaction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.LIDLGUI.activationStat <em>activation Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>activation Stat</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.activationStat
	 * @generated
	 */
	EEnum getactivationStat();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.LIDLGUI.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.LIDLGUI.MetaDatatype <em>Meta Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Meta Datatype</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.MetaDatatype
	 * @generated
	 */
	EEnum getMetaDatatype();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.LIDLGUI.MetaInterface <em>Meta Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Meta Interface</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.MetaInterface
	 * @generated
	 */
	EEnum getMetaInterface();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.LIDLGUI.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see org.eclipse.sirius.LIDLGUI.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for data type '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getText();

	/**
	 * Returns the meta object for data type '{@link activationStat <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activation</em>'.
	 * @see activationStat
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getActivation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LIDLGUIFactory getLIDLGUIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.GUIImpl <em>GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.GUIImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getGUI()
		 * @generated
		 */
		EClass GUI = eINSTANCE.getGUI();

		/**
		 * The meta object literal for the '<em><b>Main interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI__MAIN_INTERACTION = eINSTANCE.getGUI_Main_interaction();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.BasicWidgetImpl <em>Basic Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.BasicWidgetImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getBasicWidget()
		 * @generated
		 */
		EClass BASIC_WIDGET = eINSTANCE.getBasicWidget();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_WIDGET__INDEX = eINSTANCE.getBasicWidget_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_WIDGET__NAME = eINSTANCE.getBasicWidget_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.ContainerImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.ButtonImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__ENABLE = eINSTANCE.getButton_Enable();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.PanelImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__SIZE_X = eINSTANCE.getPanel_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__SIZE_Y = eINSTANCE.getPanel_SizeY();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.IndicatorImpl <em>Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.IndicatorImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getIndicator()
		 * @generated
		 */
		EClass INDICATOR = eINSTANCE.getIndicator();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.SensorImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.RadioBoxImpl <em>Radio Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.RadioBoxImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getRadioBox()
		 * @generated
		 */
		EClass RADIO_BOX = eINSTANCE.getRadioBox();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BOX__SIZE_X = eINSTANCE.getRadioBox_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BOX__SIZE_Y = eINSTANCE.getRadioBox_SizeY();

		/**
		 * The meta object literal for the '<em><b>Label String Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BOX__LABEL_STRING_ARRAY = eINSTANCE.getRadioBox_LabelStringArray();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.RotarySwitchImpl <em>Rotary Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.RotarySwitchImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getRotarySwitch()
		 * @generated
		 */
		EClass ROTARY_SWITCH = eINSTANCE.getRotarySwitch();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_SWITCH__RADIUS = eINSTANCE.getRotarySwitch_Radius();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_SWITCH__LEGEND = eINSTANCE.getRotarySwitch_Legend();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_SWITCH__LABELS = eINSTANCE.getRotarySwitch_Labels();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.ComboBoxImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__SIZE_X = eINSTANCE.getComboBox_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__SIZE_Y = eINSTANCE.getComboBox_SizeY();

		/**
		 * The meta object literal for the '<em><b>Label String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__LABEL_STRING = eINSTANCE.getComboBox_LabelString();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.KnobImpl <em>Knob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.KnobImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getKnob()
		 * @generated
		 */
		EClass KNOB = eINSTANCE.getKnob();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOB__RADIUS = eINSTANCE.getKnob_Radius();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOB__LEGEND = eINSTANCE.getKnob_Legend();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOB__MIN = eINSTANCE.getKnob_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOB__MAX = eINSTANCE.getKnob_Max();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.PushButtonImpl <em>Push Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.PushButtonImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getPushButton()
		 * @generated
		 */
		EClass PUSH_BUTTON = eINSTANCE.getPushButton();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_BUTTON__SIZE_X = eINSTANCE.getPushButton_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_BUTTON__SIZE_Y = eINSTANCE.getPushButton_SizeY();

		/**
		 * The meta object literal for the '<em><b>Label String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_BUTTON__LABEL_STRING = eINSTANCE.getPushButton_LabelString();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_BUTTON__SELECTION = eINSTANCE.getPushButton_Selection();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.ToggleButtonImpl <em>Toggle Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.ToggleButtonImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getToggleButton()
		 * @generated
		 */
		EClass TOGGLE_BUTTON = eINSTANCE.getToggleButton();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_BUTTON__SIZE_X = eINSTANCE.getToggleButton_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_BUTTON__SIZE_Y = eINSTANCE.getToggleButton_SizeY();

		/**
		 * The meta object literal for the '<em><b>Label String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_BUTTON__LABEL_STRING = eINSTANCE.getToggleButton_LabelString();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.SliderImpl <em>Slider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.SliderImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getSlider()
		 * @generated
		 */
		EClass SLIDER = eINSTANCE.getSlider();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__SIZE_X = eINSTANCE.getSlider_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__SIZE_Y = eINSTANCE.getSlider_SizeY();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__VALUE = eINSTANCE.getSlider_Value();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__MIN_VALUE = eINSTANCE.getSlider_MinValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl <em>Scroll List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getScrollList()
		 * @generated
		 */
		EClass SCROLL_LIST = eINSTANCE.getScrollList();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_LIST__SIZE_X = eINSTANCE.getScrollList_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_LIST__SIZE_Y = eINSTANCE.getScrollList_SizeY();

		/**
		 * The meta object literal for the '<em><b>Inner X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_LIST__INNER_X = eINSTANCE.getScrollList_InnerX();

		/**
		 * The meta object literal for the '<em><b>Inner Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_LIST__INNER_Y = eINSTANCE.getScrollList_InnerY();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.CounterImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__RADIUS = eINSTANCE.getCounter_Radius();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__VALUE = eINSTANCE.getCounter_Value();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__MIN_VALUE = eINSTANCE.getCounter_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__MAX_VALUE = eINSTANCE.getCounter_MaxValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.TextDisplayImpl <em>Text Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.TextDisplayImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getTextDisplay()
		 * @generated
		 */
		EClass TEXT_DISPLAY = eINSTANCE.getTextDisplay();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_DISPLAY__TEXT = eINSTANCE.getTextDisplay_Text();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_DISPLAY__LEGEND = eINSTANCE.getTextDisplay_Legend();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.LEDImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__SIZE_X = eINSTANCE.getLED_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__SIZE_Y = eINSTANCE.getLED_SizeY();

		/**
		 * The meta object literal for the '<em><b>LED On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__LED_ON = eINSTANCE.getLED_LEDOn();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__LEGEND = eINSTANCE.getLED_Legend();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.NumberDisplayImpl <em>Number Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.NumberDisplayImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getNumberDisplay()
		 * @generated
		 */
		EClass NUMBER_DISPLAY = eINSTANCE.getNumberDisplay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_DISPLAY__VALUE = eINSTANCE.getNumberDisplay_Value();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_DISPLAY__LEGEND = eINSTANCE.getNumberDisplay_Legend();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.GaugeImpl <em>Gauge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.GaugeImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getGauge()
		 * @generated
		 */
		EClass GAUGE = eINSTANCE.getGauge();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUGE__SIZE_X = eINSTANCE.getGauge_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUGE__SIZE_Y = eINSTANCE.getGauge_SizeY();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUGE__VALUE = eINSTANCE.getGauge_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.DateAndTimeImpl <em>Date And Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.DateAndTimeImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDateAndTime()
		 * @generated
		 */
		EClass DATE_AND_TIME = eINSTANCE.getDateAndTime();

		/**
		 * The meta object literal for the '<em><b>Date And Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_AND_TIME__DATE_AND_TIME = eINSTANCE.getDateAndTime_DateAndTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetFactoryImpl <em>Combo Widget Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.ComboWidgetFactoryImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getComboWidgetFactory()
		 * @generated
		 */
		EClass COMBO_WIDGET_FACTORY = eINSTANCE.getComboWidgetFactory();

		/**
		 * The meta object literal for the '<em><b>My Combo Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET = eINSTANCE.getComboWidgetFactory_MyComboWidget();

		/**
		 * The meta object literal for the '<em><b>Gui</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBO_WIDGET_FACTORY__GUI = eINSTANCE.getComboWidgetFactory_Gui();

		/**
		 * The meta object literal for the '<em><b>Interaction diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM = eINSTANCE.getComboWidgetFactory_Interaction_diagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl <em>Combo Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getComboWidget()
		 * @generated
		 */
		EClass COMBO_WIDGET = eINSTANCE.getComboWidget();

		/**
		 * The meta object literal for the '<em><b>Basicwidget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBO_WIDGET__BASICWIDGET = eINSTANCE.getComboWidget_Basicwidget();

		/**
		 * The meta object literal for the '<em><b>Combowidget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBO_WIDGET__COMBOWIDGET = eINSTANCE.getComboWidget_Combowidget();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_WIDGET__INDEX = eINSTANCE.getComboWidget_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_WIDGET__NAME = eINSTANCE.getComboWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Interaction URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_WIDGET__INTERACTION_URL = eINSTANCE.getComboWidget_InteractionURL();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__SCOPE = eINSTANCE.getInterface_Scope();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__INTERFACE = eINSTANCE.getInterface_Interface();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__LABEL = eINSTANCE.getInterface_Label();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__DIRECTION = eINSTANCE.getInterface_Direction();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__DATATYPE = eINSTANCE.getInterface_Datatype();

		/**
		 * The meta object literal for the '<em><b>Candidate interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CANDIDATE_INTERFACES = eINSTANCE.getInterface_Candidate_interfaces();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__FROM = eINSTANCE.getInterface_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__TO = eINSTANCE.getInterface_To();

		/**
		 * The meta object literal for the '<em><b>Actual Par</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__ACTUAL_PAR = eINSTANCE.getInterface_ActualPar();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.DatatypeImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE__NAME = eINSTANCE.getDatatype_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE__LABEL = eINSTANCE.getDatatype_Label();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE__DATATYPE = eINSTANCE.getDatatype_Datatype();

		/**
		 * The meta object literal for the '<em><b>Candidate datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE__CANDIDATE_DATATYPES = eINSTANCE.getDatatype_Candidate_datatypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.DatatypeTableImpl <em>Datatype Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.DatatypeTableImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDatatypeTable()
		 * @generated
		 */
		EClass DATATYPE_TABLE = eINSTANCE.getDatatypeTable();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_TABLE__DATATYPES = eINSTANCE.getDatatypeTable_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_TABLE__INDEX = eINSTANCE.getDatatypeTable_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_TABLE__NAME = eINSTANCE.getDatatypeTable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceTableImpl <em>Interface Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.InterfaceTableImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInterfaceTable()
		 * @generated
		 */
		EClass INTERFACE_TABLE = eINSTANCE.getInterfaceTable();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TABLE__INTERFACES = eINSTANCE.getInterfaceTable_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TABLE__INDEX = eINSTANCE.getInterfaceTable_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TABLE__NAME = eINSTANCE.getInterfaceTable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.InteractionImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Signature interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__SIGNATURE_INTERFACES = eINSTANCE.getInteraction_Signature_interfaces();

		/**
		 * The meta object literal for the '<em><b>Candidates interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__CANDIDATES_INTERACTIONS = eINSTANCE.getInteraction_Candidates_interactions();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__LABEL = eINSTANCE.getInteraction_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__NAME = eINSTANCE.getInteraction_Name();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__SIGNATURE = eINSTANCE.getInteraction_Signature();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__INTERFACE = eINSTANCE.getInteraction_Interface();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__EXPRESSION = eINSTANCE.getInteraction_Expression();

		/**
		 * The meta object literal for the '<em><b>Interface Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__INTERFACE_CONNECTORS = eINSTANCE.getInteraction_InterfaceConnectors();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__INDEX = eINSTANCE.getInteraction_Index();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.InterfaceConnectorImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInterfaceConnector()
		 * @generated
		 */
		EClass INTERFACE_CONNECTOR = eINSTANCE.getInterfaceConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__SOURCE = eINSTANCE.getInterfaceConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__TARGET = eINSTANCE.getInterfaceConnector_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.InteractionTableImpl <em>Interaction Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.InteractionTableImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getInteractionTable()
		 * @generated
		 */
		EClass INTERACTION_TABLE = eINSTANCE.getInteractionTable();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_TABLE__INDEX = eINSTANCE.getInteractionTable_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_TABLE__NAME = eINSTANCE.getInteractionTable_Name();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_TABLE__INTERACTIONS = eINSTANCE.getInteractionTable_Interactions();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.TableFactoryImpl <em>Table Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.TableFactoryImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getTableFactory()
		 * @generated
		 */
		EClass TABLE_FACTORY = eINSTANCE.getTableFactory();

		/**
		 * The meta object literal for the '<em><b>Interactiontable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_FACTORY__INTERACTIONTABLE = eINSTANCE.getTableFactory_Interactiontable();

		/**
		 * The meta object literal for the '<em><b>Interfacetable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_FACTORY__INTERFACETABLE = eINSTANCE.getTableFactory_Interfacetable();

		/**
		 * The meta object literal for the '<em><b>Datatypetable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_FACTORY__DATATYPETABLE = eINSTANCE.getTableFactory_Datatypetable();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.WidgetImpl
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Implement interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__IMPLEMENT_INTERACTION = eINSTANCE.getWidget_Implement_interaction();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.activationStat <em>activation Stat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.activationStat
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getactivationStat()
		 * @generated
		 */
		EEnum ACTIVATION_STAT = eINSTANCE.getactivationStat();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.Direction
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.MetaDatatype <em>Meta Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.MetaDatatype
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getMetaDatatype()
		 * @generated
		 */
		EEnum META_DATATYPE = eINSTANCE.getMetaDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.MetaInterface <em>Meta Interface</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.MetaInterface
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getMetaInterface()
		 * @generated
		 */
		EEnum META_INTERFACE = eINSTANCE.getMetaInterface();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.LIDLGUI.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.Scope
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getText()
		 * @generated
		 */
		EDataType TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em>Activation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activationStat
		 * @see org.eclipse.sirius.LIDLGUI.impl.LIDLGUIPackageImpl#getActivation()
		 * @generated
		 */
		EDataType ACTIVATION = eINSTANCE.getActivation();

	}

} //LIDLGUIPackage
