import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void drawImage(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        horizontalLines(graphics, 10, 10);

    }
    //// -----------------------end of drawImage -------------------------
    public static void horizontalLines(Graphics graphics, int x, int y) {

        int line = 0;
        int size = 50;

        while (line < HEIGHT){
            graphics.drawLine(x,y + line, x + size,y + line);
            line = line + 50;
        }

    }

// Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a 50 long horizontal line from that point
    // Draw at least 3 lines with that function using a loop


    // Don't touch the code below
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
