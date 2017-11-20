/**
 */
package org.obeonetwork.dsl.connectfour.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.connectfour.Cell;
import org.obeonetwork.dsl.connectfour.Column;
import org.obeonetwork.dsl.connectfour.ConnectfourPackage;
import org.obeonetwork.dsl.connectfour.Grid;
import org.obeonetwork.dsl.connectfour.Line;
import org.obeonetwork.dsl.connectfour.Player;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.GridImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.GridImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.GridImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.GridImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.GridImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.GridImpl#getPlayer1 <em>Player1</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.impl.GridImpl#getPlayer2 <em>Player2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridImpl extends MinimalEObjectImpl.Container implements Grid {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Player winner;

	/**
	 * The cached value of the '{@link #getPlayer1() <em>Player1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer1()
	 * @generated
	 * @ordered
	 */
	protected Player player1;

	/**
	 * The cached value of the '{@link #getPlayer2() <em>Player2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer2()
	 * @generated
	 * @ordered
	 */
	protected Player player2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectfourPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, ConnectfourPackage.GRID__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<Line>(Line.class, this, ConnectfourPackage.GRID__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getWinner() {
		if (winner != null && winner.eIsProxy()) {
			InternalEObject oldWinner = (InternalEObject)winner;
			winner = (Player)eResolveProxy(oldWinner);
			if (winner != oldWinner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectfourPackage.GRID__WINNER, oldWinner, winner));
			}
		}
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWinner(Player newWinner, NotificationChain msgs) {
		Player oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectfourPackage.GRID__WINNER, oldWinner, newWinner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(Player newWinner) {
		if (newWinner != winner) {
			NotificationChain msgs = null;
			if (winner != null)
				msgs = ((InternalEObject)winner).eInverseRemove(this, ConnectfourPackage.PLAYER__VICTORIES, Player.class, msgs);
			if (newWinner != null)
				msgs = ((InternalEObject)newWinner).eInverseAdd(this, ConnectfourPackage.PLAYER__VICTORIES, Player.class, msgs);
			msgs = basicSetWinner(newWinner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectfourPackage.GRID__WINNER, newWinner, newWinner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer1() {
		if (player1 != null && player1.eIsProxy()) {
			InternalEObject oldPlayer1 = (InternalEObject)player1;
			player1 = (Player)eResolveProxy(oldPlayer1);
			if (player1 != oldPlayer1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectfourPackage.GRID__PLAYER1, oldPlayer1, player1));
			}
		}
		return player1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer1() {
		return player1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer1(Player newPlayer1) {
		Player oldPlayer1 = player1;
		player1 = newPlayer1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectfourPackage.GRID__PLAYER1, oldPlayer1, player1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer2() {
		if (player2 != null && player2.eIsProxy()) {
			InternalEObject oldPlayer2 = (InternalEObject)player2;
			player2 = (Player)eResolveProxy(oldPlayer2);
			if (player2 != oldPlayer2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectfourPackage.GRID__PLAYER2, oldPlayer2, player2));
			}
		}
		return player2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer2() {
		return player2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer2(Player newPlayer2) {
		Player oldPlayer2 = player2;
		player2 = newPlayer2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectfourPackage.GRID__PLAYER2, oldPlayer2, player2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectfourPackage.GRID__WINNER:
				if (winner != null)
					msgs = ((InternalEObject)winner).eInverseRemove(this, ConnectfourPackage.PLAYER__VICTORIES, Player.class, msgs);
				return basicSetWinner((Player)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentEList<Cell>(Cell.class, this, ConnectfourPackage.GRID__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectfourPackage.GRID__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectfourPackage.GRID__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case ConnectfourPackage.GRID__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case ConnectfourPackage.GRID__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
			case ConnectfourPackage.GRID__WINNER:
				return basicSetWinner(null, msgs);
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
			case ConnectfourPackage.GRID__COLUMNS:
				return getColumns();
			case ConnectfourPackage.GRID__LINES:
				return getLines();
			case ConnectfourPackage.GRID__CELLS:
				return getCells();
			case ConnectfourPackage.GRID__TIME:
				return getTime();
			case ConnectfourPackage.GRID__WINNER:
				if (resolve) return getWinner();
				return basicGetWinner();
			case ConnectfourPackage.GRID__PLAYER1:
				if (resolve) return getPlayer1();
				return basicGetPlayer1();
			case ConnectfourPackage.GRID__PLAYER2:
				if (resolve) return getPlayer2();
				return basicGetPlayer2();
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
			case ConnectfourPackage.GRID__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case ConnectfourPackage.GRID__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case ConnectfourPackage.GRID__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
				return;
			case ConnectfourPackage.GRID__TIME:
				setTime((String)newValue);
				return;
			case ConnectfourPackage.GRID__WINNER:
				setWinner((Player)newValue);
				return;
			case ConnectfourPackage.GRID__PLAYER1:
				setPlayer1((Player)newValue);
				return;
			case ConnectfourPackage.GRID__PLAYER2:
				setPlayer2((Player)newValue);
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
			case ConnectfourPackage.GRID__COLUMNS:
				getColumns().clear();
				return;
			case ConnectfourPackage.GRID__LINES:
				getLines().clear();
				return;
			case ConnectfourPackage.GRID__CELLS:
				getCells().clear();
				return;
			case ConnectfourPackage.GRID__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ConnectfourPackage.GRID__WINNER:
				setWinner((Player)null);
				return;
			case ConnectfourPackage.GRID__PLAYER1:
				setPlayer1((Player)null);
				return;
			case ConnectfourPackage.GRID__PLAYER2:
				setPlayer2((Player)null);
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
			case ConnectfourPackage.GRID__COLUMNS:
				return columns != null && !columns.isEmpty();
			case ConnectfourPackage.GRID__LINES:
				return lines != null && !lines.isEmpty();
			case ConnectfourPackage.GRID__CELLS:
				return cells != null && !cells.isEmpty();
			case ConnectfourPackage.GRID__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ConnectfourPackage.GRID__WINNER:
				return winner != null;
			case ConnectfourPackage.GRID__PLAYER1:
				return player1 != null;
			case ConnectfourPackage.GRID__PLAYER2:
				return player2 != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //GridImpl
