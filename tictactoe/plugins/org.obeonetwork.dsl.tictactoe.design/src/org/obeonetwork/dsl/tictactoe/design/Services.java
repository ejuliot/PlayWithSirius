package org.obeonetwork.dsl.tictactoe.design;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import tictactoe.Cell;
import tictactoe.Column;
import tictactoe.Grid;
import tictactoe.Grid3D;
import tictactoe.Line;
import tictactoe.Mark;
import tictactoe.TicTacToe;
import tictactoe.TictactoeFactory;

/**
 * The services class used by VSM.
 */
public class Services {
    
	/**
	 * Creation of an empty 3D grid (based on upper bound of domain domain)
	 */
	public void createGrid3D(TicTacToe game) {		
		Grid3D grid3D = TictactoeFactory.eINSTANCE.createGrid3D();
		for (int i = 0; i <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid3D_Grids().getUpperBound(); i++) {
			createGrid(grid3D);
		}
		
		game.getGrids3d().add(grid3D);
	}	
	/**
	 * Creation of an empty grid 3 columns X 3 lines (based on upper bound of domain domain)
	 * Columns	0 1 2			
	 * Line 0   . . .
	 * Line 1   . . .
	 * Line 2   . . .
	 */
	public void createGrid(Grid3D grid3D) {
		Grid grid = TictactoeFactory.eINSTANCE.createGrid();
		
		for (int i = 0; i <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Columns().getUpperBound(); i++) {
			Column col = TictactoeFactory.eINSTANCE.createColumn();
			grid.getColumns().add(col);
		}
		for (int i = 0; i <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Lines().getUpperBound(); i++) {
			Line line = TictactoeFactory.eINSTANCE.createLine();
			grid.getLines().add(line);
			
			for (Column col : grid.getColumns()) {
				Cell cell = TictactoeFactory.eINSTANCE.createCell();
				grid.getCells().add(cell);
				cell.setLine(line);
				cell.setColumn(col);
			}
		}
		grid3D.getGrids().add(grid);
		
	}
	
	public EObject deb(EObject cell) {
		System.out.println(cell);
		return cell;
	}
	
	public Mark getWinner(Grid grid) {
		List<Cell> winnersCell = getWinnerCells(grid);
		if (winnersCell != null)
			return winnersCell.get(0).getMark();						
		else
			return Mark.NONE;
	}
	

	public boolean isAWinnerCell(Cell cell) {
		List<Cell> winnerCells = getWinnerCells((Grid)cell.eContainer());
		if (winnerCells == null) 
			return false;
		else
			return winnerCells.contains(cell);
	}
	
	public boolean isAWinnerCellFor3D(Cell cell) {
		List<Cell> winnerCells = getWinnerCells((Grid3D)(cell.eContainer().eContainer()));
		if (winnerCells == null) 
			return false;
		else
			return winnerCells.contains(cell);
	}
	
	public List<Cell> getWinnerCells(Grid3D grid3D) {
		// check each grid
		for (Grid grid : grid3D.getGrids()) {
			List<Cell> winnerCells = getWinnerCells(grid);
			if (winnerCells != null)
				return winnerCells;
		}
		

		/*
		 * check vertical such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   X . .	X . .	X . .
		 * Line 1   . . .   . . .   . . .
		 * Line 2   . . .   . . .   . . . 
		 */
		for(int l = 0 ; l <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Lines().getUpperBound(); l++) {
			for(int c = 0 ; c <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Columns().getUpperBound(); c++) {
				List<Cell> winnerCells = new ArrayList<>();
				for (Grid grid : grid3D.getGrids()) {
					winnerCells.add(grid.getLines().get(l).getCells().get(c));
				}
				if (isWinnerCells(winnerCells))
					return winnerCells;
				
			}
		}
		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   X . .	. X .	. . X
		 * Line 1   . . .   . . .   . . .
		 * Line 2   . . .   . . .   . . . 
		 */
		for(int l = 0 ; l <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Lines().getUpperBound(); l++) {
			int c = 0 ; 
			List<Cell> winnerCells = new ArrayList<>();
			for (Grid grid : grid3D.getGrids()) {
				winnerCells.add(grid.getLines().get(l).getCells().get(c));
				c++;
			}
			if (isWinnerCells(winnerCells))
				return winnerCells;
		}
		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   . . X	. X .	X . .
		 * Line 1   . . .   . . .   . . .
		 * Line 2   . . .   . . .   . . . 
		 */
		for(int l = 0 ; l <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Lines().getUpperBound(); l++) {
			int c = TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Columns().getUpperBound(); 
			List<Cell> winnerCells = new ArrayList<>();
			for (Grid grid : grid3D.getGrids()) {
				winnerCells.add(grid.getLines().get(l).getCells().get(c));
				c--;
			}
			if (isWinnerCells(winnerCells))
				return winnerCells;
		}
		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   X . .	. . .	. . .
		 * Line 1   . . .   X . .   . . .
		 * Line 2   . . .   . . .   X . . 
		 */
		for(int c = 0 ; c <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Columns().getUpperBound(); c++) {
			int l = 0 ; 
			List<Cell> winnerCells = new ArrayList<>();
			for (Grid grid : grid3D.getGrids()) {
				winnerCells.add(grid.getLines().get(l).getCells().get(c));
				l++;
			}
			if (isWinnerCells(winnerCells))
				return winnerCells;
		}
		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   . . .	. . .	X . .
		 * Line 1   . . .   X . .   . . .
		 * Line 2   X . .   . . .   . . . 
		 */
		for(int c = 0 ; c <= TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Columns().getUpperBound(); c++) {
			int l = TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Lines().getUpperBound(); 
			List<Cell> winnerCells = new ArrayList<>();
			for (Grid grid : grid3D.getGrids()) {
				winnerCells.add(grid.getLines().get(l).getCells().get(c));
				l--;
			}
			if (isWinnerCells(winnerCells))
				return winnerCells;
		}
		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   X . .	. . .	. . .
		 * Line 1   . . .   . X .   . . .
		 * Line 2   . . .   . . .   . . X 
		 */
		int c = 0 ;
		int l = 0;
		List<Cell> winnerCells = new ArrayList<>();
		for (Grid grid : grid3D.getGrids()) {
			winnerCells.add(grid.getLines().get(l).getCells().get(c));
			l++;
			c++;
		}
		if (isWinnerCells(winnerCells))
			return winnerCells;
		
		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   . . .	. . .	. . X
		 * Line 1   . . .   . X .   . . .
		 * Line 2   X . .   . . .   . . . 
		 */
		c = 0;
		l = TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Lines().getUpperBound(); 
		winnerCells = new ArrayList<>();
		for (Grid grid : grid3D.getGrids()) {
			winnerCells.add(grid.getLines().get(l).getCells().get(c));
			l--;
			c++;
		}
		if (isWinnerCells(winnerCells))
			return winnerCells;
		
		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   . . .	. . .	X . .
		 * Line 1   . . .   . X .   . . .
		 * Line 2   . . X   . . .   . . . 
		 */
		c = TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Columns().getUpperBound(); 
		l = TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Lines().getUpperBound(); 
		winnerCells = new ArrayList<>();
		for (Grid grid : grid3D.getGrids()) {
			winnerCells.add(grid.getLines().get(l).getCells().get(c));
			l--;
			c--;
		}
		if (isWinnerCells(winnerCells))
			return winnerCells;

		
		/*
		 * check diag such as :
		 * Columns	0 1 2	0 1 2	0 1 2
		 * Line 0   . . X	. . .	. . .
		 * Line 1   . . .   . X .   . . .
		 * Line 2   . . .   . . .   X . . 
		 */
		c = TictactoeFactory.eINSTANCE.getTictactoePackage().getGrid_Columns().getUpperBound(); 
		l = 0; 
		winnerCells = new ArrayList<>();
		for (Grid grid : grid3D.getGrids()) {
			winnerCells.add(grid.getLines().get(l).getCells().get(c));
			l++;
			c--;
		}
		if (isWinnerCells(winnerCells))
			return winnerCells;
		
		
		return null;
	}
	
	public List<Cell> getWinnerCells(Grid grid) {
		
		/*
		 * check lines such as :
		 * Columns	0 1 2  			
		 * Line 0   X X X 
		 * Line 1   . . . 
		 * Line 2   . . . 
		 */
		for (Iterator<Line> iterator = grid.getLines().iterator(); iterator.hasNext();) {
			Line line = iterator.next();
			if (isWinnerCells(line.getCells()))
				return line.getCells();
		}
		

		/*
		 * check column such as :
		 * Columns	0 1 2  			
		 * Line 0   X . . 
		 * Line 1   X . . 
		 * Line 2   X . . 
		 */
		for (Iterator<Column> iterator = grid.getColumns().iterator(); iterator.hasNext();) {
			Column col = iterator.next();
			if (isWinnerCells(col.getCells()))
				return col.getCells();
		}
		
		/*
		 * check diag such as :
		 * Columns	0 1 2  			
		 * Line 0   X . . 
		 * Line 1   . X . 
		 * Line 2   . . X 
		 */
		List<Cell> diag = new ArrayList<>();
		
		for (int i = 0; i < grid.getLines().size(); i++) {
			Cell cell = grid.getLines().get(i).getCells().get(i);
			diag.add(cell);			
		}
		if (isWinnerCells(diag)) return diag;
		
		/*
		 * check diag such as :
		 * Columns	0 1 2  			
		 * Line 0   . . X 
		 * Line 1   . X . 
		 * Line 2   X . . 
		 */
		diag.clear();
		
		for (int i = grid.getLines().size() - 1; i >= 0; i--) {
			Cell cell = grid.getLines().get(i).getCells().get(i);
			diag.add(cell);			
		}
		if (isWinnerCells(diag)) return diag;
		
		return null;
		
	
	}
	
	
	private boolean isWinnerCells(List<Cell> cells) {
		Mark firstMark = cells.get(0).getMark();
		if (firstMark == TictactoeFactory.eINSTANCE.getTictactoePackage().getMark().getDefaultValue()) // None
			return false;
		
		for (Cell cell : cells) {
			if (cell.getMark() != firstMark)
				return false;			
		}
		return true;
	}

	public String now(Grid3D grid) {
		return LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
	}
	
	

}
