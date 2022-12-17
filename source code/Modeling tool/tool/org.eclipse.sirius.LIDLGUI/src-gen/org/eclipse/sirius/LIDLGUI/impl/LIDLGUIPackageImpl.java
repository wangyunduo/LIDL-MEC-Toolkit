/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.sirius.LIDLGUI.BasicWidget;
import org.eclipse.sirius.LIDLGUI.Button;
import org.eclipse.sirius.LIDLGUI.ComboBox;
import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.Counter;
import org.eclipse.sirius.LIDLGUI.Datatype;
import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.DateAndTime;
import org.eclipse.sirius.LIDLGUI.Direction;
import org.eclipse.sirius.LIDLGUI.Gauge;
import org.eclipse.sirius.LIDLGUI.Indicator;
import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.Interface;
import org.eclipse.sirius.LIDLGUI.InterfaceConnector;
import org.eclipse.sirius.LIDLGUI.InterfaceTable;
import org.eclipse.sirius.LIDLGUI.Knob;
import org.eclipse.sirius.LIDLGUI.LIDLGUIFactory;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;
import org.eclipse.sirius.LIDLGUI.MetaDatatype;
import org.eclipse.sirius.LIDLGUI.MetaInterface;
import org.eclipse.sirius.LIDLGUI.NumberDisplay;
import org.eclipse.sirius.LIDLGUI.Panel;
import org.eclipse.sirius.LIDLGUI.PushButton;
import org.eclipse.sirius.LIDLGUI.RadioBox;
import org.eclipse.sirius.LIDLGUI.RotarySwitch;
import org.eclipse.sirius.LIDLGUI.Scope;
import org.eclipse.sirius.LIDLGUI.ScrollList;
import org.eclipse.sirius.LIDLGUI.Sensor;
import org.eclipse.sirius.LIDLGUI.Slider;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.LIDLGUI.TextDisplay;
import org.eclipse.sirius.LIDLGUI.ToggleButton;
import org.eclipse.sirius.LIDLGUI.Widget;
import org.eclipse.sirius.LIDLGUI.activationStat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LIDLGUIPackageImpl extends EPackageImpl implements LIDLGUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotarySwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaugeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateAndTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboWidgetFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activationStatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metaDatatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metaInterfaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activationEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LIDLGUIPackageImpl() {
		super(eNS_URI, LIDLGUIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LIDLGUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LIDLGUIPackage init() {
		if (isInited)
			return (LIDLGUIPackage) EPackage.Registry.INSTANCE.getEPackage(LIDLGUIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLIDLGUIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LIDLGUIPackageImpl theLIDLGUIPackage = registeredLIDLGUIPackage instanceof LIDLGUIPackageImpl
				? (LIDLGUIPackageImpl) registeredLIDLGUIPackage
				: new LIDLGUIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLIDLGUIPackage.createPackageContents();

		// Initialize created meta-data
		theLIDLGUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLIDLGUIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LIDLGUIPackage.eNS_URI, theLIDLGUIPackage);
		return theLIDLGUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUI() {
		return guiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUI_Main_interaction() {
		return (EReference) guiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicWidget() {
		return basicWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicWidget_Index() {
		return (EAttribute) basicWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicWidget_Name() {
		return (EAttribute) basicWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Enable() {
		return (EAttribute) buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_SizeX() {
		return (EAttribute) panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_SizeY() {
		return (EAttribute) panelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndicator() {
		return indicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioBox() {
		return radioBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioBox_SizeX() {
		return (EAttribute) radioBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioBox_SizeY() {
		return (EAttribute) radioBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioBox_LabelStringArray() {
		return (EAttribute) radioBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotarySwitch() {
		return rotarySwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotarySwitch_Radius() {
		return (EAttribute) rotarySwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotarySwitch_Legend() {
		return (EAttribute) rotarySwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotarySwitch_Labels() {
		return (EAttribute) rotarySwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboBox() {
		return comboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboBox_SizeX() {
		return (EAttribute) comboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboBox_SizeY() {
		return (EAttribute) comboBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboBox_LabelString() {
		return (EAttribute) comboBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnob() {
		return knobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnob_Radius() {
		return (EAttribute) knobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnob_Legend() {
		return (EAttribute) knobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnob_Min() {
		return (EAttribute) knobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnob_Max() {
		return (EAttribute) knobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushButton() {
		return pushButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushButton_SizeX() {
		return (EAttribute) pushButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushButton_SizeY() {
		return (EAttribute) pushButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushButton_LabelString() {
		return (EAttribute) pushButtonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushButton_Selection() {
		return (EAttribute) pushButtonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggleButton() {
		return toggleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleButton_SizeX() {
		return (EAttribute) toggleButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleButton_SizeY() {
		return (EAttribute) toggleButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleButton_LabelString() {
		return (EAttribute) toggleButtonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlider() {
		return sliderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlider_SizeX() {
		return (EAttribute) sliderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlider_SizeY() {
		return (EAttribute) sliderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlider_Value() {
		return (EAttribute) sliderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlider_MinValue() {
		return (EAttribute) sliderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollList() {
		return scrollListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollList_SizeX() {
		return (EAttribute) scrollListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollList_SizeY() {
		return (EAttribute) scrollListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollList_InnerX() {
		return (EAttribute) scrollListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollList_InnerY() {
		return (EAttribute) scrollListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Radius() {
		return (EAttribute) counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Value() {
		return (EAttribute) counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_MinValue() {
		return (EAttribute) counterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_MaxValue() {
		return (EAttribute) counterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextDisplay() {
		return textDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDisplay_Text() {
		return (EAttribute) textDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDisplay_Legend() {
		return (EAttribute) textDisplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_SizeX() {
		return (EAttribute) ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_SizeY() {
		return (EAttribute) ledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_LEDOn() {
		return (EAttribute) ledEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Legend() {
		return (EAttribute) ledEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberDisplay() {
		return numberDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberDisplay_Value() {
		return (EAttribute) numberDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberDisplay_Legend() {
		return (EAttribute) numberDisplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGauge() {
		return gaugeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGauge_SizeX() {
		return (EAttribute) gaugeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGauge_SizeY() {
		return (EAttribute) gaugeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGauge_Value() {
		return (EAttribute) gaugeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateAndTime() {
		return dateAndTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateAndTime_DateAndTime() {
		return (EAttribute) dateAndTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboWidgetFactory() {
		return comboWidgetFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComboWidgetFactory_MyComboWidget() {
		return (EReference) comboWidgetFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComboWidgetFactory_Gui() {
		return (EReference) comboWidgetFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComboWidgetFactory_Interaction_diagram() {
		return (EReference) comboWidgetFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboWidget() {
		return comboWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComboWidget_Basicwidget() {
		return (EReference) comboWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComboWidget_Combowidget() {
		return (EReference) comboWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboWidget_Index() {
		return (EAttribute) comboWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboWidget_Name() {
		return (EAttribute) comboWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboWidget_InteractionURL() {
		return (EAttribute) comboWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Name() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Scope() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Interface() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Label() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Direction() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Datatype() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Candidate_interfaces() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_From() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_To() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_ActualPar() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_Name() {
		return (EAttribute) datatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_Label() {
		return (EAttribute) datatypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_Datatype() {
		return (EAttribute) datatypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_Candidate_datatypes() {
		return (EReference) datatypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeTable() {
		return datatypeTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeTable_Datatypes() {
		return (EReference) datatypeTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeTable_Index() {
		return (EAttribute) datatypeTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeTable_Name() {
		return (EAttribute) datatypeTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceTable() {
		return interfaceTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceTable_Interfaces() {
		return (EReference) interfaceTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceTable_Index() {
		return (EAttribute) interfaceTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceTable_Name() {
		return (EAttribute) interfaceTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Signature_interfaces() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Candidates_interactions() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Label() {
		return (EAttribute) interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Name() {
		return (EAttribute) interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Signature() {
		return (EAttribute) interactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Interface() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Expression() {
		return (EAttribute) interactionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_InterfaceConnectors() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Index() {
		return (EAttribute) interactionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnector() {
		return interfaceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnector_Source() {
		return (EReference) interfaceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnector_Target() {
		return (EReference) interfaceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionTable() {
		return interactionTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionTable_Index() {
		return (EAttribute) interactionTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionTable_Name() {
		return (EAttribute) interactionTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionTable_Interactions() {
		return (EReference) interactionTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableFactory() {
		return tableFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableFactory_Interactiontable() {
		return (EReference) tableFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableFactory_Interfacetable() {
		return (EReference) tableFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableFactory_Datatypetable() {
		return (EReference) tableFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Implement_interaction() {
		return (EReference) widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getactivationStat() {
		return activationStatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetaDatatype() {
		return metaDatatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetaInterface() {
		return metaInterfaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getText() {
		return textEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActivation() {
		return activationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIDLGUIFactory getLIDLGUIFactory() {
		return (LIDLGUIFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		guiEClass = createEClass(GUI);
		createEReference(guiEClass, GUI__MAIN_INTERACTION);

		basicWidgetEClass = createEClass(BASIC_WIDGET);
		createEAttribute(basicWidgetEClass, BASIC_WIDGET__INDEX);
		createEAttribute(basicWidgetEClass, BASIC_WIDGET__NAME);

		containerEClass = createEClass(CONTAINER);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__ENABLE);

		panelEClass = createEClass(PANEL);
		createEAttribute(panelEClass, PANEL__SIZE_X);
		createEAttribute(panelEClass, PANEL__SIZE_Y);

		indicatorEClass = createEClass(INDICATOR);

		sensorEClass = createEClass(SENSOR);

		radioBoxEClass = createEClass(RADIO_BOX);
		createEAttribute(radioBoxEClass, RADIO_BOX__SIZE_X);
		createEAttribute(radioBoxEClass, RADIO_BOX__SIZE_Y);
		createEAttribute(radioBoxEClass, RADIO_BOX__LABEL_STRING_ARRAY);

		rotarySwitchEClass = createEClass(ROTARY_SWITCH);
		createEAttribute(rotarySwitchEClass, ROTARY_SWITCH__RADIUS);
		createEAttribute(rotarySwitchEClass, ROTARY_SWITCH__LEGEND);
		createEAttribute(rotarySwitchEClass, ROTARY_SWITCH__LABELS);

		comboBoxEClass = createEClass(COMBO_BOX);
		createEAttribute(comboBoxEClass, COMBO_BOX__SIZE_X);
		createEAttribute(comboBoxEClass, COMBO_BOX__SIZE_Y);
		createEAttribute(comboBoxEClass, COMBO_BOX__LABEL_STRING);

		knobEClass = createEClass(KNOB);
		createEAttribute(knobEClass, KNOB__RADIUS);
		createEAttribute(knobEClass, KNOB__LEGEND);
		createEAttribute(knobEClass, KNOB__MIN);
		createEAttribute(knobEClass, KNOB__MAX);

		pushButtonEClass = createEClass(PUSH_BUTTON);
		createEAttribute(pushButtonEClass, PUSH_BUTTON__SIZE_X);
		createEAttribute(pushButtonEClass, PUSH_BUTTON__SIZE_Y);
		createEAttribute(pushButtonEClass, PUSH_BUTTON__LABEL_STRING);
		createEAttribute(pushButtonEClass, PUSH_BUTTON__SELECTION);

		toggleButtonEClass = createEClass(TOGGLE_BUTTON);
		createEAttribute(toggleButtonEClass, TOGGLE_BUTTON__SIZE_X);
		createEAttribute(toggleButtonEClass, TOGGLE_BUTTON__SIZE_Y);
		createEAttribute(toggleButtonEClass, TOGGLE_BUTTON__LABEL_STRING);

		sliderEClass = createEClass(SLIDER);
		createEAttribute(sliderEClass, SLIDER__SIZE_X);
		createEAttribute(sliderEClass, SLIDER__SIZE_Y);
		createEAttribute(sliderEClass, SLIDER__VALUE);
		createEAttribute(sliderEClass, SLIDER__MIN_VALUE);

		scrollListEClass = createEClass(SCROLL_LIST);
		createEAttribute(scrollListEClass, SCROLL_LIST__SIZE_X);
		createEAttribute(scrollListEClass, SCROLL_LIST__SIZE_Y);
		createEAttribute(scrollListEClass, SCROLL_LIST__INNER_X);
		createEAttribute(scrollListEClass, SCROLL_LIST__INNER_Y);

		counterEClass = createEClass(COUNTER);
		createEAttribute(counterEClass, COUNTER__RADIUS);
		createEAttribute(counterEClass, COUNTER__VALUE);
		createEAttribute(counterEClass, COUNTER__MIN_VALUE);
		createEAttribute(counterEClass, COUNTER__MAX_VALUE);

		textDisplayEClass = createEClass(TEXT_DISPLAY);
		createEAttribute(textDisplayEClass, TEXT_DISPLAY__TEXT);
		createEAttribute(textDisplayEClass, TEXT_DISPLAY__LEGEND);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__SIZE_X);
		createEAttribute(ledEClass, LED__SIZE_Y);
		createEAttribute(ledEClass, LED__LED_ON);
		createEAttribute(ledEClass, LED__LEGEND);

		numberDisplayEClass = createEClass(NUMBER_DISPLAY);
		createEAttribute(numberDisplayEClass, NUMBER_DISPLAY__VALUE);
		createEAttribute(numberDisplayEClass, NUMBER_DISPLAY__LEGEND);

		gaugeEClass = createEClass(GAUGE);
		createEAttribute(gaugeEClass, GAUGE__SIZE_X);
		createEAttribute(gaugeEClass, GAUGE__SIZE_Y);
		createEAttribute(gaugeEClass, GAUGE__VALUE);

		dateAndTimeEClass = createEClass(DATE_AND_TIME);
		createEAttribute(dateAndTimeEClass, DATE_AND_TIME__DATE_AND_TIME);

		comboWidgetFactoryEClass = createEClass(COMBO_WIDGET_FACTORY);
		createEReference(comboWidgetFactoryEClass, COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET);
		createEReference(comboWidgetFactoryEClass, COMBO_WIDGET_FACTORY__GUI);
		createEReference(comboWidgetFactoryEClass, COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM);

		comboWidgetEClass = createEClass(COMBO_WIDGET);
		createEReference(comboWidgetEClass, COMBO_WIDGET__BASICWIDGET);
		createEReference(comboWidgetEClass, COMBO_WIDGET__COMBOWIDGET);
		createEAttribute(comboWidgetEClass, COMBO_WIDGET__INDEX);
		createEAttribute(comboWidgetEClass, COMBO_WIDGET__NAME);
		createEAttribute(comboWidgetEClass, COMBO_WIDGET__INTERACTION_URL);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NAME);
		createEAttribute(interfaceEClass, INTERFACE__SCOPE);
		createEAttribute(interfaceEClass, INTERFACE__INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__LABEL);
		createEAttribute(interfaceEClass, INTERFACE__DIRECTION);
		createEReference(interfaceEClass, INTERFACE__DATATYPE);
		createEReference(interfaceEClass, INTERFACE__CANDIDATE_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__FROM);
		createEReference(interfaceEClass, INTERFACE__TO);
		createEAttribute(interfaceEClass, INTERFACE__ACTUAL_PAR);

		datatypeEClass = createEClass(DATATYPE);
		createEAttribute(datatypeEClass, DATATYPE__NAME);
		createEAttribute(datatypeEClass, DATATYPE__LABEL);
		createEAttribute(datatypeEClass, DATATYPE__DATATYPE);
		createEReference(datatypeEClass, DATATYPE__CANDIDATE_DATATYPES);

		datatypeTableEClass = createEClass(DATATYPE_TABLE);
		createEReference(datatypeTableEClass, DATATYPE_TABLE__DATATYPES);
		createEAttribute(datatypeTableEClass, DATATYPE_TABLE__INDEX);
		createEAttribute(datatypeTableEClass, DATATYPE_TABLE__NAME);

		interfaceTableEClass = createEClass(INTERFACE_TABLE);
		createEReference(interfaceTableEClass, INTERFACE_TABLE__INTERFACES);
		createEAttribute(interfaceTableEClass, INTERFACE_TABLE__INDEX);
		createEAttribute(interfaceTableEClass, INTERFACE_TABLE__NAME);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__SIGNATURE_INTERFACES);
		createEReference(interactionEClass, INTERACTION__CANDIDATES_INTERACTIONS);
		createEAttribute(interactionEClass, INTERACTION__LABEL);
		createEAttribute(interactionEClass, INTERACTION__NAME);
		createEAttribute(interactionEClass, INTERACTION__SIGNATURE);
		createEReference(interactionEClass, INTERACTION__INTERFACE);
		createEAttribute(interactionEClass, INTERACTION__EXPRESSION);
		createEReference(interactionEClass, INTERACTION__INTERFACE_CONNECTORS);
		createEAttribute(interactionEClass, INTERACTION__INDEX);

		interfaceConnectorEClass = createEClass(INTERFACE_CONNECTOR);
		createEReference(interfaceConnectorEClass, INTERFACE_CONNECTOR__SOURCE);
		createEReference(interfaceConnectorEClass, INTERFACE_CONNECTOR__TARGET);

		interactionTableEClass = createEClass(INTERACTION_TABLE);
		createEAttribute(interactionTableEClass, INTERACTION_TABLE__INDEX);
		createEAttribute(interactionTableEClass, INTERACTION_TABLE__NAME);
		createEReference(interactionTableEClass, INTERACTION_TABLE__INTERACTIONS);

		tableFactoryEClass = createEClass(TABLE_FACTORY);
		createEReference(tableFactoryEClass, TABLE_FACTORY__INTERACTIONTABLE);
		createEReference(tableFactoryEClass, TABLE_FACTORY__INTERFACETABLE);
		createEReference(tableFactoryEClass, TABLE_FACTORY__DATATYPETABLE);

		widgetEClass = createEClass(WIDGET);
		createEReference(widgetEClass, WIDGET__IMPLEMENT_INTERACTION);

		// Create enums
		activationStatEEnum = createEEnum(ACTIVATION_STAT);
		directionEEnum = createEEnum(DIRECTION);
		metaDatatypeEEnum = createEEnum(META_DATATYPE);
		metaInterfaceEEnum = createEEnum(META_INTERFACE);
		scopeEEnum = createEEnum(SCOPE);

		// Create data types
		numberEDataType = createEDataType(NUMBER);
		booleanEDataType = createEDataType(BOOLEAN);
		textEDataType = createEDataType(TEXT);
		activationEDataType = createEDataType(ACTIVATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guiEClass.getESuperTypes().add(this.getComboWidget());
		basicWidgetEClass.getESuperTypes().add(this.getWidget());
		containerEClass.getESuperTypes().add(this.getComboWidget());
		buttonEClass.getESuperTypes().add(this.getBasicWidget());
		panelEClass.getESuperTypes().add(this.getContainer());
		indicatorEClass.getESuperTypes().add(this.getBasicWidget());
		sensorEClass.getESuperTypes().add(this.getBasicWidget());
		radioBoxEClass.getESuperTypes().add(this.getButton());
		rotarySwitchEClass.getESuperTypes().add(this.getButton());
		comboBoxEClass.getESuperTypes().add(this.getButton());
		knobEClass.getESuperTypes().add(this.getButton());
		pushButtonEClass.getESuperTypes().add(this.getButton());
		toggleButtonEClass.getESuperTypes().add(this.getButton());
		sliderEClass.getESuperTypes().add(this.getButton());
		scrollListEClass.getESuperTypes().add(this.getContainer());
		counterEClass.getESuperTypes().add(this.getIndicator());
		textDisplayEClass.getESuperTypes().add(this.getIndicator());
		ledEClass.getESuperTypes().add(this.getIndicator());
		numberDisplayEClass.getESuperTypes().add(this.getIndicator());
		gaugeEClass.getESuperTypes().add(this.getIndicator());
		dateAndTimeEClass.getESuperTypes().add(this.getSensor());
		comboWidgetEClass.getESuperTypes().add(this.getWidget());

		// Initialize classes, features, and operations; add parameters
		initEClass(guiEClass, org.eclipse.sirius.LIDLGUI.GUI.class, "GUI", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUI_Main_interaction(), this.getInteraction(), null, "main_interaction", null, 0, -1,
				org.eclipse.sirius.LIDLGUI.GUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicWidgetEClass, BasicWidget.class, "BasicWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicWidget_Index(), this.getNumber(), "index", null, 0, 1, BasicWidget.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicWidget_Name(), this.getText(), "name", null, 0, 1, BasicWidget.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.eclipse.sirius.LIDLGUI.Container.class, "Container", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Enable(), this.getBoolean(), "Enable", null, 0, 1, Button.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanel_SizeX(), this.getNumber(), "SizeX", null, 0, 1, Panel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_SizeY(), this.getNumber(), "SizeY", null, 0, 1, Panel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indicatorEClass, Indicator.class, "Indicator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioBoxEClass, RadioBox.class, "RadioBox", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioBox_SizeX(), this.getNumber(), "SizeX", null, 0, 1, RadioBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadioBox_SizeY(), this.getNumber(), "SizeY", null, 0, 1, RadioBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadioBox_LabelStringArray(), theXMLTypePackage.getENTITIES(), "LabelStringArray", null, 0, 1,
				RadioBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(rotarySwitchEClass, RotarySwitch.class, "RotarySwitch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotarySwitch_Radius(), this.getNumber(), "Radius", null, 0, 1, RotarySwitch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotarySwitch_Legend(), theXMLTypePackage.getString(), "Legend", null, 0, 1,
				RotarySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotarySwitch_Labels(), theXMLTypePackage.getENTITIES(), "Labels", null, 0, 1,
				RotarySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComboBox_SizeX(), theXMLTypePackage.getDouble(), "SizeX", null, 0, 1, ComboBox.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboBox_SizeY(), theXMLTypePackage.getDouble(), "SizeY", null, 0, 1, ComboBox.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboBox_LabelString(), theXMLTypePackage.getString(), "LabelString", null, 0, 1,
				ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(knobEClass, Knob.class, "Knob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnob_Radius(), theXMLTypePackage.getDouble(), "Radius", null, 0, 1, Knob.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnob_Legend(), theXMLTypePackage.getString(), "Legend", null, 0, 1, Knob.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnob_Min(), theXMLTypePackage.getDouble(), "Min", null, 0, 1, Knob.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnob_Max(), theXMLTypePackage.getDouble(), "Max", null, 0, 1, Knob.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushButtonEClass, PushButton.class, "PushButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPushButton_SizeX(), theXMLTypePackage.getDouble(), "SizeX", null, 0, 1, PushButton.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushButton_SizeY(), theXMLTypePackage.getDouble(), "SizeY", null, 0, 1, PushButton.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushButton_LabelString(), theXMLTypePackage.getString(), "LabelString", null, 0, 1,
				PushButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushButton_Selection(), theXMLTypePackage.getBoolean(), "Selection", null, 0, 1,
				PushButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(toggleButtonEClass, ToggleButton.class, "ToggleButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleButton_SizeX(), theXMLTypePackage.getDouble(), "SizeX", null, 0, 1, ToggleButton.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToggleButton_SizeY(), theXMLTypePackage.getDouble(), "SizeY", null, 0, 1, ToggleButton.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToggleButton_LabelString(), theXMLTypePackage.getString(), "LabelString", null, 0, 1,
				ToggleButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sliderEClass, Slider.class, "Slider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlider_SizeX(), theXMLTypePackage.getDouble(), "SizeX", null, 0, 1, Slider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlider_SizeY(), theXMLTypePackage.getDouble(), "SizeY", null, 0, 1, Slider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlider_Value(), theXMLTypePackage.getDouble(), "Value", null, 0, 1, Slider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlider_MinValue(), theXMLTypePackage.getDouble(), "MinValue", null, 0, 1, Slider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scrollListEClass, ScrollList.class, "ScrollList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScrollList_SizeX(), theXMLTypePackage.getDouble(), "SizeX", null, 0, 1, ScrollList.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollList_SizeY(), theXMLTypePackage.getDouble(), "SizeY", null, 0, 1, ScrollList.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollList_InnerX(), theXMLTypePackage.getDouble(), "InnerX", null, 0, 1, ScrollList.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollList_InnerY(), theXMLTypePackage.getDouble(), "InnerY", null, 0, 1, ScrollList.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounter_Radius(), this.getNumber(), "Radius", null, 0, 1, Counter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_Value(), this.getNumber(), "Value", null, 0, 1, Counter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_MinValue(), this.getNumber(), "MinValue", null, 0, 1, Counter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_MaxValue(), this.getNumber(), "MaxValue", null, 0, 1, Counter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textDisplayEClass, TextDisplay.class, "TextDisplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextDisplay_Text(), this.getText(), "Text", null, 0, 1, TextDisplay.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextDisplay_Legend(), this.getText(), "Legend", null, 0, 1, TextDisplay.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, org.eclipse.sirius.LIDLGUI.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLED_SizeX(), this.getNumber(), "SizeX", null, 0, 1, org.eclipse.sirius.LIDLGUI.LED.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLED_SizeY(), this.getNumber(), "SizeY", null, 0, 1, org.eclipse.sirius.LIDLGUI.LED.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLED_LEDOn(), this.getActivation(), "LEDOn", null, 0, 1, org.eclipse.sirius.LIDLGUI.LED.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLED_Legend(), this.getText(), "Legend", null, 0, 1, org.eclipse.sirius.LIDLGUI.LED.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberDisplayEClass, NumberDisplay.class, "NumberDisplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberDisplay_Value(), this.getNumber(), "Value", null, 0, 1, NumberDisplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDisplay_Legend(), this.getNumber(), "Legend", null, 0, 1, NumberDisplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaugeEClass, Gauge.class, "Gauge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGauge_SizeX(), this.getNumber(), "SizeX", null, 0, 1, Gauge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGauge_SizeY(), this.getNumber(), "SizeY", null, 0, 1, Gauge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGauge_Value(), this.getNumber(), "Value", null, 0, 1, Gauge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateAndTimeEClass, DateAndTime.class, "DateAndTime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateAndTime_DateAndTime(), theXMLTypePackage.getDateTime(), "dateAndTime", null, 0, 1,
				DateAndTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(comboWidgetFactoryEClass, ComboWidgetFactory.class, "ComboWidgetFactory", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComboWidgetFactory_MyComboWidget(), this.getComboWidget(), null, "myComboWidget", null, 0, -1,
				ComboWidgetFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComboWidgetFactory_Gui(), this.getGUI(), null, "gui", null, 0, -1, ComboWidgetFactory.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComboWidgetFactory_Interaction_diagram(), this.getInteraction(), null, "interaction_diagram",
				null, 0, -1, ComboWidgetFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboWidgetEClass, ComboWidget.class, "ComboWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComboWidget_Basicwidget(), this.getBasicWidget(), null, "basicwidget", null, 0, -1,
				ComboWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComboWidget_Combowidget(), this.getComboWidget(), null, "combowidget", null, 0, -1,
				ComboWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboWidget_Index(), this.getNumber(), "index", null, 0, 1, ComboWidget.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboWidget_Name(), this.getText(), "name", null, 0, 1, ComboWidget.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboWidget_InteractionURL(), this.getText(), "InteractionURL", null, 0, 1, ComboWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Name(), this.getText(), "name", null, 0, 1, Interface.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Scope(), this.getScope(), "scope", null, 0, 1, Interface.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Interface(), this.getMetaInterface(), "interface", null, 0, 1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Label(), this.getText(), "label", null, 0, 1, Interface.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Direction(), this.getDirection(), "direction", null, 0, 1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Datatype(), this.getDatatype(), null, "datatype", null, 0, 1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Candidate_interfaces(), this.getInterface(), null, "candidate_interfaces", null, 0,
				-1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_From(), this.getInterfaceConnector(), this.getInterfaceConnector_Source(), "from",
				null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_To(), this.getInterfaceConnector(), this.getInterfaceConnector_Target(), "to", null,
				0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_ActualPar(), ecorePackage.getEString(), "actualPar", null, 0, 1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatype_Name(), this.getText(), "name", null, 0, 1, Datatype.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatype_Label(), this.getText(), "label", null, 0, 1, Datatype.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatype_Datatype(), this.getMetaDatatype(), "datatype", null, 0, 1, Datatype.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatype_Candidate_datatypes(), this.getDatatype(), null, "candidate_datatypes", null, 0, -1,
				Datatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeTableEClass, DatatypeTable.class, "DatatypeTable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeTable_Datatypes(), this.getDatatype(), null, "datatypes", null, 0, -1,
				DatatypeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatypeTable_Index(), this.getNumber(), "index", null, 0, 1, DatatypeTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatypeTable_Name(), this.getText(), "name", null, 0, 1, DatatypeTable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceTableEClass, InterfaceTable.class, "InterfaceTable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceTable_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1,
				InterfaceTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceTable_Index(), this.getNumber(), "index", null, 0, 1, InterfaceTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceTable_Name(), this.getText(), "name", null, 0, 1, InterfaceTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Signature_interfaces(), this.getInterface(), null, "signature_interfaces", null,
				0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Candidates_interactions(), this.getInteraction(), null, "candidates_interactions",
				null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Label(), this.getText(), "label", null, 0, 1, Interaction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Name(), this.getText(), "name", null, 0, 1, Interaction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Signature(), this.getText(), "signature", null, 0, 1, Interaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Interface(), this.getInterface(), null, "interface", null, 1, 1,
				Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Expression(), this.getText(), "expression", null, 0, 1, Interaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_InterfaceConnectors(), this.getInterfaceConnector(), null, "interfaceConnectors",
				null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Index(), this.getNumber(), "index", null, 0, 1, Interaction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceConnectorEClass, InterfaceConnector.class, "InterfaceConnector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnector_Source(), this.getInterface(), this.getInterface_From(), "source", null, 0,
				1, InterfaceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConnector_Target(), this.getInterface(), this.getInterface_To(), "target", null, 0,
				1, InterfaceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionTableEClass, InteractionTable.class, "InteractionTable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionTable_Index(), this.getNumber(), "index", null, 0, 1, InteractionTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionTable_Name(), this.getText(), "name", null, 0, 1, InteractionTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionTable_Interactions(), this.getInteraction(), null, "interactions", null, 0, -1,
				InteractionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableFactoryEClass, TableFactory.class, "TableFactory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableFactory_Interactiontable(), this.getInteractionTable(), null, "interactiontable", null,
				0, -1, TableFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableFactory_Interfacetable(), this.getInterfaceTable(), null, "interfacetable", null, 0, -1,
				TableFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableFactory_Datatypetable(), this.getDatatypeTable(), null, "datatypetable", null, 0, -1,
				TableFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidget_Implement_interaction(), this.getInteraction(), null, "Implement_interaction", null, 0,
				-1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activationStatEEnum, activationStat.class, "activationStat");
		addEEnumLiteral(activationStatEEnum, activationStat.ACTIVE);
		addEEnumLiteral(activationStatEEnum, activationStat.INACTIVE);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.IO);
		addEEnumLiteral(directionEEnum, Direction.NULL);

		initEEnum(metaDatatypeEEnum, MetaDatatype.class, "MetaDatatype");
		addEEnumLiteral(metaDatatypeEEnum, MetaDatatype.COMPOSITE);
		addEEnumLiteral(metaDatatypeEEnum, MetaDatatype.NUMBER);
		addEEnumLiteral(metaDatatypeEEnum, MetaDatatype.BOOLEAN);
		addEEnumLiteral(metaDatatypeEEnum, MetaDatatype.TEXT);
		addEEnumLiteral(metaDatatypeEEnum, MetaDatatype.ACTIVATION);

		initEEnum(metaInterfaceEEnum, MetaInterface.class, "MetaInterface");
		addEEnumLiteral(metaInterfaceEEnum, MetaInterface.COMPOSITE);
		addEEnumLiteral(metaInterfaceEEnum, MetaInterface.ATOMIC);
		addEEnumLiteral(metaInterfaceEEnum, MetaInterface.SIMPLE);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.GLOBAL);
		addEEnumLiteral(scopeEEnum, Scope.LOCAL);

		// Initialize data types
		initEDataType(numberEDataType, double.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textEDataType, String.class, "Text", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(activationEDataType, activationStat.class, "Activation", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LIDLGUIPackageImpl
