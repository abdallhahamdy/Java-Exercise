package Polymorphism.Exercise_12;
// Main.java
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7.0);
        Shape cylinder = new Cylinder(4.0, 9.0);

        drawShapeAndCalculateArea(circle);
        drawShapeAndCalculateArea(cylinder);
    }

    public static void drawShapeAndCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}
