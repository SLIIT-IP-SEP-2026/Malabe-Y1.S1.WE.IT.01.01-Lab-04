import java.util.Scanner;
public class IT26102742Lab4Q2{
	public static void main(String[] args){
		double examMark;
		double labMark;
		double examMarkP;
		double labMarkP;
		double totalMark;
		double totalMarkP;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100): ");
		examMark = input.nextDouble();
		if (examMark<=100){
			System.out.print("Please enter lab submission marks (out of 100): ");
			labMark = input.nextDouble();
			if (labMark<=100){
				totalMark = (examMark + labMark)/2;
				System.out.print("Please enter the percentage given for the exam: ");
				examMarkP = input.nextDouble();
				System.out.print("Please enter the percentage given for the lab submission: ");
				labMarkP = input.nextDouble();
				totalMarkP = examMarkP + labMarkP;
				if (totalMarkP==100){
					System.out.println("\nFinal Exam Mark is: " + totalMark);
				}
				else {
					System.out.println("The percentages must add up to 100. Terminating the program.");
				}
			}
			else{
				System.out.println("Invalid input for lab submission marks. Terminating program.");
			}
		}
		else{
			System.out.println("Invalid input for exam marks. Terminating program.");
		}
	}
}