import java.util.Scanner;

public class IT26100313Lab4Q2{
   public static void main(String[] args){
	   
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Enter exam marks : ");
	   double ExamMarks = input.nextDouble();
	   
	   if(ExamMarks<0 || ExamMarks>100){
		   System.out.println("Invalid");
		   return;
	   }
	   System.out.println("Enter Lab marks : ");
	   double LabMarks = input.nextDouble();
	   
	   if(LabMarks<0 || LabMarks>100){
		   System.out.println("Invalid");
		   return;
	   }
	   System.out.println("Enter the percentage for the exam marks : ");
       double PerExam = input.nextDouble();

       System.out.println("Enter the percentage for the lab marks : ");
       double PerLab = input.nextDouble();

       if(PerExam + PerLab != 100){
		   System.out.println("Percentages must add up to 100");
		   return;
	   }	   
	   double FinalMark = (ExamMarks/100*PerExam) + (LabMarks/100*PerLab);
	   
	   System.out.println("Final Marks : "+ FinalMark);
   }


}