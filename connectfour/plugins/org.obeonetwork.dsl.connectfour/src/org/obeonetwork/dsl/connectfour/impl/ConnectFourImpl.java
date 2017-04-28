/**
 */
package org.obeonetwork.dsl.connectfour.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.connectfour.ConnectFour;
import org.obeonetwork.dsl.connectfour.ConnectfourPackage;
import org.obeonetwork.dsl.connectfour.Grid;
import org.obeonetwork.dsl.connectfour.Player;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect Four</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.ConnectFourImpl#getGrids <em>Grids</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.ConnectFourImpl#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectFourImpl extends MinimalEObjectImpl.Container implements ConnectFour {
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
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectFourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectfourPackage.Literals.CONNECT_FOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grid> getGrids() {
		if (grids == null) {
			grids = new EObjectContainmentEList<Grid>(Grid.class, this, ConnectfourPackage.CONNECT_FOUR__GRIDS);
		}
		return grids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<Player>(Player.class, this, ConnectfourPackage.CONNECT_FOUR__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectfourPackage.CONNECT_FOUR__GRIDS:
				return ((InternalEList<?>)getGrids()).basicRemove(otherEnd, msgs);
			case ConnectfourPackage.CONNECT_FOUR__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
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
			case ConnectfourPackage.CONNECT_FOUR__GRIDS:
				return getGrids();
			case ConnectfourPackage.CONNECT_FOUR__PLAYERS:
				return getPlayers();
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
			case ConnectfourPackage.CONNECT_FOUR__GRIDS:
				getGrids().clear();
				getGrids().addAll((Collection<? extends Grid>)newValue);
				return;
			case ConnectfourPackage.CONNECT_FOUR__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
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
			case ConnectfourPackage.CONNECT_FOUR__GRIDS:
				getGrids().clear();
				return;
			case ConnectfourPackage.CONNECT_FOUR__PLAYERS:
				getPlayers().clear();
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
			case ConnectfourPackage.CONNECT_FOUR__GRIDS:
				return grids != null && !grids.isEmpty();
			case ConnectfourPackage.CONNECT_FOUR__PLAYERS:
				return players != null && !players.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectFourImpl
