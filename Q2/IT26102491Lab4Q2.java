import java.util.Scanner;

public class IT26102491Lab4Q2 {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter  exam marks (out of 100):");
		double e_marks=input.nextDouble();
	
		if (e_marks >= 0 && e_marks <= 100) { 
			System.out.print("Please enter  lab submission marks (out of 100):");
			double s_marks=input.nextDouble();
		
			if (s_marks >= 0 && s_marks <= 100) {
				System.out.print("Please enter  percentage given for the exam:");
				double p_marks=input.nextDouble();
		
			 
				System.out.print("Please enter  percentage given for the lab submission:");
				double p_l_marks=input.nextDouble();
			
				if(p_marks + p_l_marks == 100) {
					double fullMarks=(e_marks*p_marks)/100 + (s_marks*p_l_marks)/100 ;
				
					System.out.print("The final exam mark is:" +fullMarks);
			
				}else {
				System.out.print("The percentages must add up to 100. Terminating program.");
				}
			
			}else {
			System.out.print("Invalid input for  lab submission marks.Terminating program." );
			}	
		
	    }else {
		System.out.print("Invalid input for exam marks.Terminating program." );
		}
		
	}
}	