package org.xxxx.lidltable.ui.handlers;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.LIDLGUIFactory;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.ComolUtils;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;
import org.eclipse.sirius.table.ui.tools.api.editor.DTableEditor;
import org.eclipse.sirius.table.ui.tools.internal.editor.AbstractDTableEditor;
import org.eclipse.sirius.table.ui.tools.internal.editor.DTableTreeViewer;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.xxxx.lidltable.ui.listeners.LidltableDoubleClickListener;

public class CreateDatatypeTableHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Session session = LidlTableUtils.getSession();
		if (session == null) {
			return null;
		}
		session.getTransactionalEditingDomain().getCommandStack()
			.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
				
				@Override
				public boolean canUndo() {
					return false;
				}
				
				@Override
				protected void doExecute() {
					TableFactory factory = LidlTableUtils.getFactory();
					DatatypeTable datatypeTable = LIDLGUIFactory.eINSTANCE.createDatatypeTable();
					factory.getDatatypetable().add(datatypeTable);
					List<DatatypeTable> datatypeTables = factory.getDatatypetable();
					ComolUtils.setProperIndex(datatypeTables, datatypeTable);
					
					datatypeTable.setName("DatatypeTable");
					
					// create model data to .aird file
					RepresentationDescription datatypeTableDiagram = null;
					Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
							.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), datatypeTable);
					
					for (RepresentationDescription description : representationDescriptions) {
						if (description.getName().equals(LidlTableGlobalConfig.DATATYPE_TABLE_REPRESENTATION)) {
							datatypeTableDiagram = description;
						}
					}
					
					// Create Data type definition table Representation to save into aird
					// use data type table name to set representation name
					DRepresentation representation = DialectManager.INSTANCE.createRepresentation(
							LidlTableGlobalConfig.DATATYPE_TABLE_NAME + " " + (int)datatypeTable.getIndex(), datatypeTable,
							datatypeTableDiagram, session, new NullProgressMonitor());
					
					
					DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
					
					IEditingSession editingSession = SessionUIManager.INSTANCE.getUISession(session);
					DTableEditor tableEditor = (DTableEditor) editingSession.getEditor(representation);
					DTableTreeViewer viewer = (DTableTreeViewer) ((AbstractDTableEditor) tableEditor).getViewer();
					viewer.addDoubleClickListener(new LidltableDoubleClickListener(viewer));
					
					session.save(new NullProgressMonitor());
				}
			});
		return null;
	}
}
