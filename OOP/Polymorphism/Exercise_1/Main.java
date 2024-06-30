package Polymorphism.Exercise_1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.makeSound();     // Output: The animal makes a sound
        bird.makeSound();       // Output: The bird chirps
        cat.makeSound();        // Output: The cat meows
    }
}
