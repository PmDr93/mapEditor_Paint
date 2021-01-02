package org.pmdr.field;

import java.util.Arrays;

public class Grid {

    public final static int PADDING = 10;
    public static int rows;
    public static int cols;
    private Cell[][] cells;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        buildGrid(rows, cols);
    }

    //getters
    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }
    public Cell getCell(int row, int col) {
        return cells[row][col];
    }


    //build the grid with various cols and rows
    public void buildGrid(int x, int y) {

        cells = new Cell[x][y];

        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    //load the grid
    public void loadGrid(String string) {

    }


    @Override
    public String toString() {

        StringBuilder gridString = new StringBuilder();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                gridString.append(cells[row][col]);
            }
            gridString.append("\n");
        }
        return gridString.toString();
    }
}
