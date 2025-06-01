// This file demonstrates the concept of classes and objects in Java.
// It shows how to define a class and create objects from that class.

// Class definition
public class Classes {
    
    // Attributes (fields) of the class
    private String name;
    private int age;

    // Constructor to initialize the object
    public Classes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details of the object
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of the Classes class
        Classes person1 = new Classes("Alice", 30);
        
        // Calling the method to display the object's information
        person1.displayInfo();
        
        // Creating another object of the Classes class
        Classes person2 = new Classes("Bob", 25);
        
        // Calling the method to display the second object's information
        person2.displayInfo();
    }
}