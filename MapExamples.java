// MapExamples.java
// This file illustrates how to use maps in Java, including HashMap and TreeMap, and how to store key-value pairs.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);

        // Displaying the HashMap
        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Creating a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Orange", 4);
        treeMap.put("Grape", 5);
        treeMap.put("Mango", 6);

        // Displaying the TreeMap
        System.out.println("\nTreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Accessing a value
        int bananaValue = hashMap.get("Banana");
        System.out.println("\nValue associated with 'Banana': " + bananaValue);

        // Removing a key-value pair
        hashMap.remove("Cherry");
        System.out.println("\nHashMap after removing 'Cherry': " + hashMap);
    }
}