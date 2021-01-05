package org.pmdr.field;


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
    private void buildGrid(int x, int y) {

        cells = new Cell[x][y];

        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    //load the grid
    public void loadGrid(String string) {

        String[] array = string.split("");
        int count = 0;

        for (String x : array) {
            System.out.println(x);
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                switch (array[count]) {
                    case "0":
                        cells[row][col].cellEmpty();
                        break;
                    case "1":
                        cells[row][col].cellInBlack();
                        break;
                    case "2":
                        cells[row][col].cellInBlue();
                        break;
                    case "3":
                        cells[row][col].cellInRed();
                        break;
                    case "4":
                        cells[row][col].cellInYellow();
                        break;
                    case "5":
                        cells[row][col].cellInOrange();
                        break;
                    case "6":
                        cells[row][col].cellInPink();
                        break;
                    case "7":
                        cells[row][col].cellInMagenta();
                        break;
                    case "8":
                        cells[row][col].cellInCyan();
                        break;
                    case "9":
                        cells[row][col].cellInGreen();
                        break;
                }
                count++;
            }
        }
    }

    //clear all the grid
    public void clearGrid() {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col].cellEmpty();
            }
        }
    }

    //build the string for the save file
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
