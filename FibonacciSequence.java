import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTerms = getValidInput(input);

        System.out.println("Fibonacci Series:");
        printFibonacciSequence(numTerms);
    }

    /**
     * Prompts the user for a positive integer input and validates it.
     * Keeps prompting until a valid input is received.
     *
     * @param scanner The Scanner object to read user input.
     * @return The valid positive integer entered by the user.
     */
    public static int getValidInput(Scanner scanner) {
        int numTerms;
        do {
            System.out.print("Enter the number of terms (positive integer): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear the scanner buffer
            }
            numTerms = scanner.nextInt();
        } while (numTerms <= 0);

        return numTerms;
    }

    /**
     * Prints the Fibonacci sequence up to the specified number of terms.
     *
     * @param numTerms The number of terms in the sequence.
     */
    public static void printFibonacciSequence(int numTerms) {
        int firstTerm = 0, secondTerm = 1;
        int nextTerm;

        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 3; i <= numTerms; ++i) {
            nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}