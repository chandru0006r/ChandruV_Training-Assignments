package JavaAssignment4;

public class ExceptionHandling {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Candidate is not eligible to vote");
        } else {
            System.out.println("Candidate is eligible to vote");
        }
    }

    public static void main(String[] args) {
        int eligibleAge = 25;
        int ineligibleAge = 17;

        System.out.println("--- Checking age: " + eligibleAge + " ---");
        try {
            validateAge(eligibleAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println(); 

        System.out.println("--- Checking age: " + ineligibleAge + " ---");
        try {
            validateAge(ineligibleAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}