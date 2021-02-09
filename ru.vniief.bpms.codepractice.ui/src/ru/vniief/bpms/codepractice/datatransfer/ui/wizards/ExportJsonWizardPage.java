package ru.vniief.bpms.codepractice.datatransfer.ui.wizards;

import java.io.File;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import ru.vniief.bpms.codepractice.internal.ui.Messages;


public class ExportJsonWizardPage extends WizardPage {

    private static final String FILE_ECORE = ".ecore"; //$NON-NLS-1$
    private Text text;

    protected ExportJsonWizardPage() {
        super(ExportJsonWizardPage.class.getName());
    }

    @Override
    public void createControl(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        content.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
        content.setLayout(GridLayoutFactory.fillDefaults().create());

        Group group = new Group(content, SWT.NONE);
        group.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
        group.setLayout(GridLayoutFactory.fillDefaults().margins(5,5).numColumns(3).create());

        Label label = new Label(group, SWT.NONE);
        label.setText(Messages.ExportJsonWizardPage_FileLabelText);
        label.setLayoutData(GridDataFactory.fillDefaults().create());

        text = new Text(group, SWT.NONE);
        text.addModifyListener(this::textModified);
        text.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

        Button button = new Button(group, SWT.PUSH);
        button.setLayoutData(GridDataFactory.fillDefaults().create());
        button.setText(Messages.ExportJsonWizardPage_SelectButtonText);
        button.addSelectionListener(SelectionListener.widgetSelectedAdapter(this::buttonSelected));
        Dialog.applyDialogFont(content);
        setControl(content);
        setMessage(Messages.ExportJsonWizardPage_SelectEcoreFileMessage);
        setPageComplete(false);
    }

    private void buttonSelected(SelectionEvent event) {
        FileDialog fileDialog = new FileDialog(getShell());
        fileDialog.setText(Messages.ExportJsonWizardPage_FileDialogSelectFile);

        String file = fileDialog.open();
        if (file != null) {
            text.setText(file.toString());
            validatePage();
        }
    }

    private void textModified(ModifyEvent event) {
        validatePage();
    }

    private void validatePage() {
        File file = new File(text.getText());
        if (!file.isDirectory() && file.getName().endsWith(FILE_ECORE)) {
            setErrorMessage(null);
            setPageComplete(true);
        } else {
            setErrorMessage(NLS.bind(Messages.ExportJsonWizardPage_ErrorMessage, file));
            setPageComplete(false);
        }
    }


    protected File getFile() {
        return new File(text.getText());
    }
}
