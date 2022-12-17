/**
 */
package org.eclipse.sirius.LIDLGUI.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.LIDLGUIFactory;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.LIDLGUI.ComboWidget} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComboWidgetItemProvider extends WidgetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboWidgetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIndexPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addInteractionURLPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComboWidget_index_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComboWidget_index_feature",
								"_UI_ComboWidget_type"),
						LIDLGUIPackage.Literals.COMBO_WIDGET__INDEX, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComboWidget_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComboWidget_name_feature",
								"_UI_ComboWidget_type"),
						LIDLGUIPackage.Literals.COMBO_WIDGET__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Interaction URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteractionURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComboWidget_InteractionURL_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComboWidget_InteractionURL_feature",
								"_UI_ComboWidget_type"),
						LIDLGUIPackage.Literals.COMBO_WIDGET__INTERACTION_URL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET);
			childrenFeatures.add(LIDLGUIPackage.Literals.COMBO_WIDGET__COMBOWIDGET);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComboWidget.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComboWidget"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComboWidget) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ComboWidget_type")
				: getString("_UI_ComboWidget_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComboWidget.class)) {
		case LIDLGUIPackage.COMBO_WIDGET__INDEX:
		case LIDLGUIPackage.COMBO_WIDGET__NAME:
		case LIDLGUIPackage.COMBO_WIDGET__INTERACTION_URL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case LIDLGUIPackage.COMBO_WIDGET__BASICWIDGET:
		case LIDLGUIPackage.COMBO_WIDGET__COMBOWIDGET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createBasicWidget()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createIndicator()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createRadioBox()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createRotarySwitch()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createKnob()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createPushButton()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createToggleButton()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createSlider()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createTextDisplay()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createLED()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createNumberDisplay()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createGauge()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__BASICWIDGET,
				LIDLGUIFactory.eINSTANCE.createDateAndTime()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__COMBOWIDGET,
				LIDLGUIFactory.eINSTANCE.createComboWidget()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__COMBOWIDGET,
				LIDLGUIFactory.eINSTANCE.createGUI()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__COMBOWIDGET,
				LIDLGUIFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__COMBOWIDGET,
				LIDLGUIFactory.eINSTANCE.createPanel()));

		newChildDescriptors.add(createChildParameter(LIDLGUIPackage.Literals.COMBO_WIDGET__COMBOWIDGET,
				LIDLGUIFactory.eINSTANCE.createScrollList()));
	}

}
