package org.pmdr.field;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.*;

public class Cell {

    protected int row;
    protected int col;
    protected Rectangle rectangle;
    public static final int CELL_SIZE = 20;
    private boolean isPainted;
    private String index;
    private final Set<Colors> colorsSet = new HashSet<>();

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

    //put the boolean isPainted to true and fill the cell
    public void cellFilled() {
        isPainted = true;
        rectangle.fill();
    }

    //put the boolean isPainted to false and draw the cell in black (like empty)
    public void cellEmpty() {
        isPainted = false;
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }

    //paint in black the cell
    public void cellInBlack() {
        rectangle.setColor(Color.BLACK);
        index = Colors.BLACK.getIndex();
        colorsSet.add(Colors.BLACK);
        cellFilled();
    }

    //paint in blue the cell
    public void cellInBlue() {
        rectangle.setColor(Color.BLUE);
        index = Colors.BLUE.getIndex();
        colorsSet.add(Colors.BLUE);
        cellFilled();
    }

    //paint in red the cell
    public void cellInRed() {
        rectangle.setColor(Color.RED);
        index = Colors.RED.getIndex();
        colorsSet.add(Colors.RED);
        cellFilled();
    }

    //paint in yellow the cell
    public void cellInYellow() {
        rectangle.setColor(Color.YELLOW);
        index = Colors.YELLOW.getIndex();
        colorsSet.add(Colors.YELLOW);
        cellFilled();
    }

    //paint in orange the cell
    public void cellInOrange() {
        rectangle.setColor(Color.ORANGE);
        index = Colors.ORANGE.getIndex();
        colorsSet.add(Colors.ORANGE);
        cellFilled();
    }

    //paint in pink the cell
    public void cellInPink() {
        rectangle.setColor(Color.PINK);
        index = Colors.PINK.getIndex();
        colorsSet.add(Colors.PINK);
        cellFilled();
    }

    //paint in magenta the cell
    public void cellInMagenta() {
        rectangle.setColor(Color.MAGENTA);
        index = Colors.MAGENTA.getIndex();
        colorsSet.add(Colors.MAGENTA);
        cellFilled();
    }

    //paint in cyan the cell
    public void cellInCyan() {
        rectangle.setColor(Color.CYAN);
        index = Colors.CYAN.getIndex();
        colorsSet.add(Colors.CYAN);
        cellFilled();
    }

    //paint in green the cell
    public void cellInGreen() {
        rectangle.setColor(Color.GREEN);
        index = Colors.GREEN.getIndex();
        colorsSet.add(Colors.GREEN);
        cellFilled();
    }


    //for save in a txt to know what cells are painted and with color;
    @Override
    public String toString() {
        for (Colors colors : colorsSet) {
            if (index.equals(colors.getIndex())) {
                return index;
            }
        }
        return "0";

        //if and elses for colors index
        /*if (isPainted && index.equals("1")) { // ============== Black
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
        }*/
    }

}