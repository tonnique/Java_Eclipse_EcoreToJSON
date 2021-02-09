package ru.vniief.bpms.codepractice.ui.commands.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import ru.vniief.bpms.codepractice.datatransfer.ui.wizards.ExportJsonWizard;

public class ExportJsonHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        Shell shell = HandlerUtil.getActiveShell(event);
        ExportJsonWizard wizard = new ExportJsonWizard();
        wizard.init(PlatformUI.getWorkbench(), HandlerUtil.getCurrentStructuredSelection(event));
        WizardDialog dialog = new WizardDialog(shell, wizard);
        dialog.open();
        return null;
    }
}
