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
import org.eclipse.sirius.LIDLGUI.Interaction;
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

public class CreateInterArchHandler extends AbstractHandler {

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
					System.out.println("aaaaaa");
					ComboWidgetFactory factory = GuiUtils.getFactory();
					Interaction impl_inter;
					impl_inter = LIDLGUIFactory.eINSTANCE.createInteraction();
					impl_inter.setName("MainUI");
					impl_inter.setExpression("");
					impl_inter.setLabel("main");
					impl_inter.setSignature("MainUI");
					System.out.println("bbbbb");
					factory.getInteraction_diagram().add(impl_inter);
					System.out.println("ccccc");
					List<Interaction> interactions = factory.getInteraction_diagram();
					ComolUtils.setProperIndex(interactions, impl_inter);
					
					RepresentationDescription interactionDiagram = null;
					
					Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
							.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), impl_inter);
					
					for (RepresentationDescription description : representationDescriptions) {
						System.out.println(description.getName());
						if (description.getName().equals(GuiGlobalConfig.INTERACTION_DIAGRAM_REPRESENTATION)) {
							interactionDiagram = description;
						}
					}
					DRepresentation representation = null;
					representation = DialectManager.INSTANCE.createRepresentation(
							GuiGlobalConfig.INTERACTION_DIAGRAM_IDENTIFIER+ (int)impl_inter.getIndex(), impl_inter,
							interactionDiagram, session, new NullProgressMonitor());
					
					DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
					
					session.save(new NullProgressMonitor());
					
					System.out.println("Interaction Diagram Generated");
					return;
				}
			});
		return null;
	}

}
