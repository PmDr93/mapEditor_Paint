package org.pmdr.eventcontrollers;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.pmdr.Paint;
import org.pmdr.cursor.CursorDirections;

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private Paint paint;


    public Controls(Paint paint) {
        this.paint = paint;
    }

    public void initControls() {
        keyboard = new Keyboard(this);

        keyUp();
        keyRight();
        keyDown();
        keyLeft();
        paintBlackButton();
        eraseCellButton();

    }

    //add keyboardEvent to the keys
    //movement
    public void keyLeft(){
        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(leftPressed);
    }

    public void keyRight() {
        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);
    }

    public void keyUp() {
        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(upPressed);
    }

    public void keyDown() {
        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(downPressed);
    }

    //painting
    public void paintBlackButton() {
        KeyboardEvent bPressed = new KeyboardEvent();
        bPressed.setKey(KeyboardEvent.KEY_B);
        bPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(bPressed);
    }

    //erase cell
    public void eraseCellButton() {
        KeyboardEvent spaceKey = new KeyboardEvent();
        spaceKey.setKey(KeyboardEvent.KEY_SPACE);
        spaceKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(spaceKey);
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                paint.cursorMovement(CursorDirections.UP);
                break;
            case KeyboardEvent.KEY_RIGHT:
                paint.cursorMovement(CursorDirections.RIGHT);
                break;
            case KeyboardEvent.KEY_DOWN:
                paint.cursorMovement(CursorDirections.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                paint.cursorMovement(CursorDirections.LEFT);
                break;
            case KeyboardEvent.KEY_B:
                paint.fillInBlack();
                break;
            case KeyboardEvent.KEY_SPACE:
                paint.eraseCell();
                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
