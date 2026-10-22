import java.util.Scanner;
public class IT26102712Lab4Q2{
	public static void main(String[] args){
		int examMarks;
		int labMarks;
		int examPercentage;
		int labPercentage;
		int finalMark;
	Scanner input=new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100) :");
		examMarks=input.nextInt();
	if (examMarks>100 || examMarks<0){
		System.out.print("Invalid input for exam marks. Terminating the program");	
	}else{
		System.out.print("Please enter lan submission marks (out of 100) :");
		labMarks=input.nextInt();
	
	if (labMarks>100 || labMarks<0){
		System.out.print("Invalid input for lab marks. Terminating the program");	
	}else{
		System.out.print("Please enter the percentage given for the exam :");
		examPercentage=input.nextInt();
		System.out.print("Please enter the percentage given for the lab submission :");
		labPercentage=input.nextInt();
	
	if (examPercentage+labPercentage!=100){
		System.out.print("The persentages must add up to 100. Terminating the program.");
	}else{
		finalMark=((examMarks*examPercentage/100)+(labMarks*labPercentage/100));
	System.out.print("Final Exam Mark is: " + finalMark);
	}
	}
	}
	}
}