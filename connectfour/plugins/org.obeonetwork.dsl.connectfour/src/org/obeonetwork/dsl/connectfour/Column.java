/**
 */
package org.obeonetwork.dsl.connectfour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Column#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.connectfour.Cell}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.connectfour.Cell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getColumn_Cells()
	 * @see org.obeonetwork.dsl.connectfour.Cell#getColumn
	 * @model opposite="column" upper="6"
	 * @generated
	 */
	EList<Cell> getCells();

} // Column
