import java.util.Scanner;
public class IT26102663Lab4Q2  {
	public static void main(String[] args)  {
		
		int examMarks;
		int labMarks;
		double examPercentage;
		double labPercentage;
		double finalMark;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks");
		examMarks = input.nextInt();
		
		if (examMarks < 0 || examMarks > 100)  {
			System.out.println("Invalid input for exam marks");
			return;
		}
		
		System.out.print("Please enter lab submission marks (out of 100):");
		labMarks = input.nextInt();
		
		if ( labMarks < 0 || labMarks > 100 )  {
			System.out.println("Invalid input for lab submission marks");
			return;
		}
		
		System.out.print("Please enter the percentage given for the exam: ");
		examPercentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission");
		labPercentage = input.nextDouble();
		
		if(examPercentage + labPercentage != 100)   {
			System.out.println("The percentage must add up to 100, Terminating program.");
			return;
		}
		
		finalMark = (examMarks + examPercentage / 100) + (labMarks + labPercentage / 100);
		
		System.out.println("Final exam marks is : " + finalMark);
		
	}
}