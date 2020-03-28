package test;

import colorable.Colorable;
import shape.*;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(3, "red", false);
        shapes[2] = new Rectangle(3, 5);
        shapes[3] = new Square(10, "black", true);
        shapes[4] = new Rectangle(4, 6, "green", false);

            for (Shape shape : shapes) {
                System.out.println(shape);
                if (shape instanceof Square) {
                    Colorable square = (Square) shape;
                    System.out.println(square.howToColor());
                }
                System.out.println();
            }
    }
}
