/**
 */
package tictactoe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.Line#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see tictactoe.TictactoePackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link tictactoe.Cell}.
	 * It is bidirectional and its opposite is '{@link tictactoe.Cell#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see tictactoe.TictactoePackage#getLine_Cells()
	 * @see tictactoe.Cell#getLine
	 * @model opposite="line" upper="2"
	 * @generated
	 */
	EList<Cell> getCells();

} // Line
