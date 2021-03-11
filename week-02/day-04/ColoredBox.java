import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics){
        /*
        graphics.setColor(Color.RED);
        graphics.drawLine(10,10, WIDTH - 10, 10);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(10, HEIGHT - 10, WIDTH - 10, HEIGHT - 10);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(10, 10, 10, HEIGHT - 10);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(WIDTH - 10, 10, HEIGHT - 10, WIDTH - 10);

         */

        drawRectangle(graphics, 15, 25, 100, 100);


    }
   public static void drawRectangle(Graphics graphics, int x, int y, int sizeX, int sizeY) {
        graphics.setColor(Color.RED);
        graphics.drawLine(x,y, sizeX - x, y);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x, sizeY - y, sizeX - x, sizeY - y);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x, y, x, sizeY - y);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine( sizeX - x, y, sizeX - x, sizeY - y);



    }



/////Dont touch the code below -------------------------
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
