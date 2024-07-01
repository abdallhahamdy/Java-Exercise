package Polymorphism.Exercise_12;
// Cylinder.java
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cylinder");
    }

    @Override
    public double calculateArea() {
        // Calculation the total surface area of the cylinder (including the circular top and bottom)
        double circleArea = super.calculateArea();
        double sideArea = 2 * Math.PI * getRadius() * height;
        return 2 * circleArea + sideArea;
    }
}
