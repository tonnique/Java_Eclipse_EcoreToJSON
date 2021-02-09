package ru.vniief.bpms.codepractice.ui.actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import ru.vniief.bpms.codepractice.datatransfer.ui.wizards.ExportJsonWizard;
import ru.vniief.bpms.codepractice.internal.ui.Messages;

public class ExportEcoreAction extends Action {

    private Shell shell;
    private ExportJsonWizard wizard;
    private WizardDialog dialog;

    public ExportEcoreAction(Viewer viewer) {
        shell = viewer.getControl().getShell();
        wizard = new ExportJsonWizard();
        wizard.init(PlatformUI.getWorkbench(), StructuredSelection.EMPTY);
        dialog = new WizardDialog(shell, wizard);
        initialize();
    }

    public void run() {
        dialog.open();
    }

    private void initialize() {
        setText(Messages.ExportEcoreAction_Text);
        setToolTipText(Messages.ExportEcoreAction_ToolTip);

        URL url = null;
        try {
            url = new URL("platform:/plugin/org.eclipse.ui/icons/full/etool16/export_wiz.png"); //$NON-NLS-1$
        } catch(MalformedURLException e) {
            System.out.println(e.toString());
        }

        setImageDescriptor(ImageDescriptor.createFromURL(url));
    }
}
