package org.pmdr.field;

import org.academiadecodigo.simplegraphics.graphics.Text;

import java.util.ArrayList;

public class InformationPositions {

     private final String colorBlack = "B = Black Color";
     private final String colorBlue = "A = Blue Color";
     private final String colorRed = "R = Red Color";
     private final String colorYellow = "Y = Yellow Color";
     private final String colorOrange = "O = Orange Color";
     private final String colorPink = "P = Pink Color";
     private final String colorMagenta = "M = Magenta Color";
     private final String colorCyan = "D = Cyan Color";
     private final String colorGreen = "G = Green Color";
     private final String saveInfo = "S = Save";
     private final String loadInfo = "L = Load";
     private final String clearInfo = "C = clear all the grid";
     private final String eraserInfo = "'Space' = eraser";
     private final String moveUpInfo = "'Arrow Up' = move up";
     private final String moveRightInfo = "'Arrow Right' = move right";
     private final String moveLeftInfo = "'Arrow Left' = move left";
     private final String moveDownInfo = "'Arrow Down' = move down";



     private ArrayList<String > infoList = new ArrayList<>();
     private int cols;

     public InformationPositions(int cols) {
          this.cols = cols;
     }

     //add the info into the arraylist
     //create the info on the right side of the grid
     public void init() {
          addStringToList();
          informationCreatedPosition(cols);
     }

     private void informationCreatedPosition(int cols) {
          Text text;
          int x = cols + 1;
          int y = Grid.PADDING;

          for (String string : infoList) {
               text = new Text(x * Cell.CELL_SIZE + Grid.PADDING, y, string);
               text.draw();
               y += 20;
          }
     }

     private void addStringToList() {
          infoList.add(colorBlack);
          infoList.add(colorBlue);
          infoList.add(colorRed);
          infoList.add(colorYellow);
          infoList.add(colorOrange);
          infoList.add(colorPink);
          infoList.add(colorMagenta);
          infoList.add(colorCyan);
          infoList.add(colorGreen);
          infoList.add(saveInfo);
          infoList.add(loadInfo);
          infoList.add(clearInfo);
          infoList.add(eraserInfo);
          infoList.add(moveUpInfo);
          infoList.add(moveRightInfo);
          infoList.add(moveDownInfo);
          infoList.add(moveLeftInfo);

     }


}