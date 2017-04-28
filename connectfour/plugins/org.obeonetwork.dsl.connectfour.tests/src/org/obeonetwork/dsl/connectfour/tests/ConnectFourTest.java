/**
 */
package org.obeonetwork.dsl.connectfour.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.obeonetwork.dsl.connectfour.ConnectFour;
import org.obeonetwork.dsl.connectfour.ConnectfourFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connect Four</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectFourTest extends TestCase {

	/**
	 * The fixture for this Connect Four test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectFour fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectFourTest.class);
	}

	/**
	 * Constructs a new Connect Four test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectFourTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Connect Four test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConnectFour fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Connect Four test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectFour getFixture() {
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
		setFixture(ConnectfourFactory.eINSTANCE.createConnectFour());
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

} //ConnectFourTest
