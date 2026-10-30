import java.util.Scanner;

public class IT26102593Lab4Q2 {
    public static void main(String[] args ){ 
	
	      Scanner input = new Scanner(System.in);
		  
		  
		  System.out.print("Please enter exam marks(out of 100):");
		  
		  double exam = input.nextDouble();
		  
		  if(exam < 0 || exam > 100) {
		     System.out.println("Invalid input for exam marks.Terminating program.");
			  return;
			  
			  }
			  
			  System.out.println("Please enter lab submission marks(out of 100):");
			  
			  double lab = input.nextDouble();
			  
			   
		      if(lab < 0 || lab > 100) {
			  
		      System.out.println("Invalid input for lab marks.Terminating program.");
			  
			   return;
			  
			  }
			  
			  System.out.print("Please enter the percentage given for the exam: ");
			   
			  double exampercentage  = input.nextDouble();
			  
			  System.out.print("Please enter the percentage given for the lab submission: ");
			   
			  double labpercentage  = input.nextDouble();
			   
			  if(exampercentage < 0 || labpercentage < 0 || (exampercentage + labpercentage != 100)){
			  System.out.println("The percentages must add up to 100.Terminating program");
			   
			       return;
				   
				}

                double finalMark = (exam * exampercentage / 100)
                         + (lab * labpercentage / 100);

                System.out.println("Final Exam Mark is : " + finalMark);

                input.close();
                 }
}   