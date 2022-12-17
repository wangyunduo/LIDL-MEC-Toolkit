package org.xxxx.lidltable.ui.views.navigator.action;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.DatatypeTableFactory;
import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.InterfaceTable;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.DRepresentationQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.xxxx.lidltable.ui.views.navigator.nodes.DatatypetableNode;
import org.xxxx.lidltable.ui.views.navigator.nodes.InterfacetableNode;
import org.xxxx.lidltable.ui.views.navigator.nodes.NavigatorNode;



public class DeleteAction extends LidltableNavigatorAction{
	
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
	
	public void deleteDatatypeTable(NavigatorNode navigatorNode) {
		Session session = LidlTableUtils.getSession();
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
                    
                    TableFactory factory = (TableFactory) resource.getContents().get(0);
                    for (DatatypeTable datatypeTable : factory.getDatatypetable()) {
                    	if (datatypeTable.getIndex() == origNode.getIndex()) {
                    		EcoreUtil.delete(datatypeTable);
                    		break;
                    	}
                    }
				}
			});
	}
	
	public void deleteInterfaceTable(NavigatorNode navigatorNode) {
		Session session = LidlTableUtils.getSession();
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
                    
                    TableFactory factory = (TableFactory) resource.getContents().get(0);
                    for (InterfaceTable interfaceTable : factory.getInterfacetable()) {
                    	if (interfaceTable.getIndex() == origNode.getIndex()) {
                    		EcoreUtil.delete(interfaceTable);
                    		break;
                    	}
                    }
				}
			});
	}
	
	public void deleteInteractionTable(NavigatorNode navigatorNode) {
		Session session = LidlTableUtils.getSession();
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
                    
                    TableFactory factory = (TableFactory) resource.getContents().get(0);
                    for (InteractionTable interactionTable : factory.getInteractiontable()) {
                    	if (interactionTable.getIndex() == origNode.getIndex()) {
                    		EcoreUtil.delete(interactionTable);
                    		break;
                    	}
                    }
				}
			});
	}
	
	@Override
	public void run() {
		if (origNode == null) {
            return;
        }else {
			if (origNode instanceof DatatypetableNode) {
				deleteDatatypeTable(origNode);
			}
			else if (origNode instanceof InterfacetableNode) {
				deleteInterfaceTable(origNode);
			}
			else {
				deleteInteractionTable(origNode);
			}
		}
	}
}
