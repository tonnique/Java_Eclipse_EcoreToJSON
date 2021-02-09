package ru.vniief.bpms.codepractice.api;

import com.google.gson.annotations.SerializedName;

/**
 * this class represents EType in model
 *
 */
public class EType {
    String eClass;
    @SerializedName("$ref")
    String reference;

    /**
     * @return EClass name
     */
    public String getEClass() {
        return eClass;
    }

    /**
     * Sets value to eClass field
     * @param eClass
     */
    public void setEClass(String eClass) {
        this.eClass = eClass;
    }

    /**
     *
     * @return reference value
     */
    public String getReferece() {
        return reference;
    }

    /**
     * Sets reference field
     * @param ref - new reference value
     */
    public void setReference(String ref) {
        this.reference = ref;
    }
}
