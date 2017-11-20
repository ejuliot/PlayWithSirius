/**
 */
package org.obeonetwork.dsl.connectfour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Four</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.connectfour.ConnectFour#getGrids <em>Grids</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.ConnectFour#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getConnectFour()
 * @model
 * @generated
 */
public interface ConnectFour extends EObject {
	/**
	 * Returns the value of the '<em><b>Grids</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.connectfour.Grid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids</em>' containment reference list.
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getConnectFour_Grids()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grid> getGrids();

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.connectfour.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getConnectFour_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

} // ConnectFour
