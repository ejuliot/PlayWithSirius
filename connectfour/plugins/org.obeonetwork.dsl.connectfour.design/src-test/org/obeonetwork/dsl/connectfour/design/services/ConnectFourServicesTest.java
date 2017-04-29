package org.obeonetwork.dsl.connectfour.design.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.obeonetwork.dsl.connectfour.Color;
import org.obeonetwork.dsl.connectfour.ConnectFour;
import org.obeonetwork.dsl.connectfour.ConnectfourFactory;
import org.obeonetwork.dsl.connectfour.Grid;

public class ConnectFourServicesTest {

	private ConnectFour cf;
	private Grid grid;
	private ConnectFourServices s;
	
	@Before
	public void setUp() throws Exception {
		s = new ConnectFourServices();
		cf = ConnectfourFactory.eINSTANCE.createConnectFour();
		s.createGrid(cf);
		grid = cf.getGrids().get(0);
	}

	@Test
	/**
	 * Test diagonal
	 * Columns	0 1 2 3 4 5 6 7			
	 * Line 0   . . . . . . . .
	 * Line 1   . . . . . . . .
	 * Line 2   . . . . . . . .
	 * Line 3   . . . . . . X .
	 * Line 4   . . . . . X . .
	 * Line 5   . . . . X . . .
	 * Line 6   . . . X . . . .
	 */
	
	public void testGetWinnerDiagInverse() {
		grid.getLines().get(3).getCells().get(6).setColor(Color.RED);
		grid.getLines().get(4).getCells().get(5).setColor(Color.RED);
		grid.getLines().get(5).getCells().get(4).setColor(Color.RED);
		grid.getLines().get(6).getCells().get(3).setColor(Color.RED);
		
		assertEquals(Color.RED, s.getWinner(grid));
	}

	@Test
	/**
	 * Test with no winner
	 * Columns	0 1 2 3 4 5 6 7			
	 * Line 0   . . . . . . . .
	 * Line 1   . . . . . . . .
	 * Line 2   . . . . . . . .
	 * Line 3   . . . . . . . .
	 * Line 4   . . . . . . . .
	 * Line 5   . . . . . . . .
	 * Line 6   . . . . . . . .
	 */
	
	public void testGetWinnerNoWinner() {
		assertEquals(Color.NONE, s.getWinner(grid));
		
	}

	@Test
	/**
	 * Test diagonal
	 * Columns	0 1 2 3 4 5 6 7			
	 * Line 0  (X)X X X . . . .
	 * Line 1   . . . . . . . .
	 * Line 2   . . . . . . . .
	 * Line 3   . . . . . . . .
	 * Line 4   . . . . . . . .
	 * Line 5   . . . . . . . .
	 * Line 6   . . . . . . . .
	 */
	public void testIsAWinnerCellTrue() {
		grid.getLines().get(0).getCells().get(0).setColor(Color.RED);
		grid.getLines().get(0).getCells().get(1).setColor(Color.RED);
		grid.getLines().get(0).getCells().get(2).setColor(Color.RED);
		grid.getLines().get(0).getCells().get(3).setColor(Color.RED);
		
		assertEquals(true, s.isAWinnerCell(grid.getLines().get(0).getCells().get(0)));		
	}

	@Test
	/**
	 * Test diagonal
	 * Columns	0 1 2 3 4 5 6 7			
	 * Line 0   X X X X . . . .
	 * Line 1  (.). . . . . . .
	 * Line 2   . . . . . . . .
	 * Line 3   . . . . . . . .
	 * Line 4   . . . . . . . .
	 * Line 5   . . . . . . . .
	 * Line 6   . . . . . . . .
	 */
	public void testIsAWinnerCellFalse() {
		grid.getLines().get(0).getCells().get(0).setColor(Color.RED);
		grid.getLines().get(0).getCells().get(1).setColor(Color.RED);
		grid.getLines().get(0).getCells().get(2).setColor(Color.RED);
		grid.getLines().get(0).getCells().get(3).setColor(Color.RED);
		
		assertEquals(false, s.isAWinnerCell(grid.getLines().get(1).getCells().get(0)));		
	}

	@Test
	/**
	 * Test diagonal
	 * Columns	0 1 2 3 4 5 6 7			
	 * Line 0   . . . . . . . .
	 * Line 1  (.). . . . . . .
	 * Line 2   . . . . . . . .
	 * Line 3   . . . . . . . .
	 * Line 4   . . . . . . . .
	 * Line 5   . . . . . . . .
	 * Line 6   . . . . . . . .
	 */
	public void testIsAWinnerCellFalseWithoutWInner() {		
		assertEquals(false, s.isAWinnerCell(grid.getLines().get(1).getCells().get(0)));		
	}
}
