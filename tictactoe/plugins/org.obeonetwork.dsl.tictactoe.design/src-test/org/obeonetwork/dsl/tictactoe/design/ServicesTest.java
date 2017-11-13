package org.obeonetwork.dsl.tictactoe.design;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tictactoe.Grid3D;
import tictactoe.Mark;
import tictactoe.TicTacToe;
import tictactoe.TictactoeFactory;

public class ServicesTest {
	
	private Services s;
	private TicTacToe tic;
	private Grid3D grid3D;

	@Before
	public void setUp() throws Exception {
		s = new Services();
		tic = TictactoeFactory.eINSTANCE.createTicTacToe();
		s.createGrid3D(tic);
		grid3D = tic.getGrids3d().get(0);
	}

	@Test
	public void testIsAWinnerCellFor3DNoWinner() {
		grid3D.getGrids().get(0).getLines().get(0).getCells().get(0).setMark(Mark.CROSS);
		
		assertNull(s.getWinnerCells(grid3D) );
	}

	@Test
	public void testGetWinnerCellsGrid3D() {
		
	}

}
