package ru.vniief.bpms.codepractice.api;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * represents EClassifier object
 *
 */
public class EClassifier  {
    List<EFeature> eStructuralFeatures = new ArrayList<>();
    List<EType> eSuperTypes = new ArrayList<>();

    String name;
    String eClass;

    @SerializedName("abstract")
    boolean isAbstract;
    @SerializedName("interface")
    boolean isInterface;


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
     * Defines if object should be abstract or not
     * @return true if abstract or false in another case
     */
    public boolean isAbstract() {
        return isAbstract;
    }

    /**
     * Sets abstract value
     * @param b - true or false
     */
    public void isAbstract(boolean b) {
        this.isAbstract = b;
    }

    /**
     * Defines if object should be interface or not
     * @return true if interface or false in another case
     */
    public boolean isInterface() {
        return isInterface;
    }

    /**
     * Sets interface value
     * @param b - true or false
     */
    public void isInterface(boolean b) {
        this.isInterface = b;
    }

    /**
     * @return list of EStructuralFeatures objects
     */
    public List<EFeature> getEStructuralFeatures() {
        return new ArrayList<>(eStructuralFeatures);
    }

    /**
     * sets new list of EStructuralFeatures
     * @param eStructuralFeatures - new list of EStructuralFeatures
     */
    public void setEStructuralFeatures(List<EFeature> eStructuralFeatures) {
        this.eStructuralFeatures = eStructuralFeatures;
    }

    /**
     * @return list of ESuperTypes
     */
    public List<EType> getESuperTypes() {
        return new ArrayList<>(eSuperTypes);
    }

    /**
     * Sets new value of list of EType
     * @param eSuperTypes - new list of EType objects
     */
    public void setESuperTypes(List<EType> eSuperTypes) {
        this.eSuperTypes = eSuperTypes;
    }

    @Override
    public String toString() {
        return name;
    }
}




