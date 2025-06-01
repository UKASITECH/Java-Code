public class Polymorphism {
    // This class demonstrates the concept of polymorphism in Java.

    // Method overloading: same method name with different parameters
    public void display(int number) {
        System.out.println("Displaying integer: " + number);
    }

    public void display(String text) {
        System.out.println("Displaying string: " + text);
    }

    // Method overriding: subclass provides a specific implementation of a method
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        
        // Demonstrating method overloading
        polymorphism.display(10); // Calls the method with int parameter
        polymorphism.display("Hello, Polymorphism!"); // Calls the method with String parameter

        // Demonstrating method overriding
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Calls the overridden method in Dog class
    }
}

// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}