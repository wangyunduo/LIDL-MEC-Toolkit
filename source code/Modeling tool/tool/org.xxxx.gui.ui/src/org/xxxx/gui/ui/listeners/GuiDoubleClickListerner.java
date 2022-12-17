package org.xxxx.gui.ui.listeners;

import java.lang.reflect.Field;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.eclipse.sirius.table.business.internal.metamodel.spec.DCellSpec;
import org.eclipse.sirius.table.business.internal.metamodel.spec.DLineSpec;
import org.eclipse.sirius.table.ui.tools.internal.editor.DTableTreeViewer;

public class GuiDoubleClickListerner implements IDoubleClickListener {
	
	private final DTableTreeViewer viewer;
	
	public GuiDoubleClickListerner(DTableTreeViewer viewer) {
		this.viewer = viewer;
	}
	
	@Override
	public void doubleClick(DoubleClickEvent event) {
		Object selection = viewer.getSelection();
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		IStructuredSelection sel = (IStructuredSelection) selection;
		if (!(sel instanceof TreeSelection)) {
			return;
		}
		DTableTreeViewer tv = (DTableTreeViewer) event.getSource();
		DCellSpec selectedCell = (DCellSpec) getFieldValueByFieldName("selectedCell", tv);
		if (selectedCell != null) {
			realDoubleClick(sel, selectedCell);
		}
	}
	
	private void realDoubleClick(IStructuredSelection sel, DCellSpec selectedCell) {
		TreeSelection clickedElement = (TreeSelection) sel;
		DLineSpec spec = (DLineSpec) clickedElement.getFirstElement();
		Object object = spec.getSemanticElements().get(0);
		GuiUtils.transaction((session) -> {
			String label = selectedCell.getColumn().getLabel();
		});
	}
	
	private Object getFieldValueByFieldName(String fieldName, Object object) {
		try {
			Field field = object.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(object);
		} catch (Exception e) {
			return null;
		}
	}
}
