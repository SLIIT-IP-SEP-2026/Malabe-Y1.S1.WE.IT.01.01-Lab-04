import java.util.Scanner;

public class IT26100568Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam marks: ");
        double exam = input.nextDouble();

        System.out.print("Enter lab submission marks: ");
        double lab = input.nextDouble();

        System.out.print("Enter exam percentage: ");
        double examPer = input.nextDouble();

        System.out.print("Enter lab percentage: ");
        double labPer = input.nextDouble();

        double finalMark =
            (exam * examPer / 100) +
            (lab * labPer / 100);

        System.out.println("Final Mark = " + finalMark);
    }
}