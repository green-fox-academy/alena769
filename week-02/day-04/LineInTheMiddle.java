import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class LineInTheMiddle {
    public static void drawImage(Graphics graphics) {

        // ---- line all the way --------------------

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);



        /* ---- line till the middle of the canvas ---------------

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT/2);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, HEIGHT/2, WIDTH/2, HEIGHT/2);
        */

    }
    /// -----------------end of drawImage ----------------










// ----------------------------------------------------------------------------------
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}



