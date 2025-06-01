public class ExceptionHandling {
    public static void main(String[] args) {
        // Example of handling an exception using try-catch
        try {
            int result = divide(10, 0); // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Example of a custom exception
        try {
            validateAge(15); // This will throw a custom exception
        } catch (AgeNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to divide two numbers
    public static int divide(int a, int b) {
        return a / b; // This may throw ArithmeticException if b is zero
    }

    // Method to validate age
    public static void validateAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}

// Custom exception class
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}