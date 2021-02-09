/**
 */
package ru.vniief.bpms.model.car.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.vniief.bpms.model.car.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.vniief.bpms.model.car.CarPackage
 * @generated
 */
public class CarSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CarPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CarSwitch() {
        if (modelPackage == null) {
            modelPackage = CarPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case CarPackage.VEHICLE: {
            Vehicle vehicle = (Vehicle) theEObject;
            T result = caseVehicle(vehicle);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CarPackage.CAR: {
            Car car = (Car) theEObject;
            T result = caseCar(car);
            if (result == null)
                result = caseVehicle(car);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CarPackage.MICRO_CAR: {
            MicroCar microCar = (MicroCar) theEObject;
            T result = caseMicroCar(microCar);
            if (result == null)
                result = caseCar(microCar);
            if (result == null)
                result = caseVehicle(microCar);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CarPackage.PICKUP: {
            Pickup pickup = (Pickup) theEObject;
            T result = casePickup(pickup);
            if (result == null)
                result = caseCar(pickup);
            if (result == null)
                result = caseVehicle(pickup);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CarPackage.MINI_VAN: {
            MiniVan miniVan = (MiniVan) theEObject;
            T result = caseMiniVan(miniVan);
            if (result == null)
                result = caseCar(miniVan);
            if (result == null)
                result = caseVehicle(miniVan);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CarPackage.SUV: {
            SUV suv = (SUV) theEObject;
            T result = caseSUV(suv);
            if (result == null)
                result = caseCar(suv);
            if (result == null)
                result = caseVehicle(suv);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVehicle(Vehicle object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Car</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Car</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCar(Car object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Micro Car</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Micro Car</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMicroCar(MicroCar object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pickup</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pickup</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePickup(Pickup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mini Van</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mini Van</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiniVan(MiniVan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SUV</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SUV</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSUV(SUV object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //CarSwitch
