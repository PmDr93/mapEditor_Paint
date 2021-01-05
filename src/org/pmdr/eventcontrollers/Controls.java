package org.pmdr.eventcontrollers;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.pmdr.Paint;
import org.pmdr.cursor.Cursor;
import org.pmdr.cursor.CursorDirections;

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private final Paint paint;
    private final Cursor cursor;


    public Controls(Paint paint, Cursor cursor) {
        this.paint = paint;
        this.cursor = cursor;
    }

    public void initControls() {
        keyboard = new Keyboard(this);

        keyUp();
        keyRight();
        keyDown();
        keyLeft();
        paintBlackButton();
        paintBlueButton();
        paintRedButton();
        paintYellowButton();
        paintOrangeButton();
        paintPinkButton();
        paintMagentaButton();
        paintCyanButton();
        paintGreenButton();
        eraseCellButton();
        saveButton();
        loadButton();
        clearGrid();
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

    public void paintBlueButton() {
        KeyboardEvent aPressed = new KeyboardEvent();
        aPressed.setKey(KeyboardEvent.KEY_A);
        aPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(aPressed);
    }

    private void paintRedButton() {
        KeyboardEvent rPressed = new KeyboardEvent();
        rPressed.setKey(KeyboardEvent.KEY_R);
        rPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rPressed);
    }

    private void paintYellowButton() {
        KeyboardEvent yPressed = new KeyboardEvent();
        yPressed.setKey(KeyboardEvent.KEY_Y);
        yPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(yPressed);
    }

    private void paintOrangeButton() {
        KeyboardEvent oPressed = new KeyboardEvent();
        oPressed.setKey(KeyboardEvent.KEY_O);
        oPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(oPressed);
    }

    private void paintPinkButton() {
        KeyboardEvent pPressed = new KeyboardEvent();
        pPressed.setKey(KeyboardEvent.KEY_P);
        pPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(pPressed);
    }

    private void paintMagentaButton() {
        KeyboardEvent mPressed = new KeyboardEvent();
        mPressed.setKey(KeyboardEvent.KEY_M);
        mPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(mPressed);
    }

    private void paintCyanButton() {
        KeyboardEvent mPressed = new KeyboardEvent();
        mPressed.setKey(KeyboardEvent.KEY_D);
        mPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(mPressed);
    }

    private void paintGreenButton() {
        KeyboardEvent gPressed = new KeyboardEvent();
        gPressed.setKey(KeyboardEvent.KEY_G);
        gPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(gPressed);
    }

    //erase cell
    public void eraseCellButton() {
        KeyboardEvent spaceKey = new KeyboardEvent();
        spaceKey.setKey(KeyboardEvent.KEY_SPACE);
        spaceKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(spaceKey);
    }

    public void clearGrid() {
        KeyboardEvent clearButton = new KeyboardEvent();
        clearButton.setKey(KeyboardEvent.KEY_C);
        clearButton.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(clearButton);
    }


    //save paint button
    public void saveButton() {
        KeyboardEvent saveKey = new KeyboardEvent();
        saveKey.setKey(KeyboardEvent.KEY_S);
        saveKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(saveKey);
    }


    //load paint button
    public void loadButton() {
        KeyboardEvent loadKey = new KeyboardEvent();
        loadKey.setKey(KeyboardEvent.KEY_L);
        loadKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(loadKey);
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                cursor.cursorMovement(CursorDirections.UP);
                break;
            case KeyboardEvent.KEY_RIGHT:
                cursor.cursorMovement(CursorDirections.RIGHT);
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.cursorMovement(CursorDirections.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.cursorMovement(CursorDirections.LEFT);
                break;
            case KeyboardEvent.KEY_B:
                paint.fillInBlack();
                break;
            case KeyboardEvent.KEY_SPACE:
                paint.eraseCell();
                break;
            case KeyboardEvent.KEY_S:
                paint.savePaint();
                break;
            case KeyboardEvent.KEY_L:
                paint.loadPaint();
                break;
            case KeyboardEvent.KEY_C:
                paint.clearGrid();
                break;
            case KeyboardEvent.KEY_A:
                paint.fillInBlue();
                break;
            case KeyboardEvent.KEY_R:
                paint.fillInRed();
                break;
            case KeyboardEvent.KEY_Y:
                paint.fillInYellow();
                break;
            case KeyboardEvent.KEY_O:
                paint.fillInOrange();
                break;
            case KeyboardEvent.KEY_P:
                paint.fillInPink();
                break;
            case KeyboardEvent.KEY_M:
                paint.fillInMagenta();
                break;
            case KeyboardEvent.KEY_D:
                paint.fillInCyan();
                break;
            case KeyboardEvent.KEY_G:
                paint.fillInGreen();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
