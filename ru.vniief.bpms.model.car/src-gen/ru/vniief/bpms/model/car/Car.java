/**
 */
package ru.vniief.bpms.model.car;

import ru.vniief.bpms.model.carcompany.Company;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.vniief.bpms.model.car.Car#getName <em>Name</em>}</li>
 *   <li>{@link ru.vniief.bpms.model.car.Car#getCompany <em>Company</em>}</li>
 * </ul>
 *
 * @see ru.vniief.bpms.model.car.CarPackage#getCar()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Car extends Vehicle {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ru.vniief.bpms.model.car.CarPackage#getCar_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ru.vniief.bpms.model.car.Car#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Company</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Company</em>' reference.
     * @see #setCompany(Company)
     * @see ru.vniief.bpms.model.car.CarPackage#getCar_Company()
     * @model
     * @generated
     */
    Company getCompany();

    /**
     * Sets the value of the '{@link ru.vniief.bpms.model.car.Car#getCompany <em>Company</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Company</em>' reference.
     * @see #getCompany()
     * @generated
     */
    void setCompany(Company value);

} // Car
