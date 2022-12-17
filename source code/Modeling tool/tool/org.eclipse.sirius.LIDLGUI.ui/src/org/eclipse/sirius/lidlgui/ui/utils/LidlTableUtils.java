package org.eclipse.sirius.lidlgui.ui.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.InterfaceTable;
import org.eclipse.sirius.LIDLGUI.LIDLGUIFactory;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.query.DRepresentationQuery;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.EditorReference;

import org.eclipse.sirius.lidlgui.ui.Activator;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;

import com.google.common.collect.Maps;


public class LidlTableUtils {
	
	private static List<EObject> copiedEObject = null;
	private static Session session = null;
	private static IProject project = null;
	private static Resource resource = null;
	private static TableFactory factory = null;
	private static final List<IEditorReference> HIDED_EDITOR_LIST = new ArrayList<>();
	private static IEditorReference LAST_ACTIVE_EDITOR = null;
	
	public static void clearHidedEditorList() {
		HIDED_EDITOR_LIST.clear();
	}

	public static void saveLastActiveEditor(IEditorReference ref) {
		LAST_ACTIVE_EDITOR = ref;
	}

	public static void addHidedEditor(IEditorReference ref) {
		HIDED_EDITOR_LIST.add(ref);
	}

	public static List<IEditorReference> getHidedEditorList() {
		return HIDED_EDITOR_LIST;
	}

	public static IEditorReference getLastActiveEditor() {
		return LAST_ACTIVE_EDITOR;
	}

	public static void saveCopiedEObject(List<EObject> object) {
		copiedEObject = object;
	}

	public static List<EObject> getCopiedEObject() {
		return copiedEObject;
	}
	
	public static IProject getProject() {
		if (project == null) {
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject prj : projects) {
				if (prj.getName().equals(LidlTableGlobalConfig.PROJECT_NAME)) {
					project = prj;
					break;
				}
			}
		}
//		System.out.println(project.getName());
		return project;
	}
	
	private static void findDatatypeTableSession(Collection<Session> sessions) {
		System.out.println("Find Datatype Table Session");
		for (Session s : sessions) {
			if (s.getID().contains(LidlTableGlobalConfig.PROJECT_NAME)) {
				System.out.println(session);
				session = s;
			}
		}
	}
	
	private static boolean isGetProjectNotNull() {
		return session == null && getProject() != null;
	}
	
	private static boolean isSessionOpen() {
		return session != null && !session.isOpen();
	}
	
	
	// where the bug comes from
	public static Session getSession() {
		if (session == null) {
			System.out.println("Null Session");
			Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
			System.out.println("Find Datatype Table Session");
			findDatatypeTableSession(sessions);
			System.out.println("Found Datatype Table Session");
			if (isGetProjectNotNull()) {
				try {
					System.out.println("Get Datatype Table Session");
					// bug
					session = SessionManager.INSTANCE.getSession(URI.createURI(LidlTableGlobalConfig.SESSION_PATH),
							new NullProgressMonitor());
					System.out.println("Got Datatype Table Session:");
					System.out.println(session);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Exception Occurred");
				}
			}
		}
		if (isSessionOpen()) {
			System.out.println("Opened Session");
			session.open(new NullProgressMonitor());
		}
		return session;
	}
	
	public static Resource getResource() {
		if (getSession() == null) {
			return null;
		}
		if (resource == null) {
			resource = new ArrayList<>(getSession().getSemanticResources()).get(0);
		}
		return resource;
	}
	
	public static TableFactory getFactory() {
		if (getSession() == null) {
			return LIDLGUIFactory.eINSTANCE.createTableFactory();
		}
		if (factory == null) {
			factory = (TableFactory) getResource().getContents().get(0);
		}
		return factory;
	}
	
	public static TableFactory getNewEmptyFactory() {
		deleteLidlTablePerspectiveEObject(getFactory().eContents());
		session.save(new NullProgressMonitor());
		// changeToThisPerspective();
		return factory;
	}
	
	public static void deleteLidlTablePerspectiveEObject(List<EObject> objects) {
		if (session == null) {
			return;
		}
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					public boolean canUndo() {
						return false;
					}

					@Override
					protected void doExecute() {
						Collection<DRepresentation> representations = DialectManager.INSTANCE
								.getAllRepresentations(session);
						for (DRepresentation representation : representations) {
							for (IEditorReference editorReference : PlatformUI.getWorkbench().getActiveWorkbenchWindow()
									.getActivePage().getEditorReferences()) {
								IEditorPart editor = editorReference.getEditor(false);
								if (editor != null) {
									editor.doSave(new NullProgressMonitor());
									DialectUIManager.INSTANCE.closeEditor(editor, false);
								}
							}
							DRepresentationQuery query = new DRepresentationQuery(representation);
							DialectManager.INSTANCE.deleteRepresentation(query.getRepresentationDescriptor(), session);
						}
						for (int i = 0; i < objects.size(); i++) {
							EObject eObject = objects.get(i);
							EcoreUtil.delete(eObject, true);
							i--;
						}
					}
				});
	}
	
	// bug
	public static void createProject(IProgressMonitor monitor, IProject project) {
		System.out.println("Create Project");
		try {
			
			System.out.println("Try to get Project");
			
			project.create(monitor);
			project.open(monitor);
			
			System.out.println("Opened Monitor");
			
			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
			
			System.out.println("Converted To Modeling Project");
			
		}
		catch (CoreException e) {
			Activator.log(Status.ERROR, "Open Project Failed!", e);
		}
		
		
		System.out.println("Model Path");
		
		String modelPath = '/' + project.getName();
		final Session session = createAird(project,
				URI.createPlatformResourceURI(modelPath + "/" + LidlTableGlobalConfig.SESSION_NAME, true), monitor);

		final String semanticModelPath = getSemanticModelPath(session);
		initSemanticModel(session, semanticModelPath, monitor);

		final String[] viewpointsToActivate = { LidlTableGlobalConfig.LIDL_TABLE_VIEWPOINT };
		enableViewpoints(session, viewpointsToActivate);
		
//		insertDatatypeTable(factory);
//		
//		insertInterfaceTable(factory);
//		
//		insertInteractionTable(factory);
		
		session.save(monitor);
	}

	public static Session createAird(IProject project, URI representationsURI, IProgressMonitor monitor) {
		System.out.println("CreateArid");
		final Session session;
		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		if (modelingProject.some()) {
			session = modelingProject.get().getSession();
		} else {
			Session tempSession = null;
			SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
					representationsURI, monitor);
			try {
				sessionCreationOperation.execute();
				tempSession = sessionCreationOperation.getCreatedSession();
			} catch (CoreException e) {
				Activator.log(Status.ERROR, "Create Representation File Failed!", e);
			}
			if (tempSession != null) {
				session = tempSession;
			} else {
				session = null;
			}
		}
		return session;
	}
	
	private static String getSemanticModelPath(final Session session) {
		Resource aird = (Resource) session.getAllSessionResources().toArray()[0];
		String airdUri = aird.getURI().toPlatformString(true);
		final String semanticModelPath = airdUri.substring(0, airdUri.lastIndexOf("/") + 1)
				+ LidlTableGlobalConfig.MODEL_NAME;
		return semanticModelPath;
	}
	
	private static void initSemanticModel(final Session session, final String semanticModelPath,
			final IProgressMonitor monitor) {
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					public boolean canUndo() {
						return false;
					}

					@Override
					protected void doExecute() {
						final URI semanticModelURI = URI.createPlatformResourceURI(semanticModelPath, true);
						Resource resource = new ResourceSetImpl().createResource(semanticModelURI);
						final TableFactory factory = LIDLGUIFactory.eINSTANCE.createTableFactory();
						
						// add Datatype Interface Interaction
						
						
						resource.getContents().add(factory);

						try {
							resource.save(Maps.newHashMap());
						} catch (IOException e) {
							Activator.log(Status.ERROR, "Init Semantic Model Failed!", e);
						}

						session.addSemanticResource(semanticModelURI, monitor);
						session.save(monitor);
					}
				});
	}
	
	// function not used
	public static void insertDatatypeTable(TableFactory factory) {
		DatatypeTable datatypeTable = LIDLGUIFactory.eINSTANCE.createDatatypeTable();
		datatypeTable.setName("Datatype Table");
		factory.getDatatypetable().add(datatypeTable);
		
		RepresentationDescription datatypeTableDiagram = null;
		Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), datatypeTable);
		
		
		for (RepresentationDescription description : representationDescriptions) {
			if (description.getName().equals(LidlTableGlobalConfig.DATATYPE_TABLE_REPRESENTATION)) {
				datatypeTableDiagram = description;
			}
		}
		
		DRepresentation representation = DialectManager.INSTANCE.createRepresentation(
				LidlTableGlobalConfig.DATATYPE_TABLE_IDENTIFIER, datatypeTable,
				datatypeTableDiagram, session, new NullProgressMonitor());
	}
	
	// function not used
	public static void insertInterfaceTable(TableFactory factory) {
		InterfaceTable interfaceTable = LIDLGUIFactory.eINSTANCE.createInterfaceTable();
		interfaceTable.setName("Interface Table");
		factory.getInterfacetable().add(interfaceTable);
		
		RepresentationDescription datatypeTableDiagram = null;
		Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), interfaceTable);
		
		
		for (RepresentationDescription description : representationDescriptions) {
			if (description.getName().equals(LidlTableGlobalConfig.INTERFACE_TABLE_REPRESENTATION)) {
				datatypeTableDiagram = description;
			}
		}
		
		DRepresentation representation = DialectManager.INSTANCE.createRepresentation(
				LidlTableGlobalConfig.INTERFACE_TABLE_IDENTIFIER, interfaceTable,
				datatypeTableDiagram, session, new NullProgressMonitor());
	}
	
	// function not used
	public static void insertInteractionTable(TableFactory factory) {
		InteractionTable interactionTable = LIDLGUIFactory.eINSTANCE.createInteractionTable();
		interactionTable.setName("Interaction Table");
		factory.getInteractiontable().add(interactionTable);
		
		RepresentationDescription datatypeTableDiagram = null;
		Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), interactionTable);
		
		
		for (RepresentationDescription description : representationDescriptions) {
			if (description.getName().equals(LidlTableGlobalConfig.INTERACTION_TABLE_REPRESENTATION)) {
				datatypeTableDiagram = description;
			}
		}
		
		DRepresentation representation = DialectManager.INSTANCE.createRepresentation(
				LidlTableGlobalConfig.INTERACTION_TABLE_IDENTIFIER, interactionTable,
				datatypeTableDiagram, session, new NullProgressMonitor());
	}
	
	
	public static void enableViewpoints(final Session session, final String... viewpointsToActivate) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

						@Override
						protected void doExecute() {
							
							ViewpointSelectionCallback callback = new ViewpointSelectionCallback();
							for (Viewpoint viewpoint : ViewpointRegistry.getInstance().getViewpoints()) {
								
								for (String viewpointString : viewpointsToActivate) {
									
//									System.out.println(viewpointString);
									
									if (viewpointString.equals(viewpoint.getName())) {
//										System.out.println(viewpoint.getName());
										callback.selectViewpoint(viewpoint, session, new NullProgressMonitor());
									}
								}
							}
						}
					});
		}
	}
	
	public static void changePerspective(String perspectiveId) {
		if (PlatformUI.getWorkbench() != null) {
			IPerspectiveDescriptor descriptor = PlatformUI.getWorkbench().getPerspectiveRegistry()
					.findPerspectiveWithId(perspectiveId);
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().setPerspective(descriptor);
		}
	}
	
	public static void closeView(String viewId) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IViewPart viewPart = page.findView(viewId);
		page.hideView(viewPart);
	}
	
	public static void openView(String viewId) {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(viewId);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeEditors() {
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IEditorReference[] editorRefs = page.getEditorReferences();
		IEditorPart activeEditorPart = page.getActiveEditor();
		clearHidedEditorList();
		for (IEditorReference ref : editorRefs) {
			IWorkbenchPart wPart = ref.getPart(true);
			MPart part = ((EditorReference) ref).getModel();
			if (part.isVisible()) {
				addHidedEditor(ref);
				page.hideEditor(ref);
				if (ref.getEditor(true).getTitle().equals(activeEditorPart.getTitle())) {
					saveLastActiveEditor(ref);
				}
			}
		}
	}
	
	private static void showEditor(IEditorReference ref) {
		IWorkbenchPart wPart = ref.getPart(true);
		MPart part = ((EditorReference) ref).getModel();
		part.setVisible(true);
		MElementContainer<MUIElement> partStack = part.getParent();
		partStack.setSelectedElement(null);
		partStack.setSelectedElement(part);
		wPart.setFocus();
	}
	
	public static void openClosedEditors() {
		
		Session session = getSession();
		
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		for (IEditorReference ref : getHidedEditorList()) {
			showEditor(ref);
		}
		IEditorReference ref = getLastActiveEditor();
		if (ref != null) {
			page.bringToTop(ref.getPart(true));
		}
	}
	
	public static String getCurrentPerspectiveId() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective().getId();
	}

	public static boolean checkStringEmpty(String value) {
		return value == null || value.trim().length() == 0;
	}

	public static String readFromFile(String filePath) {
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader;
		try {
			InputStream inputStream = new FileInputStream(filePath);
			String line;
			reader = new BufferedReader(new InputStreamReader(inputStream));
			line = reader.readLine();
			while (line != null) {
				buffer.append(line);
				buffer.append("\n");
				line = reader.readLine();
			}
			reader.close();
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buffer.toString();
	}

	public static boolean checkFileExists(String filePath) {
		File file = new File(filePath);
		return file.exists();
	}

	public static void transaction(SessionTransaction s) {
		Session session = getSession();
		if (session == null) {
			return;
		}
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					public boolean canUndo() {
						return false;
					}

					@Override
					protected void doExecute() {
						try {
							s.execute(session);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
	}

	public static void changeToThisPerspective() {
		changePerspective(LidlTableGlobalConfig.PERSPECTIVE_ID);
	}
	
	public interface SessionTransaction {
        public void execute(Session session) throws Exception;
    }

}
