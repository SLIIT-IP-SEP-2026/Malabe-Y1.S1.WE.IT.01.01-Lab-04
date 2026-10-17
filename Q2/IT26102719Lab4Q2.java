import java.util.Scanner;

public class IT26102719Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (0-100): ");
        double examMark = input.nextDouble();

        System.out.print("Please enter lab submission marks (0-100): ");
        double labMark = input.nextDouble();

        if (examMark < 0 || examMark > 100 || labMark < 0 || labMark > 100) {
            System.out.println("Invalid input for exam marks. Terminating program");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating program");
            return;
        }

        double finalMark = (examMark * examPercentage / 100)
                         + (labMark * labPercentage / 100);

        System.out.println("Final Exam Mark = " + finalMark);

        input.close();
    }
}