// ControlFlow.java
// This file demonstrates control flow statements in Java, including if-else statements, switch cases, and loops.

public class ControlFlow {
    public static void main(String[] args) {
        // Example of if-else statement
        int number = 10;
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Example of switch case
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("Good job!");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better luck next time.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // Example of for loop
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Example of while loop
        System.out.println("While loop example:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}