/**
 */
package org.obeonetwork.dsl.connectfour;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Player#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Player#getVictories <em>Victories</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.connectfour.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Victories</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.connectfour.Grid}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.connectfour.Grid#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victories</em>' reference list.
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getPlayer_Victories()
	 * @see org.obeonetwork.dsl.connectfour.Grid#getWinner
	 * @model opposite="winner"
	 * @generated
	 */
	EList<Grid> getVictories();

} // Player
