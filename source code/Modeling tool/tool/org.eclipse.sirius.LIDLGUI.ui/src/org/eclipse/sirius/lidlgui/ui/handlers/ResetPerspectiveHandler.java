package org.eclipse.sirius.lidlgui.ui.handlers;

import org.eclipse.sirius.lidlgui.ui.utils.ComolUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class ResetPerspectiveHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ComolUtils.resetPerspective();
		return null;
	}

}
