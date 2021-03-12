import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {
        drawPurpleLines(graphics, 0,0);
        drawGreenLine(graphics, 0,0);

        }

    public static void drawPurpleLines(Graphics graphics, int x, int y) {
        int x1 = 0;
        int y1 = HEIGHT;
        while (y < HEIGHT) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x,y,x1,y1);
            y+= 20;
            x1+= 20;
        }
    }
    public static void drawGreenLine(Graphics graphics, int x, int y) {
        graphics.setColor(Color.MAGENTA);
        int x1 = WIDTH;
        int y1 = 0;
        while(x < WIDTH){
            graphics.drawLine(x, y, x1,y1);
            x += 20;
            y1 += 20;
        }
    }






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
