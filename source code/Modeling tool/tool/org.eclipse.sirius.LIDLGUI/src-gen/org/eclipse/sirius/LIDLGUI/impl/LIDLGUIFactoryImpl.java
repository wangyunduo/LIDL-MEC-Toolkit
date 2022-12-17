/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.LIDLGUI.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LIDLGUIFactoryImpl extends EFactoryImpl implements LIDLGUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LIDLGUIFactory init() {
		try {
			LIDLGUIFactory theLIDLGUIFactory = (LIDLGUIFactory) EPackage.Registry.INSTANCE
					.getEFactory(LIDLGUIPackage.eNS_URI);
			if (theLIDLGUIFactory != null) {
				return theLIDLGUIFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LIDLGUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIDLGUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LIDLGUIPackage.GUI:
			return createGUI();
		case LIDLGUIPackage.BASIC_WIDGET:
			return createBasicWidget();
		case LIDLGUIPackage.CONTAINER:
			return createContainer();
		case LIDLGUIPackage.BUTTON:
			return createButton();
		case LIDLGUIPackage.PANEL:
			return createPanel();
		case LIDLGUIPackage.INDICATOR:
			return createIndicator();
		case LIDLGUIPackage.SENSOR:
			return createSensor();
		case LIDLGUIPackage.RADIO_BOX:
			return createRadioBox();
		case LIDLGUIPackage.ROTARY_SWITCH:
			return createRotarySwitch();
		case LIDLGUIPackage.COMBO_BOX:
			return createComboBox();
		case LIDLGUIPackage.KNOB:
			return createKnob();
		case LIDLGUIPackage.PUSH_BUTTON:
			return createPushButton();
		case LIDLGUIPackage.TOGGLE_BUTTON:
			return createToggleButton();
		case LIDLGUIPackage.SLIDER:
			return createSlider();
		case LIDLGUIPackage.SCROLL_LIST:
			return createScrollList();
		case LIDLGUIPackage.COUNTER:
			return createCounter();
		case LIDLGUIPackage.TEXT_DISPLAY:
			return createTextDisplay();
		case LIDLGUIPackage.LED:
			return createLED();
		case LIDLGUIPackage.NUMBER_DISPLAY:
			return createNumberDisplay();
		case LIDLGUIPackage.GAUGE:
			return createGauge();
		case LIDLGUIPackage.DATE_AND_TIME:
			return createDateAndTime();
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY:
			return createComboWidgetFactory();
		case LIDLGUIPackage.COMBO_WIDGET:
			return createComboWidget();
		case LIDLGUIPackage.INTERFACE:
			return createInterface();
		case LIDLGUIPackage.DATATYPE:
			return createDatatype();
		case LIDLGUIPackage.DATATYPE_TABLE:
			return createDatatypeTable();
		case LIDLGUIPackage.INTERFACE_TABLE:
			return createInterfaceTable();
		case LIDLGUIPackage.INTERACTION:
			return createInteraction();
		case LIDLGUIPackage.INTERFACE_CONNECTOR:
			return createInterfaceConnector();
		case LIDLGUIPackage.INTERACTION_TABLE:
			return createInteractionTable();
		case LIDLGUIPackage.TABLE_FACTORY:
			return createTableFactory();
		case LIDLGUIPackage.WIDGET:
			return createWidget();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case LIDLGUIPackage.ACTIVATION_STAT:
			return createactivationStatFromString(eDataType, initialValue);
		case LIDLGUIPackage.DIRECTION:
			return createDirectionFromString(eDataType, initialValue);
		case LIDLGUIPackage.META_DATATYPE:
			return createMetaDatatypeFromString(eDataType, initialValue);
		case LIDLGUIPackage.META_INTERFACE:
			return createMetaInterfaceFromString(eDataType, initialValue);
		case LIDLGUIPackage.SCOPE:
			return createScopeFromString(eDataType, initialValue);
		case LIDLGUIPackage.NUMBER:
			return createNumberFromString(eDataType, initialValue);
		case LIDLGUIPackage.BOOLEAN:
			return createBooleanFromString(eDataType, initialValue);
		case LIDLGUIPackage.TEXT:
			return createTextFromString(eDataType, initialValue);
		case LIDLGUIPackage.ACTIVATION:
			return createActivationFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case LIDLGUIPackage.ACTIVATION_STAT:
			return convertactivationStatToString(eDataType, instanceValue);
		case LIDLGUIPackage.DIRECTION:
			return convertDirectionToString(eDataType, instanceValue);
		case LIDLGUIPackage.META_DATATYPE:
			return convertMetaDatatypeToString(eDataType, instanceValue);
		case LIDLGUIPackage.META_INTERFACE:
			return convertMetaInterfaceToString(eDataType, instanceValue);
		case LIDLGUIPackage.SCOPE:
			return convertScopeToString(eDataType, instanceValue);
		case LIDLGUIPackage.NUMBER:
			return convertNumberToString(eDataType, instanceValue);
		case LIDLGUIPackage.BOOLEAN:
			return convertBooleanToString(eDataType, instanceValue);
		case LIDLGUIPackage.TEXT:
			return convertTextToString(eDataType, instanceValue);
		case LIDLGUIPackage.ACTIVATION:
			return convertActivationToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUI createGUI() {
		GUIImpl gui = new GUIImpl();
		return gui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicWidget createBasicWidget() {
		BasicWidgetImpl basicWidget = new BasicWidgetImpl();
		return basicWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.sirius.LIDLGUI.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel createPanel() {
		PanelImpl panel = new PanelImpl();
		return panel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indicator createIndicator() {
		IndicatorImpl indicator = new IndicatorImpl();
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioBox createRadioBox() {
		RadioBoxImpl radioBox = new RadioBoxImpl();
		return radioBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotarySwitch createRotarySwitch() {
		RotarySwitchImpl rotarySwitch = new RotarySwitchImpl();
		return rotarySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knob createKnob() {
		KnobImpl knob = new KnobImpl();
		return knob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButton createPushButton() {
		PushButtonImpl pushButton = new PushButtonImpl();
		return pushButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleButton createToggleButton() {
		ToggleButtonImpl toggleButton = new ToggleButtonImpl();
		return toggleButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slider createSlider() {
		SliderImpl slider = new SliderImpl();
		return slider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollList createScrollList() {
		ScrollListImpl scrollList = new ScrollListImpl();
		return scrollList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDisplay createTextDisplay() {
		TextDisplayImpl textDisplay = new TextDisplayImpl();
		return textDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberDisplay createNumberDisplay() {
		NumberDisplayImpl numberDisplay = new NumberDisplayImpl();
		return numberDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gauge createGauge() {
		GaugeImpl gauge = new GaugeImpl();
		return gauge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateAndTime createDateAndTime() {
		DateAndTimeImpl dateAndTime = new DateAndTimeImpl();
		return dateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboWidgetFactory createComboWidgetFactory() {
		ComboWidgetFactoryImpl comboWidgetFactory = new ComboWidgetFactoryImpl();
		return comboWidgetFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboWidget createComboWidget() {
		ComboWidgetImpl comboWidget = new ComboWidgetImpl();
		return comboWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeTable createDatatypeTable() {
		DatatypeTableImpl datatypeTable = new DatatypeTableImpl();
		return datatypeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTable createInterfaceTable() {
		InterfaceTableImpl interfaceTable = new InterfaceTableImpl();
		return interfaceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector createInterfaceConnector() {
		InterfaceConnectorImpl interfaceConnector = new InterfaceConnectorImpl();
		return interfaceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTable createInteractionTable() {
		InteractionTableImpl interactionTable = new InteractionTableImpl();
		return interactionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFactory createTableFactory() {
		TableFactoryImpl tableFactory = new TableFactoryImpl();
		return tableFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activationStat createactivationStatFromString(EDataType eDataType, String initialValue) {
		activationStat result = activationStat.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertactivationStatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaDatatype createMetaDatatypeFromString(EDataType eDataType, String initialValue) {
		MetaDatatype result = MetaDatatype.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetaDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaInterface createMetaInterfaceFromString(EDataType eDataType, String initialValue) {
		MetaInterface result = MetaInterface.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetaInterfaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createNumberFromString(EDataType eDataType, String initialValue) {
		return (Double) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createActivationFromString(EDataType eDataType, String initialValue) {
		return (Object) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIDLGUIPackage getLIDLGUIPackage() {
		return (LIDLGUIPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LIDLGUIPackage getPackage() {
		return LIDLGUIPackage.eINSTANCE;
	}

} //LIDLGUIFactoryImpl
