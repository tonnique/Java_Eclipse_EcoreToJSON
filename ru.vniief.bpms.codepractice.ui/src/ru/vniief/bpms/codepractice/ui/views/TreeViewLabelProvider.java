package ru.vniief.bpms.codepractice.ui.views;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import ru.vniief.bpms.codepractice.api.EClassifier;
import ru.vniief.bpms.codepractice.api.EFeature;
import ru.vniief.bpms.codepractice.api.EPackage;
import ru.vniief.bpms.codepractice.api.IEcoreJsonModel;
import ru.vniief.bpms.codepractice.internal.ui.Messages;

public class TreeViewLabelProvider extends LabelProvider {

    private static final String EMPTY_STRING = "";
    private static final String ICONS_FOLDER = "icons/";

    private static final Image PACKAGE = getImageDescriptor("package.png").createImage();
    private static final Image CLASS = getImageDescriptor("class_obj.png").createImage();
    private static final Image FIELD = getImageDescriptor("field_obj.gif").createImage();
    private static final Image REFERENCE = getImageDescriptor("EReference.gif").createImage();
    private static final Image CHECKED = getImageDescriptor("checked.png").createImage();
    private static final Image UNCHECKED = getImageDescriptor("unchecked.png").createImage();

    private final ISharedImages images = PlatformUI.getWorkbench().getSharedImages();


    @Override
    public String getText(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.contains(IEcoreJsonModel.INTERFACE)) {
                return removeColumnFromString(Messages.TreeView_interface);
            }
            if  (str.contains(IEcoreJsonModel.ABSTRACT)) {
                return removeColumnFromString(Messages.TreeView_abstract);
            }
            if (str.startsWith(IEcoreJsonModel.EREF_KEY)) {
                return str.replace(IEcoreJsonModel.EREF_KEY, EMPTY_STRING);
            }
        }
        return obj.toString();
    }

    @Override
    public Image getImage(Object obj) {
        String imageKey = ISharedImages.IMG_OBJ_ELEMENT;

        if (obj instanceof String) {
            String str = (String) obj;
            if (str.contains(IEcoreJsonModel.INTERFACE) || str.contains(IEcoreJsonModel.ABSTRACT)) {
                return (str.endsWith(IEcoreJsonModel.YES)) ? CHECKED : UNCHECKED;
            }
            if (str.startsWith(IEcoreJsonModel.EREF_KEY)) {
                return REFERENCE;
            }
        }
        if (obj instanceof EPackage) {
            return PACKAGE;
        }
        if (obj instanceof EClassifier) {
            return CLASS;
        }
        if (obj instanceof EFeature) {
            EFeature feature = (EFeature) obj;
            if (feature.getEClass().endsWith(IEcoreJsonModel.EREFERENCE)) {
                return REFERENCE;
            }
            if (feature.getEClass().endsWith(IEcoreJsonModel.EATTRIBUTE)) {
                return FIELD;
            }
        }
        return images.getImage(imageKey);
    }


    private String removeColumnFromString(String str) {
        if (str.contains(":")) {
            return str.substring(0, str.indexOf(":"));
        } else {
            return str;
        }
    }

    private static ImageDescriptor getImageDescriptor(String file) {
        Bundle bundle = FrameworkUtil.getBundle(TreeViewLabelProvider.class);
        URL url = FileLocator.find(bundle, new Path(ICONS_FOLDER + file), null);
        return ImageDescriptor.createFromURL(url);
    }
}
