import java.util.Scanner;

public class CountDigitFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter an integer from the candy group:");
        long number = scanner.nextLong();

        // Initialize count of digit 4
        int countOfFours = 0;

        // Handle negative numbers by converting them to positive
        number = Math.abs(number);

        // Count occurrences of digit 4
        while (number > 0) {
            long digit = number % 10;  // Extract last digit
            if (digit == 4) {
                countOfFours++;  // Increment count if digit is 4
            }
            number /= 10;  // Remove last digit
        }

        // Output result
        System.out.println(countOfFours);

        // Close the scanner
        scanner.close();
    }
}
