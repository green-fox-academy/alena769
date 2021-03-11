import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void drawImage(Graphics graphics) {
        drawLine(graphics, 10,10);
        }

    public static void drawLine(Graphics graphics, int x, int y) {
        graphics.setColor(Color.BLUE);
        int sequence = 0;
        int add = 0;
        while (sequence <= HEIGHT/2) {
            graphics.drawLine(x + add,y + add,x + add,y + add);
            sequence++;
            add++;
        }
    }
    // ------------------------ end of draImage -------------------------

    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a line from that point to the center of the canvas
    // Draw at least 3 lines with that function using a loop











    ///// ----- do not change ---------------------------------------------

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
