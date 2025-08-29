import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
      /*  // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Variable to store the factorial result
        long factorial = 1;

        // Calculate the factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial result
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close(); */
     
        Scanner scanner = new Scanner(System.in); // For user input

        System.out.print("Enter a number: "); // Ask for a number
        int number = scanner.nextInt();

        long factorial = 1; // Start factorial at 1

        for (int i = 1; i <= number; i++) { // Multiply from 1 to the number
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial); // Print result
        scanner.close(); // Close scanner
    }
}

