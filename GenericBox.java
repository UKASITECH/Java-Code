// This file demonstrates the concept of Generics in Java.
// Generics allow you to create classes, interfaces, and methods with a placeholder for the type of data they operate on.
// This enables type safety and eliminates the need for casting.


// A generic class that can operate on any type
public class GenericBox<T> {
    private T data;

    // Constructor to initialize the data
    public GenericBox(T data) {
        this.data = data;
    }

    // Method to get the data
    public T getData() {
        return data;
    }

    // Method to display the type of data
    public void displayType() {
        System.out.println("The type of data is: " + data.getClass().getName());
    }

    // Main method to demonstrate the use of Generics
    public static void main(String[] args) {
        // Creating an instance of GenericBox with Integer type
        GenericBox<Integer> intGeneric = new GenericBox<>(10);
        System.out.println("Data: " + intGeneric.getData());
        intGeneric.displayType();

        // Creating an instance of GenericBox with String type
        GenericBox<String> stringGeneric = new GenericBox<>("Hello Generics");
        System.out.println("Data: " + stringGeneric.getData());
        stringGeneric.displayType();
    }
}
