/**
 */
package ru.vniief.bpms.model.car.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.vniief.bpms.model.car.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarFactoryImpl extends EFactoryImpl implements CarFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CarFactory init() {
        try {
            CarFactory theCarFactory = (CarFactory) EPackage.Registry.INSTANCE.getEFactory(CarPackage.eNS_URI);
            if (theCarFactory != null) {
                return theCarFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CarFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CarFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case CarPackage.MICRO_CAR:
            return createMicroCar();
        case CarPackage.PICKUP:
            return createPickup();
        case CarPackage.MINI_VAN:
            return createMiniVan();
        case CarPackage.SUV:
            return createSUV();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MicroCar createMicroCar() {
        MicroCarImpl microCar = new MicroCarImpl();
        return microCar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pickup createPickup() {
        PickupImpl pickup = new PickupImpl();
        return pickup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MiniVan createMiniVan() {
        MiniVanImpl miniVan = new MiniVanImpl();
        return miniVan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SUV createSUV() {
        SUVImpl suv = new SUVImpl();
        return suv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CarPackage getCarPackage() {
        return (CarPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CarPackage getPackage() {
        return CarPackage.eINSTANCE;
    }

} //CarFactoryImpl
