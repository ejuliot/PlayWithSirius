package org.obeonetwork.dsl.connectfour.design.services;

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
	
	public Color getWinner(Grid grid) {
		List<Cell> winnersCell = getWinnerCells(grid);
		if (winnersCell != null)
			return winnersCell.get(0).getColor();						
		else
			return Color.NONE;
	}
	

	
	public boolean isAWinnerCell(Cell cell) {
		return getWinnerCells((Grid)cell.eContainer()).contains(cell);
	}
	
	public List<Cell> getWinnerCells(Grid grid) {
		List<Cell> winnersCell = null;
		
		// check lines
		for (Iterator<Line> iterator = grid.getLines().iterator(); 
				iterator.hasNext() && winnersCell == null;) {
			Line line = iterator.next();
			winnersCell = getWinnerCells(line.getCells());
		}
		
		// check columns
		if (winnersCell == null) {
			for (Iterator<Column> iterator = grid.getColumns().iterator(); 
					iterator.hasNext() && winnersCell == null;) {
				Column col = iterator.next();
				winnersCell = getWinnerCells(col.getCells());
			}
		}		
		
		// check diagonal top left to bottom right
		if (winnersCell == null) 
			for (int l = grid.getLines().size()-4 ; l > 0 ; l--)
				winnersCell = getWinnerCellsForDiagonal(grid, 0, l, true);
		if (winnersCell == null) 
			for (int c = 0 ; c < grid.getColumns().size() - 4  ; c++)
				winnersCell = getWinnerCellsForDiagonal(grid, c, 0, true);
			
		// check diagonal top right to bottom left
		if (winnersCell == null) 
			for (int l = grid.getLines().size()-4 ; l > 0 && winnersCell != null; l--) {
				//winnersCell = getWinnerCellsForDiagonal(grid, grid.getColumns().size(), l, false);
				for (int c = grid.getColumns().size() ; c >= 4 ; c--)
					winnersCell = getWinnerCellsForDiagonal(grid, c, l, false);
			}
				
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
				Column col = grid.getColumns().get(c); // TODO c -1 ?
				
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
