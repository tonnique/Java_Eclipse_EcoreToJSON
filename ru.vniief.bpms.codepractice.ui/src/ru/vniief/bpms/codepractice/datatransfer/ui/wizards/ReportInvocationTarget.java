package ru.vniief.bpms.codepractice.datatransfer.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;

public final class ReportInvocationTarget implements Consumer<InvocationTargetException> {

    private final Supplier<String> title;
    private final Supplier<Shell> shell;
    private final String statusMessage;

    public ReportInvocationTarget(Supplier<String> title, Supplier<Shell> shell, String statusMessage) {
        super();
        this.title = title;
        this.shell = shell;
        this.statusMessage = statusMessage;
    }

    @Override
    public void accept(InvocationTargetException e) {
        Throwable target = e.getTargetException();
        if (target instanceof CoreException) {
            CoreException ce = (CoreException) target;
            reportError(ce.getStatus());
        } else {
            reportError(new Status(IStatus.ERROR, getClass(), statusMessage, target));
        }
    }

    private void reportError(IStatus status) {
        Platform.getLog(getClass()).log(status);
        ErrorDialog.openError(shell.get(), title.get(), statusMessage, status);
    }
}
