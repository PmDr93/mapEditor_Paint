package org.pmdr;

import org.pmdr.cursor.Cursor;
import org.pmdr.cursor.CursorDirections;
import org.pmdr.eventcontrollers.Controls;
import org.pmdr.field.Cell;
import org.pmdr.field.Grid;
import org.pmdr.paintmemory.SaveAndLoad;

public class Paint {

    private Grid grid;
    private Cursor cursor;
    private Controls controls;
    private SaveAndLoad saveAndLoad;

    public Paint(int rows, int cols) {
        this.grid = new Grid(rows, cols);
        this.cursor = new Cursor(0, 0);
        this.controls = new Controls(this, cursor);
        this.saveAndLoad = new SaveAndLoad();
    }

    public void init() {
        controls.initControls();
    }


    //painting in black
    public void fillInBlack() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInBlack();
            cell.cellFilled();
        } else {
            System.out.println("cell already " + cell.toString());
        }


    }

    //erase a cell
    public void eraseCell() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted()) {

            cell.cellEmpty();
        } else {
            System.out.println("cell already " + cell.toString());
        }
    }

    //save the grid
    public void savePaint() {
        saveAndLoad.writeToFile(grid.toString());
    }

    //load the grid
    public void loadPaint() {
        grid.loadGrid(saveAndLoad.loadFromFile());
    }
}
