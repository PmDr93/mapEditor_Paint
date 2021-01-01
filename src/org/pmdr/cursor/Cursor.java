package org.pmdr.cursor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.pmdr.field.Cell;
import org.pmdr.field.Grid;

import java.lang.reflect.Field;

public class Cursor extends Cell implements Movement{


    public Cursor(int row, int col) {
        super(row, col);
        rectangle.setColor(Color.ORANGE);
        rectangle.fill();
    }



    //make the directions for movement of the cursor
    @Override
    public void moveUp() {
        if (row == 0) {
            return;
        }
        row--;
        rectangle.translate(0, -CELL_SIZE);
    }

    @Override
    public void moveRight() {
        if (col >= Grid.cols - 1) {
            return;
        }
        col++;
        rectangle.translate(CELL_SIZE, 0);
    }

    @Override
    public void moveDown() {
        if (row >= Grid.rows - 1) {
            return;
        }
        row++;
        rectangle.translate(0, CELL_SIZE);
    }

    @Override
    public void moveLeft() {
        if (col == 0) {
            return;
        }
        col--;
        rectangle.translate(-CELL_SIZE, 0);
    }
}
