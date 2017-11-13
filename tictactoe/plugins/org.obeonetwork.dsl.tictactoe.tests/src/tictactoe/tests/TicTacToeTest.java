/**
 */
package tictactoe.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tictactoe.TicTacToe;
import tictactoe.TictactoeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tic Tac Toe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TicTacToeTest extends TestCase {

	/**
	 * The fixture for this Tic Tac Toe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicTacToe fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TicTacToeTest.class);
	}

	/**
	 * Constructs a new Tic Tac Toe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicTacToeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tic Tac Toe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TicTacToe fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tic Tac Toe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicTacToe getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TictactoeFactory.eINSTANCE.createTicTacToe());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TicTacToeTest
