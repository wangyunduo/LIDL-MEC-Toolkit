package org.xxxx.gui.ui.handlers;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.LIDLGUI.LIDLGUIFactory;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.internal.dialect.NotYetOpenedDiagramAdapter;
import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.ComolUtils;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;

public class CreateGUIHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Session session = GuiUtils.getSession();
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
					ComboWidgetFactory factory = GuiUtils.getFactory();
					GUI cGUI = LIDLGUIFactory.eINSTANCE.createGUI();
					factory.getGui().add(cGUI);
					List<GUI> components = factory.getGui();
					ComolUtils.setProperIndex(components, cGUI);
					
					cGUI.setName("GUI@ " + (int)cGUI.getIndex());
					RepresentationDescription moduleDiagram = null;
					Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
							.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), cGUI);
					
					for (RepresentationDescription description : representationDescriptions) {
						if (description.getName().equals(GuiGlobalConfig.GUI_DIAGRAM_REPRESENTATION)) {
							moduleDiagram = description;
						}
					}
					
					System.out.println(moduleDiagram);
					
					DRepresentation representation = DialectManager.INSTANCE.createRepresentation(
							GuiGlobalConfig.GUI_DIAGRAM_IDENTIFIER+ cGUI.getIndex(), cGUI,
							moduleDiagram, session, new NullProgressMonitor());
					if (representation == null) {
						System.out.println("representation is null !!!");
					}
					final DSemanticDiagram diagram = (DSemanticDiagram) representation;
					if (diagram.eAdapters().contains(NotYetOpenedDiagramAdapter.INSTANCE)) {
						diagram.eAdapters().remove(NotYetOpenedDiagramAdapter.INSTANCE);
					}
					DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());

					session.save(new NullProgressMonitor());
				}
			});
		return null;
	}

}
