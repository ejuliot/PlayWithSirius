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
	public void testGetWinner() {
		grid.getLines().get(2).getCells().get(6).setColor(Color.RED);
		grid.getLines().get(3).getCells().get(5).setColor(Color.RED);
		grid.getLines().get(4).getCells().get(4).setColor(Color.RED);
		grid.getLines().get(5).getCells().get(3).setColor(Color.RED);
		
		assertEquals(Color.RED, s.getWinner(grid));
		
	}

}
