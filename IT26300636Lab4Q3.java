import java.util.Scanner;

public class IT26300636Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input a number from the keyboard
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // 2. Determine positive, negative, or zero using nested ternary operators
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        // 3. Display the result in the exact expected format
        System.out.println("The number is: " + result);

        scanner.close();
    }
}