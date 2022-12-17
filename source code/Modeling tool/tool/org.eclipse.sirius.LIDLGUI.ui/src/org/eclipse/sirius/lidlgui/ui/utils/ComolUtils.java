package org.eclipse.sirius.lidlgui.ui.utils;

import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import java.util.List;

import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.InterfaceTable;
import org.eclipse.sirius.lidlgui.ui.config.ComolGlobalConfig;

public class ComolUtils {
	
	public static void changePerspective(String perspectiveId) {
		if (PlatformUI.getWorkbench() != null) {
			IPerspectiveDescriptor descriptor = PlatformUI.getWorkbench().getPerspectiveRegistry()
					.findPerspectiveWithId(perspectiveId);

			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().setPerspective(descriptor);
		}
	}
	
	public static void resetPerspective() {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().resetPerspective();
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
	
	public static String getCurrentPerspectiveId() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getPerspective().getId();
	}
	
	public static void changeToThisPerspective() {
		System.out.println("Change to Comol Perspective");
        changePerspective(ComolGlobalConfig.PERSPECTIVE_ID);
    }
	
	public static void closeDashboardView() {
		closeView("org.eclipse.sirius.lidlgui.ui.views.dashboard");
	}
	
	public static void openDashBoardView() {
        openView("org.eclipse.sirius.lidlgui.ui.views.dashboard");
    }
	
	public static void setProperIndex(List<DatatypeTable> datatypeTables, DatatypeTable datatypeTable) {
    	int index = getProperIndex(datatypeTables, datatypeTable);
    	datatypeTable.setIndex(index);
    }
	
	private static int getProperIndex(List<DatatypeTable> datatypeTables, DatatypeTable datatypeTable) {
		if (datatypeTables.size() ==0) {
            return 0;
        }
        if (datatypeTables.size() == 1) {
            return 1;
        } else {
            return (int) (datatypeTables.get(datatypeTables.size() - 2).getIndex() + 1);
        }
	}
	
	public static void setProperIndex(List<InterfaceTable> interfaceTables, InterfaceTable interfaceTable) {
    	int index = getProperIndex(interfaceTables, interfaceTable);
    	interfaceTable.setIndex(index);
    }
	
	private static int getProperIndex(List<InterfaceTable> interfaceTables, InterfaceTable interfaceTable) {
		if (interfaceTables.size() ==0) {
            return 0;
        }
        if (interfaceTables.size() == 1) {
            return 1;
        } else {
            return (int) (interfaceTables.get(interfaceTables.size() - 2).getIndex() + 1);
        }
	}
	
	public static void setProperIndex(List<InteractionTable> interfaceTables, InteractionTable interfaceTable) {
    	int index = getProperIndex(interfaceTables, interfaceTable);
    	interfaceTable.setIndex(index);
    }
	
	private static int getProperIndex(List<InteractionTable> interfaceTables, InteractionTable interfaceTable) {
		if (interfaceTables.size() ==0) {
            return 0;
        }
        if (interfaceTables.size() == 1) {
            return 1;
        } else {
            return (int) (interfaceTables.get(interfaceTables.size() - 2).getIndex() + 1);
        }
	}
	


	public static int getProperIndex(List<ComboWidget> architects, ComboWidget architect) {
        if (architects.size() ==0) {
            return 0;
        }
        if (architects.size() == 1) {
            return 1;
        } else {
            return (int) (architects.get(architects.size() - 2).getIndex() + 1);
        }
    }
	
	public static void setProperIndex(List<ComboWidget> architects, ComboWidget architect) {
    	int index = getProperIndex(architects, architect);
    	architect.setIndex(index);
    }
	
	public static void setProperIndex(List<GUI> architects, GUI architect) {
    	int index = getProperIndex(architects, architect);
    	architect.setIndex(index);
    }
	
	public static int getProperIndex(List<GUI> architects, GUI architect) {
        if (architects.size() ==0) {
            return 0;
        }
        if (architects.size() == 1) {
            return 1;
        } else {
            return (int) (architects.get(architects.size() - 2).getIndex() + 1);
        }
    }
	
	public static void setProperIndex(List<Interaction> interactions, Interaction interaction) {
    	int index = getProperIndex(interactions, interaction);
    	interaction.setIndex(index);
    }
	
	public static int getProperIndex(List<Interaction> interactions, Interaction interaction) {
        if (interactions.size() ==0) {
            return 0;
        }
        if (interactions.size() == 1) {
            return 1;
        } else {
            return (int) (interactions.get(interactions.size() - 2).getIndex() + 1);
        }
    }

}
