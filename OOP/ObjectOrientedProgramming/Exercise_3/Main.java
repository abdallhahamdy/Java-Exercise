package ObjectOrientedProgramming.Exercise_3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 12);

        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

        rectangle.setWidth(6);
        rectangle.setHeight(12);

        System.out.println("The area of the rectangle is now " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());

    }
}
