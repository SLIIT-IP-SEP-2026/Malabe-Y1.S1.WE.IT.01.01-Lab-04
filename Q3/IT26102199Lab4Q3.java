import java.util.Scanner;

public class IT26102199Lab4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Using nested ternary operator to check if the number is Positive, Negative, or Zero
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);
        
        input.close();
    }
}
