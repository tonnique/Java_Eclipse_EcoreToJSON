/**
 */
package ru.vniief.bpms.model.car;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.vniief.bpms.model.car.CarPackage
 * @generated
 */
public interface CarFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CarFactory eINSTANCE = ru.vniief.bpms.model.car.impl.CarFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Micro Car</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Micro Car</em>'.
     * @generated
     */
    MicroCar createMicroCar();

    /**
     * Returns a new object of class '<em>Pickup</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pickup</em>'.
     * @generated
     */
    Pickup createPickup();

    /**
     * Returns a new object of class '<em>Mini Van</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mini Van</em>'.
     * @generated
     */
    MiniVan createMiniVan();

    /**
     * Returns a new object of class '<em>SUV</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SUV</em>'.
     * @generated
     */
    SUV createSUV();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CarPackage getCarPackage();

} //CarFactory
