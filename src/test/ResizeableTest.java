package test;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;
import resizeable.Resizeable;


public class ResizeableTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3,"red",false);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(3);

        System.out.println("Pre-sorted:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        Resizeable circle = (Circle) shapes[0];
        circle.resize(shapes[0].randomResize());
        Resizeable rectangle = (Rectangle) shapes[1];
        rectangle.resize(shapes[1].randomResize());
        Resizeable square = (Square) shapes[2];
        square.resize(shapes[2].randomResize());

        System.out.println("Pre-sorted:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

}
