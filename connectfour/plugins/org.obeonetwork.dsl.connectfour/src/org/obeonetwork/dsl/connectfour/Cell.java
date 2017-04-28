/**
 */
package org.obeonetwork.dsl.connectfour;

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
 *   <li>{@link org.obeonetwork.dsl.connectfour.Cell#getColumn <em>Column</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Cell#getLine <em>Line</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.connectfour.Cell#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.connectfour.Column#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getCell_Column()
	 * @see org.obeonetwork.dsl.connectfour.Column#getCells
	 * @model opposite="cells"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.connectfour.Cell#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.connectfour.Line#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference.
	 * @see #setLine(Line)
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getCell_Line()
	 * @see org.obeonetwork.dsl.connectfour.Line#getCells
	 * @model opposite="cells"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.connectfour.Cell#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.connectfour.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.obeonetwork.dsl.connectfour.Color
	 * @see #setColor(Color)
	 * @see org.obeonetwork.dsl.connectfour.ConnectfourPackage#getCell_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.connectfour.Cell#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.obeonetwork.dsl.connectfour.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Cell
