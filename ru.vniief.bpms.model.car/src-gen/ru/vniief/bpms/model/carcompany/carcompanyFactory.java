/**
 */
package ru.vniief.bpms.model.carcompany;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.vniief.bpms.model.carcompany.carcompanyPackage
 * @generated
 */
public interface carcompanyFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    carcompanyFactory eINSTANCE = ru.vniief.bpms.model.carcompany.impl.carcompanyFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Ford</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ford</em>'.
     * @generated
     */
    Ford createFord();

    /**
     * Returns a new object of class '<em>BMW</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>BMW</em>'.
     * @generated
     */
    BMW createBMW();

    /**
     * Returns a new object of class '<em>VAZ</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VAZ</em>'.
     * @generated
     */
    VAZ createVAZ();

    /**
     * Returns a new object of class '<em>Mazda</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mazda</em>'.
     * @generated
     */
    Mazda createMazda();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    carcompanyPackage getcarcompanyPackage();

} //carcompanyFactory
