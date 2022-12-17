package org.xxxx.lidltable.ui.views.navigator.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class OpenAction extends LidltableNavigatorAction {

	public OpenAction(IWorkbenchPage page, ISelectionProvider provider) {
		super("Open", page, provider);
	}
	
	@Override
	public void run() {
		System.out.println("Open "+origNode);
		if (origNode != null) {
			IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			System.out.println(workbenchWindow);
			
			IWorkbenchPage page = workbenchWindow.getActivePage();
			System.out.println(page);
			
			IEditorReference[] editorRefs = page.getEditorReferences();
			System.out.println(editorRefs);
			
			
			List<String> alreadyOpenedEditor = new ArrayList<>();
			for (IEditorReference ref : editorRefs) {
				alreadyOpenedEditor.add(ref.getEditor(true).getTitle());
			}
			System.out.println(alreadyOpenedEditor);
			
			Session session = LidlTableUtils.getSession();
			System.out.println("My session: "+session);
			
			Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
			System.out.println(representations);
			
			String nodeRepresentation = origNode.getRepresentation();
			System.out.println(nodeRepresentation);
			
			addDoubleClickListener(representations, nodeRepresentation, alreadyOpenedEditor, session);
		}
		
	}
	
	public void addDoubleClickListener(Collection<DRepresentation> representations,String nodeReprentation,List<String> alreadyOpenedEditor,Session session) {
		for (DRepresentation representation : representations) {
			String representationName = representation.getName();
			if (representation.getName().contains(origNode.getRepresentation())) {
				DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
//				if (!alreadyOpenedEditor.contains(nodeReprentation)) {
//					if (representationName.contains("架构")) {
//						IEditingSession editingSession = SessionUIManager.INSTANCE.getUISession(session);
//						DTableEditor tableEditor = (DTableEditor) editingSession.getEditor(representation);
//						DTableTreeViewer viewer = (DTableTreeViewer) ((AbstractDTableEditor) tableEditor)
//								.getViewer();
//						viewer.addDoubleClickListener(new ArchitectureDiagramDoubleClickListerner(viewer));
//					}
//				}
				return;
			}
		}
	}
}
