/**
 */
package ru.vniief.bpms.model.car.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.vniief.bpms.model.car.Car;
import ru.vniief.bpms.model.car.CarFactory;
import ru.vniief.bpms.model.car.CarPackage;
import ru.vniief.bpms.model.car.MicroCar;
import ru.vniief.bpms.model.car.MiniVan;
import ru.vniief.bpms.model.car.Pickup;
import ru.vniief.bpms.model.car.Vehicle;

import ru.vniief.bpms.model.carcompany.carcompanyPackage;

import ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarPackageImpl extends EPackageImpl implements CarPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vehicleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass carEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass microCarEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pickupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass miniVanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass suvEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see ru.vniief.bpms.model.car.CarPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CarPackageImpl() {
        super(eNS_URI, CarFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link CarPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CarPackage init() {
        if (isInited)
            return (CarPackage) EPackage.Registry.INSTANCE.getEPackage(CarPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredCarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        CarPackageImpl theCarPackage = registeredCarPackage instanceof CarPackageImpl
                ? (CarPackageImpl) registeredCarPackage
                : new CarPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(carcompanyPackage.eNS_URI);
        carcompanyPackageImpl thecarcompanyPackage = (carcompanyPackageImpl) (registeredPackage instanceof carcompanyPackageImpl
                ? registeredPackage
                : carcompanyPackage.eINSTANCE);

        // Create package meta-data objects
        theCarPackage.createPackageContents();
        thecarcompanyPackage.createPackageContents();

        // Initialize created meta-data
        theCarPackage.initializePackageContents();
        thecarcompanyPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCarPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CarPackage.eNS_URI, theCarPackage);
        return theCarPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVehicle() {
        return vehicleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCar() {
        return carEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCar_Name() {
        return (EAttribute) carEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCar_Company() {
        return (EReference) carEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMicroCar() {
        return microCarEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPickup() {
        return pickupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMiniVan() {
        return miniVanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSUV() {
        return suvEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CarFactory getCarFactory() {
        return (CarFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        vehicleEClass = createEClass(VEHICLE);

        carEClass = createEClass(CAR);
        createEAttribute(carEClass, CAR__NAME);
        createEReference(carEClass, CAR__COMPANY);

        microCarEClass = createEClass(MICRO_CAR);

        pickupEClass = createEClass(PICKUP);

        miniVanEClass = createEClass(MINI_VAN);

        suvEClass = createEClass(SUV);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        carcompanyPackage thecarcompanyPackage = (carcompanyPackage) EPackage.Registry.INSTANCE
                .getEPackage(carcompanyPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        carEClass.getESuperTypes().add(this.getVehicle());
        microCarEClass.getESuperTypes().add(this.getCar());
        pickupEClass.getESuperTypes().add(this.getCar());
        miniVanEClass.getESuperTypes().add(this.getCar());
        suvEClass.getESuperTypes().add(this.getCar());

        // Initialize classes, features, and operations; add parameters
        initEClass(vehicleEClass, Vehicle.class, "Vehicle", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(carEClass, Car.class, "Car", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Car.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCar_Company(), thecarcompanyPackage.getCompany(), null, "company", null, 0, 1, Car.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(microCarEClass, MicroCar.class, "MicroCar", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(pickupEClass, Pickup.class, "Pickup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(miniVanEClass, MiniVan.class, "MiniVan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(suvEClass, ru.vniief.bpms.model.car.SUV.class, "SUV", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //CarPackageImpl
