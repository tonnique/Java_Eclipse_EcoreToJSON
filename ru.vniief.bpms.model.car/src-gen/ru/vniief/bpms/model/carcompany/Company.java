/**
 */
package ru.vniief.bpms.model.carcompany;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.vniief.bpms.model.carcompany.Company#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ru.vniief.bpms.model.carcompany.carcompanyPackage#getCompany()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Company extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ru.vniief.bpms.model.carcompany.carcompanyPackage#getCompany_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ru.vniief.bpms.model.carcompany.Company#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Company
