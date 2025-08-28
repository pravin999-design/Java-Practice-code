// Custom exception class
class InvalidAgeException extends Exception {
    
    public InvalidAgeException(String message) {
        
        super(message);  // Pass message to base Exception class
   
    }
}

public class throwsandthrow {

    // Method that declares it might throw the custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing custom exception
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        // Case 1: Invalid age
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Case 2: Valid age
        try {
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        //finally block
        //Always remember where try use there only finally will be used 
        finally{
            System.out.println("This is the finallly block , where  no matter errror comes or not ");
        }
    }
}
