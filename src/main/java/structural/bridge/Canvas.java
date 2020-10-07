package structural.bridge;

import javax.swing.*;
import java.awt.*;

/**
 * Bridge pattern much simplify complex hierarchy and make it easier to add new functionality to the code.
 *
 * Splitting one hierarchy into two
 */
public class Canvas extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        Square square = new Square(new BlueColorShape());
        square.draw(graphics);

        Circle circle = new Circle(new RedColorShape());
        circle.draw(graphics);

        Triangle triangle = new Triangle(new GreenColorShape());
        triangle.draw(graphics);
    }
}
