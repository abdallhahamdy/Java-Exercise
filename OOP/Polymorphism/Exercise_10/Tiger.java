package Polymorphism.Exercise_10;
// Tiger.java
public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and sometimes fish.");
    }

    @Override
    public void sound() {
        System.out.println("Tiger growls.");
    }
}
