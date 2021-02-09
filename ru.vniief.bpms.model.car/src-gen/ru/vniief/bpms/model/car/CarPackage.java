/**
 */
package ru.vniief.bpms.model.car;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.vniief.bpms.model.car.CarFactory
 * @model kind="package"
 * @generated
 */
public interface CarPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "car";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/car";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "car";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CarPackage eINSTANCE = ru.vniief.bpms.model.car.impl.CarPackageImpl.init();

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.car.Vehicle <em>Vehicle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.car.Vehicle
     * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getVehicle()
     * @generated
     */
    int VEHICLE = 0;

    /**
     * The number of structural features of the '<em>Vehicle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VEHICLE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Vehicle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VEHICLE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.car.Car <em>Car</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.car.Car
     * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getCar()
     * @generated
     */
    int CAR = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR__NAME = VEHICLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Company</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR__COMPANY = VEHICLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Car</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Car</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.car.impl.MicroCarImpl <em>Micro Car</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.car.impl.MicroCarImpl
     * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getMicroCar()
     * @generated
     */
    int MICRO_CAR = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICRO_CAR__NAME = CAR__NAME;

    /**
     * The feature id for the '<em><b>Company</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICRO_CAR__COMPANY = CAR__COMPANY;

    /**
     * The number of structural features of the '<em>Micro Car</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICRO_CAR_FEATURE_COUNT = CAR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Micro Car</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICRO_CAR_OPERATION_COUNT = CAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.car.impl.PickupImpl <em>Pickup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.car.impl.PickupImpl
     * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getPickup()
     * @generated
     */
    int PICKUP = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PICKUP__NAME = CAR__NAME;

    /**
     * The feature id for the '<em><b>Company</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PICKUP__COMPANY = CAR__COMPANY;

    /**
     * The number of structural features of the '<em>Pickup</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PICKUP_FEATURE_COUNT = CAR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Pickup</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PICKUP_OPERATION_COUNT = CAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.car.impl.MiniVanImpl <em>Mini Van</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.car.impl.MiniVanImpl
     * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getMiniVan()
     * @generated
     */
    int MINI_VAN = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINI_VAN__NAME = CAR__NAME;

    /**
     * The feature id for the '<em><b>Company</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINI_VAN__COMPANY = CAR__COMPANY;

    /**
     * The number of structural features of the '<em>Mini Van</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINI_VAN_FEATURE_COUNT = CAR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Mini Van</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINI_VAN_OPERATION_COUNT = CAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.car.impl.SUVImpl <em>SUV</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.car.impl.SUVImpl
     * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getSUV()
     * @generated
     */
    int SUV = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUV__NAME = CAR__NAME;

    /**
     * The feature id for the '<em><b>Company</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUV__COMPANY = CAR__COMPANY;

    /**
     * The number of structural features of the '<em>SUV</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUV_FEATURE_COUNT = CAR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>SUV</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUV_OPERATION_COUNT = CAR_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.car.Vehicle <em>Vehicle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vehicle</em>'.
     * @see ru.vniief.bpms.model.car.Vehicle
     * @generated
     */
    EClass getVehicle();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.car.Car <em>Car</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Car</em>'.
     * @see ru.vniief.bpms.model.car.Car
     * @generated
     */
    EClass getCar();

    /**
     * Returns the meta object for the attribute '{@link ru.vniief.bpms.model.car.Car#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ru.vniief.bpms.model.car.Car#getName()
     * @see #getCar()
     * @generated
     */
    EAttribute getCar_Name();

    /**
     * Returns the meta object for the reference '{@link ru.vniief.bpms.model.car.Car#getCompany <em>Company</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Company</em>'.
     * @see ru.vniief.bpms.model.car.Car#getCompany()
     * @see #getCar()
     * @generated
     */
    EReference getCar_Company();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.car.MicroCar <em>Micro Car</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Micro Car</em>'.
     * @see ru.vniief.bpms.model.car.MicroCar
     * @generated
     */
    EClass getMicroCar();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.car.Pickup <em>Pickup</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pickup</em>'.
     * @see ru.vniief.bpms.model.car.Pickup
     * @generated
     */
    EClass getPickup();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.car.MiniVan <em>Mini Van</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mini Van</em>'.
     * @see ru.vniief.bpms.model.car.MiniVan
     * @generated
     */
    EClass getMiniVan();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.car.SUV <em>SUV</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SUV</em>'.
     * @see ru.vniief.bpms.model.car.SUV
     * @generated
     */
    EClass getSUV();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CarFactory getCarFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.car.Vehicle <em>Vehicle</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.car.Vehicle
         * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getVehicle()
         * @generated
         */
        EClass VEHICLE = eINSTANCE.getVehicle();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.car.Car <em>Car</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.car.Car
         * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getCar()
         * @generated
         */
        EClass CAR = eINSTANCE.getCar();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAR__NAME = eINSTANCE.getCar_Name();

        /**
         * The meta object literal for the '<em><b>Company</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAR__COMPANY = eINSTANCE.getCar_Company();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.car.impl.MicroCarImpl <em>Micro Car</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.car.impl.MicroCarImpl
         * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getMicroCar()
         * @generated
         */
        EClass MICRO_CAR = eINSTANCE.getMicroCar();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.car.impl.PickupImpl <em>Pickup</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.car.impl.PickupImpl
         * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getPickup()
         * @generated
         */
        EClass PICKUP = eINSTANCE.getPickup();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.car.impl.MiniVanImpl <em>Mini Van</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.car.impl.MiniVanImpl
         * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getMiniVan()
         * @generated
         */
        EClass MINI_VAN = eINSTANCE.getMiniVan();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.car.impl.SUVImpl <em>SUV</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.car.impl.SUVImpl
         * @see ru.vniief.bpms.model.car.impl.CarPackageImpl#getSUV()
         * @generated
         */
        EClass SUV = eINSTANCE.getSUV();

    }

} //CarPackage
