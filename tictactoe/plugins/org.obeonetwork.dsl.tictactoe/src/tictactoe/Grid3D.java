/**
 */
package tictactoe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.Grid3D#getGrids <em>Grids</em>}</li>
 * </ul>
 *
 * @see tictactoe.TictactoePackage#getGrid3D()
 * @model
 * @generated
 */
public interface Grid3D extends EObject {
	/**
	 * Returns the value of the '<em><b>Grids</b></em>' containment reference list.
	 * The list contents are of type {@link tictactoe.Grid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids</em>' containment reference list.
	 * @see tictactoe.TictactoePackage#getGrid3D_Grids()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Grid> getGrids();

} // Grid3D
