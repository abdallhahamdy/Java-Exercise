package Polymorphism.Exercise_2;
// Motorcycle.java
// Subclass Motorcycle
public class Motorcycle extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units");
    }
}
