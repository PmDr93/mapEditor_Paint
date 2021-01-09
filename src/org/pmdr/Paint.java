package org.pmdr;

import org.pmdr.cursor.Cursor;
import org.pmdr.eventcontrollers.Controls;
import org.pmdr.field.Cell;
import org.pmdr.field.Grid;
import org.pmdr.field.InformationPositions;
import org.pmdr.paintmemory.SaveAndLoad;

public class Paint {

    private final Grid grid;
    private final Cursor cursor;
    private final Controls controls;
    private final SaveAndLoad saveAndLoad;
    InformationPositions informationPositions;

    public Paint(int rows, int cols) {
        this.grid = new Grid(rows, cols);
        this.cursor = new Cursor(0, 0);
        this.controls = new Controls(this, cursor);
        this.saveAndLoad = new SaveAndLoad();
        informationPositions = new InformationPositions(cols);
    }

    public void init() {
        controls.initControls();
        informationPositions.init();
    }


    //painting in black
    public void fillInBlack() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInBlack();
        } else {
            System.out.println("cell already fill in black");
        }
    }

    //painting in blue
    public void fillInBlue() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInBlue();
        } else {
            System.out.println("cell already fill in blue");
        }
    }

    //painting in Yellow
    public void fillInYellow() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInYellow();
        } else {
            System.out.println("cell already fill in yellow");
        }
    }

    //painting in Red
    public void fillInRed() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInRed();
        } else {
            System.out.println("cell already fill in red");
        }
    }

    //painting in Orange
    public void fillInOrange() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInOrange();
        } else {
            System.out.println("cell already fill in orange");
        }
    }

    //painting in Pink
    public void fillInPink() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInPink();
        } else {
            System.out.println("cell already fill in pink");
        }
    }

    //painting in Magenta
    public void fillInMagenta() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInMagenta();
        } else {
            System.out.println("cell already fill in magenta");
        }
    }

    //painting in Cyan
    public void fillInCyan() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInCyan();
        } else {
            System.out.println("cell already fill in cyan");
        }
    }

    //painting in Green
    public void fillInGreen() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (!cell.isPainted()) {
            cell.cellInGreen();
        } else {
            System.out.println("cell already fill in green");
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

    //clear the grid
    public void clearGrid() {
        grid.clearGrid();
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
