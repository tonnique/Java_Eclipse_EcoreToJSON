package ru.vniief.bpms.codepractice.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.osgi.util.NLS;

import ru.vniief.bpms.codepractice.api.EClassifier;
import ru.vniief.bpms.codepractice.api.EFeature;
import ru.vniief.bpms.codepractice.api.EPackage;
import ru.vniief.bpms.codepractice.api.EType;
import ru.vniief.bpms.codepractice.api.EcoreJsonModel;
import ru.vniief.bpms.codepractice.api.IEcoreJsonModel;
import ru.vniief.bpms.codepractice.internal.ui.Messages;


public class TreeViewContentProvider implements ITreeContentProvider {
    private static final String EMPTY_STRING = "";
    private final Object[] NO_DATA = new Object[0];

    @Override
    public Object[] getElements(Object element) {
          if (element instanceof EcoreJsonModel) {
              EcoreJsonModel model = (EcoreJsonModel) element;
              List<Object> children = new ArrayList<>();
              if (model.getEpackage() != null) {
                  children.add(model.getEpackage());
                  return children.toArray();
              }
          }
          return NO_DATA;
    }

    @Override
    public Object[] getChildren(Object parent) {

        ArrayList<Object> children = new ArrayList<>();
        if (parent instanceof EPackage) {
            EPackage ePackage = (EPackage) parent;
            children.add(getEClassName(ePackage.getEClass()));
            for (EClassifier classifier : ePackage.getEClassifiers()) {
                children.add(classifier);
            }
            return children.toArray();
        }
        if (parent instanceof EClassifier) {
            EClassifier classifier = (EClassifier) parent;
            String isAbstract = IEcoreJsonModel.ABSTRACT + (classifier.isAbstract() ? IEcoreJsonModel.YES : IEcoreJsonModel.NO);
            String isInterface = IEcoreJsonModel.INTERFACE + (classifier.isInterface() ? IEcoreJsonModel.YES :IEcoreJsonModel. NO);
            children.add(isAbstract);
            children.add(isInterface);
            for (EFeature feature: classifier.getEStructuralFeatures()) {
                children.add(feature);
            }
            for (EType eType: classifier.getESuperTypes()) {
                children.add(IEcoreJsonModel.EREF_KEY + getEClassName(eType.getReferece()));
            }
            return children.toArray();
        }
        if (parent instanceof EFeature) {
            EFeature eFeature = (EFeature) parent;
            children.add(getEClassName(eFeature.getEClass()));
        }
        return children.toArray();
    }


    @Override
    public Object getParent(Object child) {
        return null;
    }

    @Override
    public boolean hasChildren(Object parent) {
      boolean hasChildren = false;
      if (parent instanceof EPackage) {
          hasChildren = true;
      }
      if (parent instanceof EFeature) {
          hasChildren = true;
      }
      if (parent instanceof EClassifier) {
          EClassifier classifier = (EClassifier) parent;
          hasChildren = (classifier.getEStructuralFeatures().size() > 0 || classifier.getESuperTypes().size() > 0);
      }
      return hasChildren;
    }

    private String getEClassName(String eClass) {
        if (eClass.contains(IEcoreJsonModel.SLASHES)) {
            String eClassName = eClass.substring(eClass.lastIndexOf(IEcoreJsonModel.SLASHES) + 2);
            return (NLS.bind("{0} {1}", Messages.TreeView_Type, eClassName));
        } else {
            return EMPTY_STRING;
        }
    }
}
