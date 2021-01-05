package org.pmdr.field;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    protected int row;
    protected int col;
    protected Rectangle rectangle;
    public static final int CELL_SIZE = 20;
    private boolean isPainted;
    private String index;
    //private String[] indexes;

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
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }

    //paint in black the cell
    public void cellInBlack() {
        rectangle.setColor(Color.BLACK);
        //indexes[0] = "1";
        index = "1";
        cellFilled();
    }

    //paint in blue the cell
    public void cellInBlue() {
        rectangle.setColor(Color.BLUE);
        //indexes[1] = "2";
        index = "2";
        cellFilled();
    }

    //paint in red the cell
    public void cellInRed() {
        rectangle.setColor(Color.RED);
        //indexes[2] = "3";
        index = "3";
        cellFilled();
    }

    //paint in yellow the cell
    public void cellInYellow() {
        rectangle.setColor(Color.YELLOW);
        //indexes[3] = "4";
        index = "4";
        cellFilled();
    }

    //paint in orange the cell
    public void cellInOrange() {
        rectangle.setColor(Color.ORANGE);
        //indexes[4] = "5";
        index = "5";
        cellFilled();
    }

    //paint in pink the cell
    public void cellInPink() {
        rectangle.setColor(Color.PINK);
        //indexes[5] = "6";
        index = "6";
        cellFilled();
    }

    //paint in magenta the cell
    public void cellInMagenta() {
        rectangle.setColor(Color.MAGENTA);
        //indexes[6] = "7";
        index = "7";
        cellFilled();
    }

    //paint in magenta the cell
    public void cellInCyan() {
        rectangle.setColor(Color.CYAN);
        //indexes[7] = "8";
        index = "8";
        cellFilled();
    }

    //paint in magenta the cell
    public void cellInGreen() {
        rectangle.setColor(Color.GREEN);
        //indexes[8] = "9";
        index = "9";
        cellFilled();
    }

    //for save in a txt to know what cells are painted;

    @Override
    public String toString() {
        /*for (String index : indexes) {
            if (isPainted && index.equals()) {
        }*/


        if (isPainted && index.equals("1")) { // ============== Black
            return index;
        } else if (isPainted && index.equals("2")) { // ========= Blue
            return index;
        } else if (isPainted && index.equals("3")) { // ========= Red
            return index;
        } else if (isPainted && index.equals("4")) { // ========= Yellow
            return index;
        } else if (isPainted && index.equals("5")) { // ========= Orange
            return index;
        } else if (isPainted && index.equals("6")) { // ========= Pink
            return index;
        } else if (isPainted && index.equals("7")) { // ========= Magenta
            return index;
        } else if (isPainted && index.equals("8")) { // ========= Cyan
            return index;
        } else if (isPainted && index.equals("9")) { // ========= Green
            return index;
        } else {
            return "0";
        }


    }





    /* public String toString() {

    }
*/
}