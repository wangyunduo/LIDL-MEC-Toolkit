package org.xxxx.gui.ui.views.navigator;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.xxxx.gui.ui.views.navigator.collection.NavigatorCollection;

public class GuiContentProvider implements ITreeContentProvider, IResourceChangeListener {
	
	private Viewer viewer;
	
	public GuiContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				if (!getViewer().getControl().isDisposed()) {
					getViewer().refresh();
				}
			}
		});
	}
	
	private Viewer getViewer() {
		return this.viewer;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof GuiNavigatorRoot) {
			GuiNavigatorRoot root = (GuiNavigatorRoot) parentElement;
			return root.getSubCollections().toArray();
		} else if (parentElement instanceof NavigatorCollection) {
			NavigatorCollection collection = (NavigatorCollection) parentElement;
			return collection.getElements();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof GuiNavigatorRoot) {
			GuiNavigatorRoot root = (GuiNavigatorRoot) element;
			return root.getSubCollections().size() > 0;
		} else if (element instanceof NavigatorCollection) {
			NavigatorCollection collection = (NavigatorCollection) element;
			return collection.getSize() > 0;
		}
		return false;
	}
	
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
	}
}
