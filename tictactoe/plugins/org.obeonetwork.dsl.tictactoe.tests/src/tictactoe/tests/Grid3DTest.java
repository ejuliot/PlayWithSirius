/**
 */
package tictactoe.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tictactoe.Grid3D;
import tictactoe.TictactoeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grid3 D</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Grid3DTest extends TestCase {

	/**
	 * The fixture for this Grid3 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grid3D fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Grid3DTest.class);
	}

	/**
	 * Constructs a new Grid3 D test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid3DTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Grid3 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Grid3D fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Grid3 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grid3D getFixture() {
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
		setFixture(TictactoeFactory.eINSTANCE.createGrid3D());
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

} //Grid3DTest
