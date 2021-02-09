package ru.vniief.bpms.codepractice.internal.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "ru.vniief.bpms.codepractice.internal.ui.messages"; //$NON-NLS-1$
    public static String TreeView_abstract;
    public static String TreeView_interface;
    public static String TreeView_Type;
    public static String ExportEcoreAction_Text;
    public static String ExportEcoreAction_ToolTip;
    public static String RefreshAction_Text;
    public static String RefreshAction_ToolTip;
    public static String ExportJsonWizardPage_ErrorMessage;
    public static String ExportJsonWizardPage_FileDialogSelectFile;
    public static String ExportJsonWizardPage_FileLabelText;
    public static String ExportJsonWizardPage_SelectButtonText;
    public static String ExportJsonWizardPage_SelectEcoreFileMessage;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
