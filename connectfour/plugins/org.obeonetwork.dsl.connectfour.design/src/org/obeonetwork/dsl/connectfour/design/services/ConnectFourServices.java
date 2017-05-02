package org.obeonetwork.dsl.connectfour.design.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.obeonetwork.dsl.connectfour.Cell;
import org.obeonetwork.dsl.connectfour.Color;
import org.obeonetwork.dsl.connectfour.Column;
import org.obeonetwork.dsl.connectfour.ConnectFour;
import org.obeonetwork.dsl.connectfour.ConnectfourFactory;
import org.obeonetwork.dsl.connectfour.Grid;
import org.obeonetwork.dsl.connectfour.Line;

public class ConnectFourServices {

	/**
	 * Creation of an empty grid 7 columns X 6 lines (based on upper bound of domain domain)
	 * Columns	0 1 2 3 4 5 6			
	 * Line 0   . . . . . . .
	 * Line 1   . . . . . . .
	 * Line 2   . . . . . . .
	 * Line 3   . . . . . . .
	 * Line 4   . . . . . . .
	 * Line 5   . . . . . . .
	 */
	public void createGrid(ConnectFour game) {
		Grid grid = ConnectfourFactory.eINSTANCE.createGrid();
		for (int i = 0; i < ConnectfourFactory.eINSTANCE.getConnectfourPackage().getGrid_Columns().getUpperBound(); i++) {
			Column col = ConnectfourFactory.eINSTANCE.createColumn();
			grid.getColumns().add(col);
		}
		for (int i = 0; i < ConnectfourFactory.eINSTANCE.getConnectfourPackage().getGrid_Lines().getUpperBound(); i++) {
			Line line = ConnectfourFactory.eINSTANCE.createLine();
			grid.getLines().add(line);
			
			for (Column col : grid.getColumns()) {
				Cell cell = ConnectfourFactory.eINSTANCE.createCell();
				grid.getCells().add(cell);
				cell.setLine(line);
				cell.setColumn(col);
			}
		}
		game.getGrids().add(grid);
		
	}
	
	public String now(Grid grid) {
		return LocalDateTime.now().toString();
	}
	
	public Color getWinner(Grid grid) {
		List<Cell> winnersCell = getWinnerCells(grid);
		if (winnersCell != null)
			return winnersCell.get(0).getColor();						
		else
			return Color.NONE;
	}
	

	public boolean isAWinnerCell(Cell cell) {
		List<Cell> winnerCells = getWinnerCells((Grid)cell.eContainer());
		if (winnerCells == null) 
			return false;
		else
			return winnerCells.contains(cell);
	}
	
	public List<Cell> getWinnerCells(Grid grid) {
		List<Cell> winnersCell = null;
		
		/*
		 * check lines such as :
		 * Columns	0 1 2 3 4 5 6 			
		 * Line 0   . . . . . . . 
		 * Line 1   . . . . . . . 
		 * Line 2   . . . . . . . 
		 * Line 3   . . . . . . . 
		 * Line 4   . . . . . . . 
		 * Line 5   X X X X . . . 
		 */
		for (Iterator<Line> iterator = grid.getLines().iterator(); 
				iterator.hasNext() && winnersCell == null;) {
			Line line = iterator.next();
			winnersCell = getWinnerCells(line.getCells());
		}
		
		/*
		 * check columns such as :
		 * Columns	0 1 2 3 4 5 6 			
		 * Line 0   . . . . . . . 
		 * Line 1   . . . . . . . 
		 * Line 2   X . . . . . . 
		 * Line 3   X . . . . . . 
		 * Line 4   X . . . . . . 
		 * Line 5   X . . . . . . 
		 */
		if (winnersCell == null) {
			for (Iterator<Column> iterator = grid.getColumns().iterator(); 
					iterator.hasNext() && winnersCell == null;) {
				Column col = iterator.next();
				winnersCell = getWinnerCells(col.getCells());
			}
		}		
		
		/*
		 * check diagonal top left to bottom right such as :
		 * Columns	0 1 2 3 4 5 6 			
		 * Line 0   . . . . . . . 
		 * Line 1   . . . . . . . 
		 * Line 2   X . . . . . . 
		 * Line 3   . X . . . . . 
		 * Line 4   . . X . . . . 
		 * Line 5   . . . X . . . 
		 */
		// Bottom left. don't need to start too low
		for (int l = grid.getLines().size()-4 ; l >= 0  && winnersCell == null; l--)
			winnersCell = getWinnerCellsForDiagonal(grid, 0, l, true);
	
		// up right.
		for (int c = 0 ; c < grid.getColumns().size() - 4  && winnersCell == null; c++)
			winnersCell = getWinnerCellsForDiagonal(grid, c, 0, true);
		
		/*
		 * check diagonal top right to bottom left such as :
		 * Columns	0 1 2 3 4 5 6 			
		 * Line 0   . . . . . . . 
		 * Line 1   . . . . . . . 
		 * Line 2   . . . . X . . 
		 * Line 3   . . . X . . . 
		 * Line 4   . . X . . . . 
		 * Line 5   . X . . . . . 
		 */
		// bottom right
		for (int l = grid.getLines().size()-4 ; l >= 0 && winnersCell == null; l--) 
			winnersCell = getWinnerCellsForDiagonal(grid, grid.getColumns().size() -1, l, false);
		// up left
		for (int c = grid.getColumns().size() - 1; c >= 4 && winnersCell == null ; c--)
			winnersCell = getWinnerCellsForDiagonal(grid, c, 0, false);
		
			
		return winnersCell;
	}
	
	
	private List<Cell> getWinnerCells(List<Cell> cells) {
		Color previousColor = Color.NONE;
		List<Cell> winnersCell = new ArrayList<Cell>();
		int nbConsecutiveColor = 0;
		
		for (Cell cell : cells) {
			if (cell.getColor() == previousColor) {
				nbConsecutiveColor++;
				winnersCell.add(cell);
				if (nbConsecutiveColor == 4 && previousColor != Color.NONE)
					return winnersCell;
			} else {					
				previousColor = cell.getColor();
				winnersCell.clear();
				winnersCell.add(cell);
				nbConsecutiveColor = 1;
			}
		}
		return null;
	}
	
	/**
	 * Check winner in one diagonal
	 * @param grid
	 * @param iCol start column
	 * @param iLine start line
	 * @param isTopLeftToBottomRight direction
	 * @return list of winning cells or null
	 */
	private List<Cell> getWinnerCellsForDiagonal(Grid grid, int iCol, int iLine, boolean isTopLeftToBottomRight) {
		List<Cell> winnersCell = new ArrayList<Cell>();
		int l = iLine;
		Color previousColor = Color.NONE;
		int nbConsecutiveColor = 0;
		
		
		
		if (isTopLeftToBottomRight) {
			for (int c = iCol; c < iCol + 4; c++) {
				Column col = grid.getColumns().get(c);
				
				Cell cell = col.getCells().get(l);
				if (cell.getColor() == previousColor) {
					nbConsecutiveColor++;
					winnersCell.add(cell);
					if (nbConsecutiveColor == 4 && previousColor != Color.NONE)
						return winnersCell;
				} else {					
					previousColor = cell.getColor();
					winnersCell.clear();
					winnersCell.add(cell);
					nbConsecutiveColor = 1;
				}
				l++; // increment line
			}
		} else {
			for (int c = iCol; c > iCol - 4; c--) {
				Column col = grid.getColumns().get(c); 
				
				Cell cell = col.getCells().get(l);
				if (cell.getColor() == previousColor) {
					nbConsecutiveColor++;
					winnersCell.add(cell);
					if (nbConsecutiveColor == 4 && previousColor != Color.NONE)
						return winnersCell;
				} else {					
					previousColor = cell.getColor();
					winnersCell.clear();
					winnersCell.add(cell);
					nbConsecutiveColor = 1;
				}
				l++; // increment line
			}
		}
		return null;
	}

}
