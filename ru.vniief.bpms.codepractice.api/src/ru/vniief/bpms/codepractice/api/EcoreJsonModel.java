package ru.vniief.bpms.codepractice.api;

/**
 * this class represents model that is red from JSON
 */
public class EcoreJsonModel {
    EPackage ePackage;

    /**
     * Constructs empty EcoreJsonModel object
     */
    EcoreJsonModel() {}

    /**
     * Constructs EcoreJsonModel object with specified EPackage
     */
    EcoreJsonModel(EPackage ePackage) {
        this.ePackage = ePackage;
    }

    /**
     * sets new ePackage
     * @param ePackage new ePackage value
     */
    public void setEpackage(EPackage ePackage) {
        this.ePackage = ePackage;
    }

    /**
     * @return ePackage value
     */
    public EPackage getEpackage() {
        return ePackage;
    }
}



