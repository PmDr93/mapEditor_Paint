package org.pmdr.field;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    protected int row;
    protected int col;
    protected Rectangle rectangle;
    public static final int CELL_SIZE = 20;
    private boolean isPainted;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        rectangle = new Rectangle(col * CELL_SIZE + Grid.PADDING, row * CELL_SIZE + Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();
    }

    //getters
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public boolean isPainted() {
        return isPainted;
    }

    //put the boolean isPainted to true
    public void cellFilled() {
        isPainted = true;
        rectangle.fill();
    }

    //put the boolean isPainted to false
    public void cellEmpty() {
        isPainted = false;
        rectangle.draw();
    }

    //paint in black the cell
    public void cellInBlack() {
        rectangle.setColor(Color.BLACK);
    }

    //for save in a txt to know what cells are painted;
    @Override
    public String toString() {
        return isPainted ? "fill" : "not fill";
    }
}