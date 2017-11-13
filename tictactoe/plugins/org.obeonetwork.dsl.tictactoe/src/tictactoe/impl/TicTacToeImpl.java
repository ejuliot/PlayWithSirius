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

import tictactoe.Grid3D;
import tictactoe.TicTacToe;
import tictactoe.TictactoePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tic Tac Toe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.impl.TicTacToeImpl#getGrids3d <em>Grids3d</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TicTacToeImpl extends MinimalEObjectImpl.Container implements TicTacToe {
	/**
	 * The cached value of the '{@link #getGrids3d() <em>Grids3d</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrids3d()
	 * @generated
	 * @ordered
	 */
	protected EList<Grid3D> grids3d;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicTacToeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TictactoePackage.Literals.TIC_TAC_TOE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grid3D> getGrids3d() {
		if (grids3d == null) {
			grids3d = new EObjectContainmentEList<Grid3D>(Grid3D.class, this, TictactoePackage.TIC_TAC_TOE__GRIDS3D);
		}
		return grids3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TictactoePackage.TIC_TAC_TOE__GRIDS3D:
				return ((InternalEList<?>)getGrids3d()).basicRemove(otherEnd, msgs);
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
			case TictactoePackage.TIC_TAC_TOE__GRIDS3D:
				return getGrids3d();
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
			case TictactoePackage.TIC_TAC_TOE__GRIDS3D:
				getGrids3d().clear();
				getGrids3d().addAll((Collection<? extends Grid3D>)newValue);
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
			case TictactoePackage.TIC_TAC_TOE__GRIDS3D:
				getGrids3d().clear();
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
			case TictactoePackage.TIC_TAC_TOE__GRIDS3D:
				return grids3d != null && !grids3d.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TicTacToeImpl
