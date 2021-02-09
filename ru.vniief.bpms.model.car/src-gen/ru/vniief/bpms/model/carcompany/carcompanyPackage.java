/**
 */
package ru.vniief.bpms.model.carcompany;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ru.vniief.bpms.model.carcompany.carcompanyFactory
 * @model kind="package"
 * @generated
 */
public interface carcompanyPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "carcompany";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/carcompany";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "carcompany";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    carcompanyPackage eINSTANCE = ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl.init();

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.carcompany.Company <em>Company</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.carcompany.Company
     * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getCompany()
     * @generated
     */
    int COMPANY = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPANY__NAME = 0;

    /**
     * The number of structural features of the '<em>Company</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPANY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Company</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPANY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.carcompany.impl.FordImpl <em>Ford</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.carcompany.impl.FordImpl
     * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getFord()
     * @generated
     */
    int FORD = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORD__NAME = COMPANY__NAME;

    /**
     * The number of structural features of the '<em>Ford</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORD_FEATURE_COUNT = COMPANY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Ford</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORD_OPERATION_COUNT = COMPANY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.carcompany.impl.BMWImpl <em>BMW</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.carcompany.impl.BMWImpl
     * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getBMW()
     * @generated
     */
    int BMW = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BMW__NAME = COMPANY__NAME;

    /**
     * The number of structural features of the '<em>BMW</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BMW_FEATURE_COUNT = COMPANY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>BMW</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BMW_OPERATION_COUNT = COMPANY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.carcompany.impl.VAZImpl <em>VAZ</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.carcompany.impl.VAZImpl
     * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getVAZ()
     * @generated
     */
    int VAZ = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAZ__NAME = COMPANY__NAME;

    /**
     * The number of structural features of the '<em>VAZ</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAZ_FEATURE_COUNT = COMPANY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>VAZ</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAZ_OPERATION_COUNT = COMPANY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ru.vniief.bpms.model.carcompany.impl.MazdaImpl <em>Mazda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.vniief.bpms.model.carcompany.impl.MazdaImpl
     * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getMazda()
     * @generated
     */
    int MAZDA = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAZDA__NAME = COMPANY__NAME;

    /**
     * The number of structural features of the '<em>Mazda</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAZDA_FEATURE_COUNT = COMPANY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Mazda</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAZDA_OPERATION_COUNT = COMPANY_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.carcompany.Company <em>Company</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Company</em>'.
     * @see ru.vniief.bpms.model.carcompany.Company
     * @generated
     */
    EClass getCompany();

    /**
     * Returns the meta object for the attribute '{@link ru.vniief.bpms.model.carcompany.Company#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ru.vniief.bpms.model.carcompany.Company#getName()
     * @see #getCompany()
     * @generated
     */
    EAttribute getCompany_Name();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.carcompany.Ford <em>Ford</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ford</em>'.
     * @see ru.vniief.bpms.model.carcompany.Ford
     * @generated
     */
    EClass getFord();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.carcompany.BMW <em>BMW</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>BMW</em>'.
     * @see ru.vniief.bpms.model.carcompany.BMW
     * @generated
     */
    EClass getBMW();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.carcompany.VAZ <em>VAZ</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VAZ</em>'.
     * @see ru.vniief.bpms.model.carcompany.VAZ
     * @generated
     */
    EClass getVAZ();

    /**
     * Returns the meta object for class '{@link ru.vniief.bpms.model.carcompany.Mazda <em>Mazda</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mazda</em>'.
     * @see ru.vniief.bpms.model.carcompany.Mazda
     * @generated
     */
    EClass getMazda();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    carcompanyFactory getcarcompanyFactory();

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
         * The meta object literal for the '{@link ru.vniief.bpms.model.carcompany.Company <em>Company</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.carcompany.Company
         * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getCompany()
         * @generated
         */
        EClass COMPANY = eINSTANCE.getCompany();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.carcompany.impl.FordImpl <em>Ford</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.carcompany.impl.FordImpl
         * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getFord()
         * @generated
         */
        EClass FORD = eINSTANCE.getFord();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.carcompany.impl.BMWImpl <em>BMW</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.carcompany.impl.BMWImpl
         * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getBMW()
         * @generated
         */
        EClass BMW = eINSTANCE.getBMW();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.carcompany.impl.VAZImpl <em>VAZ</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.carcompany.impl.VAZImpl
         * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getVAZ()
         * @generated
         */
        EClass VAZ = eINSTANCE.getVAZ();

        /**
         * The meta object literal for the '{@link ru.vniief.bpms.model.carcompany.impl.MazdaImpl <em>Mazda</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ru.vniief.bpms.model.carcompany.impl.MazdaImpl
         * @see ru.vniief.bpms.model.carcompany.impl.carcompanyPackageImpl#getMazda()
         * @generated
         */
        EClass MAZDA = eINSTANCE.getMazda();

    }

} //carcompanyPackage
