package org.pmdr;

import org.pmdr.cursor.Cursor;
import org.pmdr.cursor.CursorDirections;
import org.pmdr.eventcontrollers.Controls;
import org.pmdr.field.Cell;
import org.pmdr.field.Grid;

public class Paint {

    private Grid grid;
    private Cursor cursor;
    private Controls controls;

    public Paint(int rows, int cols) {
        this.grid = new Grid(rows, cols);
        this.cursor = new Cursor(0, 0);
        this.controls = new Controls(this);
    }

    public void init() {
        controls.initControls();
    }

    //cursor movement
    public void cursorMovement(CursorDirections directions) {

        switch (directions) {
            case UP:
                cursor.moveUp();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
        }
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
}
