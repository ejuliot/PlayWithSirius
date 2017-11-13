/**
 */
package tictactoe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tic Tac Toe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.TicTacToe#getGrids3d <em>Grids3d</em>}</li>
 * </ul>
 *
 * @see tictactoe.TictactoePackage#getTicTacToe()
 * @model
 * @generated
 */
public interface TicTacToe extends EObject {
	/**
	 * Returns the value of the '<em><b>Grids3d</b></em>' containment reference list.
	 * The list contents are of type {@link tictactoe.Grid3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids3d</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids3d</em>' containment reference list.
	 * @see tictactoe.TictactoePackage#getTicTacToe_Grids3d()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grid3D> getGrids3d();

} // TicTacToe
