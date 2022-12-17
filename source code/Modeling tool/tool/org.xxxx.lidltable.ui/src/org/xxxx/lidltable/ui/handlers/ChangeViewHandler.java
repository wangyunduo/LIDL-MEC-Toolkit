package org.xxxx.lidltable.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;
import org.eclipse.sirius.lidlgui.ui.utils.ComolUtils;

public class ChangeViewHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("Get Datatype Table Session");
		Session session = LidlTableUtils.getSession();
		session.save(new NullProgressMonitor());
		System.out.println("Close Datatype Table Editoris");
		LidlTableUtils.closeEditors();
		System.out.println("Change To Comol Perspective");
		ComolUtils.changeToThisPerspective();
		System.out.println("Change To Comol DashBoard View");
		ComolUtils.openDashBoardView();
		return null;
	}
}
