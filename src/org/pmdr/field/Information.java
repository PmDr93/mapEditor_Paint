package org.pmdr.field;

import org.academiadecodigo.simplegraphics.graphics.Text;

public class Information {

     String colorBlack = "'b' = Black Color";


     public void init() {
         Text blackInfo = new Text(, 10, colorBlack);
         blackInfo.draw();

     }


}