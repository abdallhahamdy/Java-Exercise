package Polymorphism.Exercise_10;
// Lion.java
public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars.");
    }
}
