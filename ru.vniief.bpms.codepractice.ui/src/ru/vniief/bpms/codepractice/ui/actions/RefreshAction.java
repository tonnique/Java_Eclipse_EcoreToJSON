package ru.vniief.bpms.codepractice.ui.actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.Viewer;

import ru.vniief.bpms.codepractice.internal.ui.Messages;


public class RefreshAction extends Action {
    private final Viewer viewer;

    public RefreshAction(Viewer viewer) {
        this.viewer = viewer;
        initialize();
    }

    public void run() {
        viewer.refresh();
    }

    private void initialize() {
        setText(Messages.RefreshAction_Text);
        setToolTipText(Messages.RefreshAction_ToolTip);

        URL url = null;
        try {
            url = new URL("platform:/plugin/org.eclipse.pde.runtime/icons/elcl16/refresh.png"); //$NON-NLS-1$
        } catch(MalformedURLException e) {
            System.out.println(e.toString());
        }

        setImageDescriptor(ImageDescriptor.createFromURL(url));
    }
}
