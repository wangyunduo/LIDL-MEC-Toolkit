package org.xxxx.gui.ui.views.navigator.action;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.DRepresentationQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.xxxx.gui.ui.views.navigator.nodes.ComboWidgetNode;
import org.xxxx.gui.ui.views.navigator.nodes.GuiNode;
import org.xxxx.gui.ui.views.navigator.nodes.InteractionDiagramNode;
import org.xxxx.gui.ui.views.navigator.nodes.NavigatorNode;


public class DeleteAction extends GuiNavigatorAction{

	public DeleteAction(IWorkbenchPage page, ISelectionProvider provider) {
		super("Delete", page, provider);
	}
	
	private void deleteRepresentation(Session session, NavigatorNode node) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		representations.stream()
		.filter(representation -> representation.getName().contains(node.getRepresentation()))
		.forEach(representation -> {
			for (IEditorReference editorReference : PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().getEditorReferences()) {
                IEditorPart editor = editorReference.getEditor(false);
                if (editor != null && editor.getTitle().equals(node.getRepresentation())) {
                    editor.doSave(new NullProgressMonitor());
                    DialectUIManager.INSTANCE.closeEditor(editor, false);
                }
            }
            DRepresentationQuery query = new DRepresentationQuery(representation);
            DialectManager.INSTANCE.deleteRepresentation(query.getRepresentationDescriptor(), session);
		});
	}
	
	private void deleteGUI(NavigatorNode node) {
		Session session = GuiUtils.getSession();
		session.getTransactionalEditingDomain().getCommandStack()
			.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
			
			@Override
			public boolean canUndo() {
				return false;
			}
			
			@Override
			protected void doExecute() {
				session.save(new NullProgressMonitor());
                deleteRepresentation(session, origNode);
                Resource resource = new ArrayList<>(session.getSemanticResources()).get(0);
                ComboWidgetFactory factory = (ComboWidgetFactory) resource.getContents().get(0);
                for (GUI component : factory.getGui()) {
                	if (component.getIndex() == origNode.getIndex()) {
						EcoreUtil.delete(component);
						break;
					}
                }
			}
		});
	}
	
	private void deleteComboWidget(NavigatorNode node) {
		Session session = GuiUtils.getSession();
		session.getTransactionalEditingDomain().getCommandStack()
			.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
			
			@Override
			public boolean canUndo() {
				return false;
			}
			
			@Override
			protected void doExecute() {
				session.save(new NullProgressMonitor());
                deleteRepresentation(session, origNode);
                Resource resource = new ArrayList<>(session.getSemanticResources()).get(0);
                ComboWidgetFactory factory = (ComboWidgetFactory) resource.getContents().get(0);
                for (ComboWidget component : factory.getMyComboWidget()) {
                	if (component.getIndex() == origNode.getIndex()) {
						EcoreUtil.delete(component);
						break;
					}
                }
			}
		});
	}
	
	private void deleteInteractionDiagram(NavigatorNode node) {
		Session session = GuiUtils.getSession();
		session.getTransactionalEditingDomain().getCommandStack()
			.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
			
			@Override
			public boolean canUndo() {
				return false;
			}
			
			@Override
			protected void doExecute() {
				session.save(new NullProgressMonitor());
                deleteRepresentation(session, origNode);
                Resource resource = new ArrayList<>(session.getSemanticResources()).get(0);
                ComboWidgetFactory factory = (ComboWidgetFactory) resource.getContents().get(0);
                for (Interaction component : factory.getInteraction_diagram()) {
                	if (component.getIndex() == origNode.getIndex()) {
						EcoreUtil.delete(component);
						break;
					}
                }
			}
		});
	}
	
	@Override
	public void run() {
		if (origNode != null) {
			NavigatorNode node = null;
			if (origNode instanceof GuiNode) {
				deleteGUI(node);
			}
			else if(origNode instanceof ComboWidgetNode) {
				deleteComboWidget(node);
			}
			else if(origNode instanceof InteractionDiagramNode) {
				 deleteInteractionDiagram(node);
			}
		}
	}
}
