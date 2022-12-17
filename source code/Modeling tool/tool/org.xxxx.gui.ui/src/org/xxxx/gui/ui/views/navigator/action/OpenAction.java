package org.xxxx.gui.ui.views.navigator.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.eclipse.sirius.table.ui.tools.api.editor.DTableEditor;
import org.eclipse.sirius.table.ui.tools.internal.editor.AbstractDTableEditor;
import org.eclipse.sirius.table.ui.tools.internal.editor.DTableTreeViewer;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class OpenAction extends GuiNavigatorAction{
	
	public OpenAction(IWorkbenchPage page, ISelectionProvider provider) {
		super("Open", page, provider);
	}
	
	@Override
	public void run() {
		if (origNode != null) {
			IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			IEditorReference[] editorRefs = page.getEditorReferences();
			List<String> alreadyOpenedEditor = new ArrayList<>();
			for (IEditorReference ref : editorRefs) {
				alreadyOpenedEditor.add(ref.getEditor(true).getTitle());
			}
			Session session = GuiUtils.getSession();
			Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
			
			String nodeRepresentation = origNode.getRepresentation();
			addDoubleClickListener(representations, nodeRepresentation, alreadyOpenedEditor, session);
		}
	}
	
	public void addDoubleClickListener(Collection<DRepresentation> representations,String nodeReprentation,List<String> alreadyOpenedEditor,Session session) {
		for (DRepresentation representation : representations) {
			String representationName = representation.getName();
			if (representation.getName().contains(origNode.getRepresentation())) {
				DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
//				if (!alreadyOpenedEditor.contains(nodeReprentation)) {
//					if (representationName.contains("模块")) {
//						IEditingSession editingSession = SessionUIManager.INSTANCE.getUISession(session);
//						DTableEditor tableEditor = (DTableEditor) editingSession.getEditor(representation);
//						DTableTreeViewer viewer = (DTableTreeViewer) ((AbstractDTableEditor) tableEditor)
//								.getViewer();
//						viewer.addDoubleClickListener(new ModuleDiagramDoubleClickListerner(viewer));
//					}
//				}
				return;
			}
		}
	}
}
