/**
 */
package ru.vniief.bpms.model.carcompany.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.vniief.bpms.model.carcompany.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.vniief.bpms.model.carcompany.carcompanyPackage
 * @generated
 */
public class carcompanyAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static carcompanyPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public carcompanyAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = carcompanyPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected carcompanySwitch<Adapter> modelSwitch = new carcompanySwitch<Adapter>() {
        @Override
        public Adapter caseCompany(Company object) {
            return createCompanyAdapter();
        }

        @Override
        public Adapter caseFord(Ford object) {
            return createFordAdapter();
        }

        @Override
        public Adapter caseBMW(BMW object) {
            return createBMWAdapter();
        }

        @Override
        public Adapter caseVAZ(VAZ object) {
            return createVAZAdapter();
        }

        @Override
        public Adapter caseMazda(Mazda object) {
            return createMazdaAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link ru.vniief.bpms.model.carcompany.Company <em>Company</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ru.vniief.bpms.model.carcompany.Company
     * @generated
     */
    public Adapter createCompanyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ru.vniief.bpms.model.carcompany.Ford <em>Ford</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ru.vniief.bpms.model.carcompany.Ford
     * @generated
     */
    public Adapter createFordAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ru.vniief.bpms.model.carcompany.BMW <em>BMW</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ru.vniief.bpms.model.carcompany.BMW
     * @generated
     */
    public Adapter createBMWAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ru.vniief.bpms.model.carcompany.VAZ <em>VAZ</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ru.vniief.bpms.model.carcompany.VAZ
     * @generated
     */
    public Adapter createVAZAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ru.vniief.bpms.model.carcompany.Mazda <em>Mazda</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ru.vniief.bpms.model.carcompany.Mazda
     * @generated
     */
    public Adapter createMazdaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //carcompanyAdapterFactory
