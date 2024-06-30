package Polymorphism.Exercise_2;
// Car.java
// Subclass Car
public class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units.");
    }
}
