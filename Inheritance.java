// Inheritance.java
// This class demonstrates the concept of inheritance in Java.
// Inheritance allows one class to inherit the properties and methods of another class.

class Animal {
    // Properties of the Animal class
    String name;
    int age;

    // Constructor for the Animal class
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display animal details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Dog class inherits from Animal class
class Dog extends Animal {
    // Additional property for Dog class
    String breed;

    // Constructor for Dog class
    Dog(String name, int age, String breed) {
        // Call the constructor of the superclass (Animal)
        super(name, age);
        this.breed = breed;
    }

    // Method to display dog details
    void displayDogInfo() {
        // Call the displayInfo method from the Animal class
        displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Main class to test inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Display the details of the dog
        myDog.displayDogInfo();
    }
}