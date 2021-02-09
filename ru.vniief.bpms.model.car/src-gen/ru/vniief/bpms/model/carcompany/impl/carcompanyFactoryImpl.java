/**
 */
package ru.vniief.bpms.model.carcompany.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.vniief.bpms.model.carcompany.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class carcompanyFactoryImpl extends EFactoryImpl implements carcompanyFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static carcompanyFactory init() {
        try {
            carcompanyFactory thecarcompanyFactory = (carcompanyFactory) EPackage.Registry.INSTANCE
                    .getEFactory(carcompanyPackage.eNS_URI);
            if (thecarcompanyFactory != null) {
                return thecarcompanyFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new carcompanyFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public carcompanyFactoryImpl() {
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
        case carcompanyPackage.FORD:
            return createFord();
        case carcompanyPackage.BMW:
            return createBMW();
        case carcompanyPackage.VAZ:
            return createVAZ();
        case carcompanyPackage.MAZDA:
            return createMazda();
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
    public Ford createFord() {
        FordImpl ford = new FordImpl();
        return ford;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BMW createBMW() {
        BMWImpl bmw = new BMWImpl();
        return bmw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VAZ createVAZ() {
        VAZImpl vaz = new VAZImpl();
        return vaz;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Mazda createMazda() {
        MazdaImpl mazda = new MazdaImpl();
        return mazda;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public carcompanyPackage getcarcompanyPackage() {
        return (carcompanyPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static carcompanyPackage getPackage() {
        return carcompanyPackage.eINSTANCE;
    }

} //carcompanyFactoryImpl
