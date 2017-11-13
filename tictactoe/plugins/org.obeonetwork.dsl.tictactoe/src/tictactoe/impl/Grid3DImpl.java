/**
 */
package tictactoe.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tictactoe.Grid;
import tictactoe.Grid3D;
import tictactoe.TictactoePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.impl.Grid3DImpl#getGrids <em>Grids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Grid3DImpl extends MinimalEObjectImpl.Container implements Grid3D {
	/**
	 * The cached value of the '{@link #getGrids() <em>Grids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrids()
	 * @generated
	 * @ordered
	 */
	protected EList<Grid> grids;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grid3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TictactoePackage.Literals.GRID3_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grid> getGrids() {
		if (grids == null) {
			grids = new EObjectContainmentEList<Grid>(Grid.class, this, TictactoePackage.GRID3_D__GRIDS);
		}
		return grids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TictactoePackage.GRID3_D__GRIDS:
				return ((InternalEList<?>)getGrids()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TictactoePackage.GRID3_D__GRIDS:
				return getGrids();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TictactoePackage.GRID3_D__GRIDS:
				getGrids().clear();
				getGrids().addAll((Collection<? extends Grid>)newValue);
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
			case TictactoePackage.GRID3_D__GRIDS:
				getGrids().clear();
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
			case TictactoePackage.GRID3_D__GRIDS:
				return grids != null && !grids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Grid3DImpl
