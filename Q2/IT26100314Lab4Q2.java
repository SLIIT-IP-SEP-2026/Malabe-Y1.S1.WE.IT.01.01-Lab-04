import java.util.Scanner;

public class IT26100314Lab4Q2 { 
  
    public static void main(String[] args){
		 
	Scanner input = new Scanner(System.in);
		 
	 System.out.println("Enter the exam marks:");
	 double examMarks =input.nextDouble();
	  
	    if ( examMarks<0 || examMarks>100) {
		 System.out.println("Invalid:");
		 return;
	   }
	   
	    System.out.println("Enter the lab marks:");
		double labMarks = input.nextDouble();
		
		if( labMarks<0 || labMarks>100)  {
			System.out.println("Invalid:");
			return;
		}
		
		System.out.println("Enter the Percentage of marks:");
		
	    double percentageExam = input.nextDouble();
		
		System.out.println("Enter the Percentage of lab submission:");
		double percentageLabSub = input.nextDouble();
		
		if(percentageExam + percentageLabSub !=100) {
			System.out.println("percentages must add up top 100");
		return;  
		}
		
		double finalMark = (examMarks/100 *percentageExam) + (labMarks/100*percentageLabSub);
		System.out.println("Final marks: " + finalMark);
		}
		
		
	 
	 
	 }
		
	 
























}