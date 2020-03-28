package shape;

import resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (double) Math.round(radius * radius * Math.PI*100)/100 ;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                + ", area " + getArea();
    }

    public void resize(double percent) {
        this.radius *= percent;
    }
}
