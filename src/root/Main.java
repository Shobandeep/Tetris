package root;

import javax.swing.*;
import java.awt.*;

public class Main {



    public static void main(String[] args) {

        int boundsX = 300, boundsY = 600;

        JFrame frame = Scene.setFrame(boundsX, boundsY);
        Scene canvas = new Scene(boundsX ,boundsY);

        Dimension d = new Dimension(boundsX, boundsY);
        canvas.setPreferredSize(d);
        canvas.setMaximumSize(d);
        canvas.setMinimumSize(d);

        frame.add(canvas);
        frame.pack();

        canvas.start();
    }
}