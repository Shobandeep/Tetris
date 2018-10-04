package root;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
    - Load piece above
    - move piece
    - check collision (check against board)
        - game over conditions?
        - add piece to board
        - pick new piece and load it above
    - draw
        -draw using board info
        -draw piece

 */

public class Tetris implements KeyListener {

    private int boundsX, boundsY;
    private Scene scene;
    private boolean[][] board;
    private int[][] ColorBoard;

    public  Tetris(int boundsX, int BoundsY, Scene scene) {
        this.boundsX = boundsX;
        this.boundsY = boundsY;

        // mark floor for collision

        this.scene = scene;

    }


    public void update() {}

    public void draw(Graphics2D g) {}
















    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
