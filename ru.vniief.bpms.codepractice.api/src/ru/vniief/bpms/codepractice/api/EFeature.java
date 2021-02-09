package ru.vniief.bpms.codepractice.api;

/**
 * this class represents EFeature
 */
public class EFeature {
    String eClass;
    String name;
    EType eType;

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
     * @return eType value
     */
    public EType getEType() {
        return eType;
    }

    /**
     * Sets new eType
     * @param name - new eType value
     */
    public void setEType(EType eType) {
        this.eType = eType;
    }

    @Override
    public String toString() {
        return name;
    }

}
