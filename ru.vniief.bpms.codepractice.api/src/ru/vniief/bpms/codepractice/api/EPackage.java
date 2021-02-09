package ru.vniief.bpms.codepractice.api;

import java.util.ArrayList;
import java.util.List;

/**
 * this class represents EPackage
 */
public class EPackage {

    List<EClassifier> eClassifiers = new ArrayList<>();

    String name = "";
    String eClass = "";

    /**
     * @return name value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new name
     * @param name - new name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets new eClass value
     * @param eClass - new eClass value
     */
    public void setEClass(String eClass) {
        this.eClass = eClass;
    }

    /**
     * @return value of eClass
     */
    public String getEClass() {
        return eClass;
    }

    /**
     * return Classifier objects that EPackage holds
     * @return list of EClassifier objects
     */
    public List<EClassifier> getEClassifiers() {
        return new ArrayList<>(eClassifiers);
    }

    /**
     * sets new value for eClassifiers list
     * @param classifiers new list of EClassifier objects
     */
    public void setEClassifiers(List<EClassifier> classifiers) {
        this.eClassifiers = classifiers;
    }

    @Override
    public String toString() {
        return name;
    }
}
