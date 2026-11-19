// Custom Exception Class
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionandPropoagation {

    // Method 3
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above!");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    // Method 2
    static void display(int age) throws AgeException {
        checkAge(age);
    }

    // Method 1
    public static void main(String[] args) {
        try {
            display(16);
        }
        catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
