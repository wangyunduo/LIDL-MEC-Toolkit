/**
 */
package org.eclipse.sirius.LIDLGUI.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sirius.LIDLGUI.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage
 * @generated
 */
public class LIDLGUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LIDLGUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIDLGUISwitch() {
		if (modelPackage == null) {
			modelPackage = LIDLGUIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LIDLGUIPackage.GUI: {
			GUI gui = (GUI) theEObject;
			T result = caseGUI(gui);
			if (result == null)
				result = caseComboWidget(gui);
			if (result == null)
				result = caseWidget(gui);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.BASIC_WIDGET: {
			BasicWidget basicWidget = (BasicWidget) theEObject;
			T result = caseBasicWidget(basicWidget);
			if (result == null)
				result = caseWidget(basicWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = caseComboWidget(container);
			if (result == null)
				result = caseWidget(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.BUTTON: {
			Button button = (Button) theEObject;
			T result = caseButton(button);
			if (result == null)
				result = caseBasicWidget(button);
			if (result == null)
				result = caseWidget(button);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.PANEL: {
			Panel panel = (Panel) theEObject;
			T result = casePanel(panel);
			if (result == null)
				result = caseContainer(panel);
			if (result == null)
				result = caseComboWidget(panel);
			if (result == null)
				result = caseWidget(panel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.INDICATOR: {
			Indicator indicator = (Indicator) theEObject;
			T result = caseIndicator(indicator);
			if (result == null)
				result = caseBasicWidget(indicator);
			if (result == null)
				result = caseWidget(indicator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseBasicWidget(sensor);
			if (result == null)
				result = caseWidget(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.RADIO_BOX: {
			RadioBox radioBox = (RadioBox) theEObject;
			T result = caseRadioBox(radioBox);
			if (result == null)
				result = caseButton(radioBox);
			if (result == null)
				result = caseBasicWidget(radioBox);
			if (result == null)
				result = caseWidget(radioBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.ROTARY_SWITCH: {
			RotarySwitch rotarySwitch = (RotarySwitch) theEObject;
			T result = caseRotarySwitch(rotarySwitch);
			if (result == null)
				result = caseButton(rotarySwitch);
			if (result == null)
				result = caseBasicWidget(rotarySwitch);
			if (result == null)
				result = caseWidget(rotarySwitch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.COMBO_BOX: {
			ComboBox comboBox = (ComboBox) theEObject;
			T result = caseComboBox(comboBox);
			if (result == null)
				result = caseButton(comboBox);
			if (result == null)
				result = caseBasicWidget(comboBox);
			if (result == null)
				result = caseWidget(comboBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.KNOB: {
			Knob knob = (Knob) theEObject;
			T result = caseKnob(knob);
			if (result == null)
				result = caseButton(knob);
			if (result == null)
				result = caseBasicWidget(knob);
			if (result == null)
				result = caseWidget(knob);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.PUSH_BUTTON: {
			PushButton pushButton = (PushButton) theEObject;
			T result = casePushButton(pushButton);
			if (result == null)
				result = caseButton(pushButton);
			if (result == null)
				result = caseBasicWidget(pushButton);
			if (result == null)
				result = caseWidget(pushButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.TOGGLE_BUTTON: {
			ToggleButton toggleButton = (ToggleButton) theEObject;
			T result = caseToggleButton(toggleButton);
			if (result == null)
				result = caseButton(toggleButton);
			if (result == null)
				result = caseBasicWidget(toggleButton);
			if (result == null)
				result = caseWidget(toggleButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.SLIDER: {
			Slider slider = (Slider) theEObject;
			T result = caseSlider(slider);
			if (result == null)
				result = caseButton(slider);
			if (result == null)
				result = caseBasicWidget(slider);
			if (result == null)
				result = caseWidget(slider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.SCROLL_LIST: {
			ScrollList scrollList = (ScrollList) theEObject;
			T result = caseScrollList(scrollList);
			if (result == null)
				result = caseContainer(scrollList);
			if (result == null)
				result = caseComboWidget(scrollList);
			if (result == null)
				result = caseWidget(scrollList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.COUNTER: {
			Counter counter = (Counter) theEObject;
			T result = caseCounter(counter);
			if (result == null)
				result = caseIndicator(counter);
			if (result == null)
				result = caseBasicWidget(counter);
			if (result == null)
				result = caseWidget(counter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.TEXT_DISPLAY: {
			TextDisplay textDisplay = (TextDisplay) theEObject;
			T result = caseTextDisplay(textDisplay);
			if (result == null)
				result = caseIndicator(textDisplay);
			if (result == null)
				result = caseBasicWidget(textDisplay);
			if (result == null)
				result = caseWidget(textDisplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.LED: {
			LED led = (LED) theEObject;
			T result = caseLED(led);
			if (result == null)
				result = caseIndicator(led);
			if (result == null)
				result = caseBasicWidget(led);
			if (result == null)
				result = caseWidget(led);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.NUMBER_DISPLAY: {
			NumberDisplay numberDisplay = (NumberDisplay) theEObject;
			T result = caseNumberDisplay(numberDisplay);
			if (result == null)
				result = caseIndicator(numberDisplay);
			if (result == null)
				result = caseBasicWidget(numberDisplay);
			if (result == null)
				result = caseWidget(numberDisplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.GAUGE: {
			Gauge gauge = (Gauge) theEObject;
			T result = caseGauge(gauge);
			if (result == null)
				result = caseIndicator(gauge);
			if (result == null)
				result = caseBasicWidget(gauge);
			if (result == null)
				result = caseWidget(gauge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.DATE_AND_TIME: {
			DateAndTime dateAndTime = (DateAndTime) theEObject;
			T result = caseDateAndTime(dateAndTime);
			if (result == null)
				result = caseSensor(dateAndTime);
			if (result == null)
				result = caseBasicWidget(dateAndTime);
			if (result == null)
				result = caseWidget(dateAndTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY: {
			ComboWidgetFactory comboWidgetFactory = (ComboWidgetFactory) theEObject;
			T result = caseComboWidgetFactory(comboWidgetFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.COMBO_WIDGET: {
			ComboWidget comboWidget = (ComboWidget) theEObject;
			T result = caseComboWidget(comboWidget);
			if (result == null)
				result = caseWidget(comboWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.DATATYPE: {
			Datatype datatype = (Datatype) theEObject;
			T result = caseDatatype(datatype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.DATATYPE_TABLE: {
			DatatypeTable datatypeTable = (DatatypeTable) theEObject;
			T result = caseDatatypeTable(datatypeTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.INTERFACE_TABLE: {
			InterfaceTable interfaceTable = (InterfaceTable) theEObject;
			T result = caseInterfaceTable(interfaceTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.INTERACTION: {
			Interaction interaction = (Interaction) theEObject;
			T result = caseInteraction(interaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.INTERFACE_CONNECTOR: {
			InterfaceConnector interfaceConnector = (InterfaceConnector) theEObject;
			T result = caseInterfaceConnector(interfaceConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.INTERACTION_TABLE: {
			InteractionTable interactionTable = (InteractionTable) theEObject;
			T result = caseInteractionTable(interactionTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.TABLE_FACTORY: {
			TableFactory tableFactory = (TableFactory) theEObject;
			T result = caseTableFactory(tableFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LIDLGUIPackage.WIDGET: {
			Widget widget = (Widget) theEObject;
			T result = caseWidget(widget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUI(GUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicWidget(BasicWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndicator(Indicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioBox(RadioBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotary Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotary Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotarySwitch(RotarySwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboBox(ComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnob(Knob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushButton(PushButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleButton(ToggleButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlider(Slider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollList(ScrollList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDisplay(TextDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLED(LED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberDisplay(NumberDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gauge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gauge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGauge(Gauge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date And Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date And Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateAndTime(DateAndTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo Widget Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo Widget Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboWidgetFactory(ComboWidgetFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboWidget(ComboWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeTable(DatatypeTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceTable(InterfaceTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnector(InterfaceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionTable(InteractionTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableFactory(TableFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LIDLGUISwitch
