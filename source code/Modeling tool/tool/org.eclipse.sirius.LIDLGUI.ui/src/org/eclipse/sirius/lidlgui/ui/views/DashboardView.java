package org.eclipse.sirius.lidlgui.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.viewpoint.description.tool.If;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;

import org.eclipse.sirius.lidlgui.ui.Activator;
import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.ComolUtils;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;


public class DashboardView  extends ViewPart implements IPartListener2, IResourceChangeListener {
	
	public static final String ID = "org.eclipse.sirius.lidlgui.ui.views.dashboard";

	private Shell shell;
	private FormToolkit toolkit;
	private ScrolledForm form;
	private List<Image> images = new ArrayList<Image>();
	
	
	private ImageHyperlink uiDiagramLink;
	private static final String UI_Diagram_IMAGE = "icons/共享.png";
	
	private ImageHyperlink lidlTableLink;
	private static final String LIDL_TABLE_IMAGE = "icons/数据.png";
	
	private ImageHyperlink datatypeTableLink;
	private static final String DATATYPE_TABLE_IMAGE = "icons/共享.png";
	
	private ImageHyperlink interfaceTableLink;
	private static final String INTERFACE_TABLE_IMAGE = "icons/数据.png";
	
	private ImageHyperlink interactionTableLink;
	private static final String INTERACTION_TABLE_IMAGE = "icons/模板.png";
	
	private ImageHyperlink interactionDiagramLink;
	private static final String INTERACTION_DIAGRAM_IMAGE = "icons/应用.png";

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public void createPartControl(Composite parent) {
		System.out.println("Create Part Control");
		shell = parent.getShell();
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Select a view to start LIDL modeling");
		Font font=new Font(null, "Times New Roman", 14, 1);
		form.setFont(font);
		GridLayout formLayout = new GridLayout();
		formLayout.numColumns = 1;
		formLayout.horizontalSpacing = 100;
		formLayout.verticalSpacing = 30;
		formLayout.marginWidth = 100;
		formLayout.marginHeight = 20;
		form.getBody().setLayout(formLayout);
		
//		enterDatatypeTableProjectHyperLink(parent, shell);
//		
//		enterInterfaceTableProjectHyperLink(parent, shell);
//		
//		enterInteractionTableProjectHyperLink(parent, shell);
//		
//		enterInteractionDiagramProjectHyperLink(parent, shell);
		
		enterLIDLGUIProjectHyperLink(parent, shell);
		
		enterUIProjectHyperLink(parent, shell);
		
		this.getSite().getPage().addPartListener(this);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	private ImageHyperlink createImageHyperLink(Composite parent, String imagePath, String hoverImagePath,
			String toolTipText, String text) {
		ImageHyperlink imageLink = toolkit.createImageHyperlink(parent, SWT.WRAP);
		Image image = getImage(imagePath);
		imageLink.setImage(image);
		Image hoverImage = getImage(hoverImagePath);
		imageLink.setHoverImage(hoverImage);
		imageLink.setToolTipText(toolTipText);
		
		Font font=new Font(null, "Times New Roman", 14, 1);
		imageLink.setFont(font);
		imageLink.setText(text);
		return imageLink;
	}

	private Image getImage(String relativePath) {
		return Activator.getImageDescriptor(relativePath).createImage();
	}
	
	private void enterUIProjectHyperLink(final Composite parent, final Shell shell) {
		uiDiagramLink = createImageHyperLink(form.getBody(), UI_Diagram_IMAGE, UI_Diagram_IMAGE, "Open User interface design modeling view", "User interface design modeling view");
		uiDiagramLink.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				IProject project = GuiUtils.getProject();
				if (project == null) {
					project = ResourcesPlugin.getWorkspace().getRoot().getProject(GuiGlobalConfig.PROJECT_NAME);
					GuiUtils.createProject(new NullProgressMonitor(), project);
				}
				ComolUtils.closeDashboardView();
				GuiUtils.changeToThisPerspective();
				GuiUtils.openClosedEditors();
			}
		});
	}
	
	private void enterLIDLGUIProjectHyperLink(final Composite parent, final Shell shell) {
		lidlTableLink = createImageHyperLink(form.getBody(), LIDL_TABLE_IMAGE, LIDL_TABLE_IMAGE, "Open LIDL model element definition table view", "LIDL model element definition table view");
		lidlTableLink.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				IProject project = LidlTableUtils.getProject();
				if (project == null) {
					project = ResourcesPlugin.getWorkspace().getRoot().getProject(LidlTableGlobalConfig.PROJECT_NAME);
					LidlTableUtils.createProject(new NullProgressMonitor(), project);
				}
				ComolUtils.closeDashboardView();
				LidlTableUtils.changeToThisPerspective();
				LidlTableUtils.openClosedEditors();
			}
		});
	}


		@Override
	public void setFocus() {
		form.setFocus();
	}

	public void dispose() {
		toolkit.dispose();
		for (Image image : images) {
			image.dispose();
		}
		getSite().getPage().removePartListener(this);
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
}
