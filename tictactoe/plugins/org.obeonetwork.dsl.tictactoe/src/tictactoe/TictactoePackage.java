/**
 */
package tictactoe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tictactoe.TictactoeFactory
 * @model kind="package"
 * @generated
 */
public interface TictactoePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tictactoe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/tictactoe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tictactoe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TictactoePackage eINSTANCE = tictactoe.impl.TictactoePackageImpl.init();

	/**
	 * The meta object id for the '{@link tictactoe.impl.TicTacToeImpl <em>Tic Tac Toe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.TicTacToeImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getTicTacToe()
	 * @generated
	 */
	int TIC_TAC_TOE = 0;

	/**
	 * The feature id for the '<em><b>Grids3d</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIC_TAC_TOE__GRIDS3D = 0;

	/**
	 * The number of structural features of the '<em>Tic Tac Toe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIC_TAC_TOE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tic Tac Toe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIC_TAC_TOE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.ColumnImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.GridImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__LINES = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__CELLS = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.LineImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.CellImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getCell()
	 * @generated
	 */
	int CELL = 4;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__LINE = 1;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__MARK = 2;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.Grid3DImpl <em>Grid3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.Grid3DImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getGrid3D()
	 * @generated
	 */
	int GRID3_D = 5;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID3_D__GRIDS = 0;

	/**
	 * The number of structural features of the '<em>Grid3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID3_D_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Grid3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID3_D_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.Mark <em>Mark</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.Mark
	 * @see tictactoe.impl.TictactoePackageImpl#getMark()
	 * @generated
	 */
	int MARK = 6;


	/**
	 * Returns the meta object for class '{@link tictactoe.TicTacToe <em>Tic Tac Toe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tic Tac Toe</em>'.
	 * @see tictactoe.TicTacToe
	 * @generated
	 */
	EClass getTicTacToe();

	/**
	 * Returns the meta object for the containment reference list '{@link tictactoe.TicTacToe#getGrids3d <em>Grids3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grids3d</em>'.
	 * @see tictactoe.TicTacToe#getGrids3d()
	 * @see #getTicTacToe()
	 * @generated
	 */
	EReference getTicTacToe_Grids3d();

	/**
	 * Returns the meta object for class '{@link tictactoe.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see tictactoe.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference list '{@link tictactoe.Column#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see tictactoe.Column#getCells()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Cells();

	/**
	 * Returns the meta object for class '{@link tictactoe.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see tictactoe.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link tictactoe.Grid#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see tictactoe.Grid#getColumns()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link tictactoe.Grid#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see tictactoe.Grid#getLines()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Lines();

	/**
	 * Returns the meta object for the containment reference list '{@link tictactoe.Grid#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see tictactoe.Grid#getCells()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Cells();

	/**
	 * Returns the meta object for class '{@link tictactoe.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see tictactoe.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference list '{@link tictactoe.Line#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see tictactoe.Line#getCells()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Cells();

	/**
	 * Returns the meta object for class '{@link tictactoe.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see tictactoe.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Cell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see tictactoe.Cell#getColumn()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Column();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Cell#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see tictactoe.Cell#getLine()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Line();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Cell#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark</em>'.
	 * @see tictactoe.Cell#getMark()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Mark();

	/**
	 * Returns the meta object for class '{@link tictactoe.Grid3D <em>Grid3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid3 D</em>'.
	 * @see tictactoe.Grid3D
	 * @generated
	 */
	EClass getGrid3D();

	/**
	 * Returns the meta object for the containment reference list '{@link tictactoe.Grid3D#getGrids <em>Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grids</em>'.
	 * @see tictactoe.Grid3D#getGrids()
	 * @see #getGrid3D()
	 * @generated
	 */
	EReference getGrid3D_Grids();

	/**
	 * Returns the meta object for enum '{@link tictactoe.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mark</em>'.
	 * @see tictactoe.Mark
	 * @generated
	 */
	EEnum getMark();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TictactoeFactory getTictactoeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tictactoe.impl.TicTacToeImpl <em>Tic Tac Toe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.TicTacToeImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getTicTacToe()
		 * @generated
		 */
		EClass TIC_TAC_TOE = eINSTANCE.getTicTacToe();

		/**
		 * The meta object literal for the '<em><b>Grids3d</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIC_TAC_TOE__GRIDS3D = eINSTANCE.getTicTacToe_Grids3d();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.ColumnImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CELLS = eINSTANCE.getColumn_Cells();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.GridImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__COLUMNS = eINSTANCE.getGrid_Columns();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__LINES = eINSTANCE.getGrid_Lines();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__CELLS = eINSTANCE.getGrid_Cells();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.LineImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CELLS = eINSTANCE.getLine_Cells();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.CellImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__COLUMN = eINSTANCE.getCell_Column();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__LINE = eINSTANCE.getCell_Line();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__MARK = eINSTANCE.getCell_Mark();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.Grid3DImpl <em>Grid3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.Grid3DImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getGrid3D()
		 * @generated
		 */
		EClass GRID3_D = eINSTANCE.getGrid3D();

		/**
		 * The meta object literal for the '<em><b>Grids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID3_D__GRIDS = eINSTANCE.getGrid3D_Grids();

		/**
		 * The meta object literal for the '{@link tictactoe.Mark <em>Mark</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.Mark
		 * @see tictactoe.impl.TictactoePackageImpl#getMark()
		 * @generated
		 */
		EEnum MARK = eINSTANCE.getMark();

	}

} //TictactoePackage
