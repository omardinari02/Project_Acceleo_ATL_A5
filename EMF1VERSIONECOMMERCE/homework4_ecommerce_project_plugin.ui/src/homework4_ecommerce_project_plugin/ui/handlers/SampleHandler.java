package homework4_ecommerce_project_plugin.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import homework4_ecommerce_project.EntityRelationships.DataBase;
import homework4_ecommerce_project.EntityRelationships.Entity;

import org.eclipse.jface.dialogs.MessageDialog;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Ui",
				"Hello, Eclipse world");
		return null;
	}
}
