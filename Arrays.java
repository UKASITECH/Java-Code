// Arrays.java
// This file illustrates how to create and manipulate arrays in Java,
// including single-dimensional and multi-dimensional arrays.

public class Arrays {
    public static void main(String[] args) {
        // Single-dimensional array
        int[] singleDimensionalArray = {1, 2, 3, 4, 5};
        
        // Accessing elements of a single-dimensional array
        System.out.println("Single-dimensional array elements:");
        for (int i = 0; i < singleDimensionalArray.length; i++) {
            System.out.println("Element at index " + i + ": " + singleDimensionalArray[i]);
        }

        // Multi-dimensional array (2D array)
        int[][] multiDimensionalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements of a multi-dimensional array
        System.out.println("\nMulti-dimensional array elements:");
        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                System.out.print(multiDimensionalArray[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }

        // Modifying an element in the single-dimensional array
        singleDimensionalArray[2] = 10; // Changing the third element to 10
        System.out.println("\nModified single-dimensional array:");
        for (int element : singleDimensionalArray) {
            System.out.print(element + " ");
        }
    }
}