import java.util.ArrayList;
import java.util.LinkedList;
/**
 * This class demonstrates the use of ArrayList and LinkedList in Java.
 * It includes examples of adding, accessing, and removing elements from both lists.
 */
public class ListExamples {
    public static void main(String[] args) {
        // Example of using ArrayList
        System.out.println("ArrayList Example:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        // Displaying the ArrayList
        System.out.println("ArrayList: " + arrayList);
        
        // Accessing elements
        String firstElement = arrayList.get(0);
        System.out.println("First element: " + firstElement);
        
        // Removing an element
        arrayList.remove("Banana");
        System.out.println("ArrayList after removal: " + arrayList);
        
        // Example of using LinkedList
        System.out.println("\nLinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        
        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);
        
        // Accessing elements
        String firstLinkedElement = linkedList.get(0);
        System.out.println("First element in LinkedList: " + firstLinkedElement);
        
        // Removing an element
        linkedList.remove("Cat");
        System.out.println("LinkedList after removal: " + linkedList);
        
        // Iterating over the ArrayList
        System.out.println("\nIterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        
        // Iterating over the LinkedList
        System.out.println("\nIterating over LinkedList:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }
    }
}