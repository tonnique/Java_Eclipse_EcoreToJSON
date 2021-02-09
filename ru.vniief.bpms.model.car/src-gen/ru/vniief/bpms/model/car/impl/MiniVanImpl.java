/**
 */
package ru.vniief.bpms.model.car.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.vniief.bpms.model.car.CarPackage;
import ru.vniief.bpms.model.car.MiniVan;

import ru.vniief.bpms.model.carcompany.Company;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mini Van</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.vniief.bpms.model.car.impl.MiniVanImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.vniief.bpms.model.car.impl.MiniVanImpl#getCompany <em>Company</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiniVanImpl extends MinimalEObjectImpl.Container implements MiniVan {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getCompany() <em>Company</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompany()
     * @generated
     * @ordered
     */
    protected Company company;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MiniVanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CarPackage.Literals.MINI_VAN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CarPackage.MINI_VAN__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Company getCompany() {
        if (company != null && company.eIsProxy()) {
            InternalEObject oldCompany = (InternalEObject) company;
            company = (Company) eResolveProxy(oldCompany);
            if (company != oldCompany) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CarPackage.MINI_VAN__COMPANY, oldCompany,
                            company));
            }
        }
        return company;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Company basicGetCompany() {
        return company;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCompany(Company newCompany) {
        Company oldCompany = company;
        company = newCompany;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CarPackage.MINI_VAN__COMPANY, oldCompany, company));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case CarPackage.MINI_VAN__NAME:
            return getName();
        case CarPackage.MINI_VAN__COMPANY:
            if (resolve)
                return getCompany();
            return basicGetCompany();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case CarPackage.MINI_VAN__NAME:
            setName((String) newValue);
            return;
        case CarPackage.MINI_VAN__COMPANY:
            setCompany((Company) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case CarPackage.MINI_VAN__NAME:
            setName(NAME_EDEFAULT);
            return;
        case CarPackage.MINI_VAN__COMPANY:
            setCompany((Company) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case CarPackage.MINI_VAN__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case CarPackage.MINI_VAN__COMPANY:
            return company != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //MiniVanImpl
