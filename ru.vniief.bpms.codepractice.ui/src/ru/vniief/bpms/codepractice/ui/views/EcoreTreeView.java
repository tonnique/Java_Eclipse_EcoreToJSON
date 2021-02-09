package ru.vniief.bpms.codepractice.ui.views;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import ru.vniief.bpms.codepractice.api.EcoreTableModelProvider;
import ru.vniief.bpms.codepractice.ui.actions.ExportEcoreAction;
import ru.vniief.bpms.codepractice.ui.actions.RefreshAction;

public class EcoreTreeView extends ViewPart {
    private static final String HELP_CONTEXT_ID = "ru.vniief.bpms.codepractice.ui.viewer";
    private static final String POPUP_MENU = "#PopupMenu";

    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = "ru.vniief.bpms.codepractice.ui.views.EcoreView";

    private final EcoreTableModelProvider modelProvider;
    private final IWorkbench workbench;
    private TreeViewer viewer;

    private DrillDownAdapter drillDownAdapter;
    private Action refreshAction;
    private Action exportEcoreAction;


    /**
     * Constructor builds ViewPart with TreeViewer
     * which displays ecore structure imported from JSON
     */
    public EcoreTreeView() {
        this.workbench = PlatformUI.getWorkbench();
        modelProvider = EcoreTableModelProvider.INSTANCE;
        modelProvider.addPropertyChangeListener(EcoreTableModelProvider.JSON_EMF_MODEL, new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                viewer.refresh();
            }
        });
    }

    @Override
    public void createPartControl(Composite parent) {
        viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        viewer.setContentProvider(new TreeViewContentProvider());
        viewer.setLabelProvider(new TreeViewLabelProvider());
        viewer.setInput(modelProvider.getModel());

        drillDownAdapter = new DrillDownAdapter(viewer);
        workbench.getHelpSystem().setHelp(viewer.getControl(), HELP_CONTEXT_ID);
        getSite().setSelectionProvider(viewer);

        makeActions();
        hookContextMenu();
        contributeToActionBars();
    }

    private void hookContextMenu() {
        MenuManager menuMgr = new MenuManager(POPUP_MENU);
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            public void menuAboutToShow(IMenuManager manager) {
                EcoreTreeView.this.fillContextMenu(manager);
            }
        });
        Menu menu = menuMgr.createContextMenu(viewer.getControl());
        viewer.getControl().setMenu(menu);
        getSite().registerContextMenu(menuMgr, viewer);
    }

    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(IMenuManager manager) {
        manager.add(refreshAction);
        manager.add(exportEcoreAction);
        manager.add(new Separator());
    }

    private void fillContextMenu(IMenuManager manager) {
        manager.add(refreshAction);
        manager.add(exportEcoreAction);
        manager.add(new Separator());
        drillDownAdapter.addNavigationActions(manager);
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    private void fillLocalToolBar(IToolBarManager manager) {
        manager.add(refreshAction);
        manager.add(exportEcoreAction);
        manager.add(new Separator());
        drillDownAdapter.addNavigationActions(manager);
    }

    private void makeActions() {
        refreshAction = new RefreshAction(viewer);
        exportEcoreAction = new ExportEcoreAction(viewer);
    }

    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }
}
