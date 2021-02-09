/**
 */
package ru.vniief.bpms.model.carcompany.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.vniief.bpms.model.car.CarPackage;

import ru.vniief.bpms.model.car.impl.CarPackageImpl;

import ru.vniief.bpms.model.carcompany.Company;
import ru.vniief.bpms.model.carcompany.Ford;
import ru.vniief.bpms.model.carcompany.Mazda;
import ru.vniief.bpms.model.carcompany.carcompanyFactory;
import ru.vniief.bpms.model.carcompany.carcompanyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class carcompanyPackageImpl extends EPackageImpl implements carcompanyPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass companyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fordEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bmwEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vazEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mazdaEClass = null;

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
     * @see ru.vniief.bpms.model.carcompany.carcompanyPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private carcompanyPackageImpl() {
        super(eNS_URI, carcompanyFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link carcompanyPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static carcompanyPackage init() {
        if (isInited)
            return (carcompanyPackage) EPackage.Registry.INSTANCE.getEPackage(carcompanyPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredcarcompanyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        carcompanyPackageImpl thecarcompanyPackage = registeredcarcompanyPackage instanceof carcompanyPackageImpl
                ? (carcompanyPackageImpl) registeredcarcompanyPackage
                : new carcompanyPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CarPackage.eNS_URI);
        CarPackageImpl theCarPackage = (CarPackageImpl) (registeredPackage instanceof CarPackageImpl ? registeredPackage
                : CarPackage.eINSTANCE);

        // Create package meta-data objects
        thecarcompanyPackage.createPackageContents();
        theCarPackage.createPackageContents();

        // Initialize created meta-data
        thecarcompanyPackage.initializePackageContents();
        theCarPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thecarcompanyPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(carcompanyPackage.eNS_URI, thecarcompanyPackage);
        return thecarcompanyPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCompany() {
        return companyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCompany_Name() {
        return (EAttribute) companyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFord() {
        return fordEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBMW() {
        return bmwEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVAZ() {
        return vazEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMazda() {
        return mazdaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public carcompanyFactory getcarcompanyFactory() {
        return (carcompanyFactory) getEFactoryInstance();
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
        companyEClass = createEClass(COMPANY);
        createEAttribute(companyEClass, COMPANY__NAME);

        fordEClass = createEClass(FORD);

        bmwEClass = createEClass(BMW);

        vazEClass = createEClass(VAZ);

        mazdaEClass = createEClass(MAZDA);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        fordEClass.getESuperTypes().add(this.getCompany());
        bmwEClass.getESuperTypes().add(this.getCompany());
        vazEClass.getESuperTypes().add(this.getCompany());
        mazdaEClass.getESuperTypes().add(this.getCompany());

        // Initialize classes, features, and operations; add parameters
        initEClass(companyEClass, Company.class, "Company", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCompany_Name(), ecorePackage.getEString(), "name", null, 0, 1, Company.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fordEClass, Ford.class, "Ford", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bmwEClass, ru.vniief.bpms.model.carcompany.BMW.class, "BMW", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(vazEClass, ru.vniief.bpms.model.carcompany.VAZ.class, "VAZ", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(mazdaEClass, Mazda.class, "Mazda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //carcompanyPackageImpl
