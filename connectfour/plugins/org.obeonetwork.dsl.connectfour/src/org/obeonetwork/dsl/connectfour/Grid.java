/**
 */
package org.obeonetwork.dsl.connectfour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Grid#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Grid#getLines <em>Lines</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Grid#getWinner <em>Winner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Grid#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.connectfour.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getGrid_Columns()
	 * @model containment="true" upper="7"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.connectfour.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getGrid_Lines()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' reference.
	 * @see #setWinner(Player)
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getGrid_Winner()
	 * @model
	 * @generated
	 */
	Player getWinner();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.connectfour.Grid#getWinner <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' reference.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Player value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.connectfour.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getGrid_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cell> getCells();

} // Grid
