/**
 */
package tictactoe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.Cell#getColumn <em>Column</em>}</li>
 *   <li>{@link tictactoe.Cell#getLine <em>Line</em>}</li>
 *   <li>{@link tictactoe.Cell#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @see tictactoe.TictactoePackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tictactoe.Column#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see tictactoe.TictactoePackage#getCell_Column()
	 * @see tictactoe.Column#getCells
	 * @model opposite="cells"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link tictactoe.Cell#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tictactoe.Line#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference.
	 * @see #setLine(Line)
	 * @see tictactoe.TictactoePackage#getCell_Line()
	 * @see tictactoe.Line#getCells
	 * @model opposite="cells"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link tictactoe.Cell#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' attribute.
	 * The literals are from the enumeration {@link tictactoe.Mark}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' attribute.
	 * @see tictactoe.Mark
	 * @see #setMark(Mark)
	 * @see tictactoe.TictactoePackage#getCell_Mark()
	 * @model
	 * @generated
	 */
	Mark getMark();

	/**
	 * Sets the value of the '{@link tictactoe.Cell#getMark <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' attribute.
	 * @see tictactoe.Mark
	 * @see #getMark()
	 * @generated
	 */
	void setMark(Mark value);

} // Cell
