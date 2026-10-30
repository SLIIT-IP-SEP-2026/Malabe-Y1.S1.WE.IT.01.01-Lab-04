import java.util.Scanner;

	public class IT26102060Lab4Q1{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);


	System.out.println ("Enter a number: ");
	double number = input.nextDouble();
	
	if (number > 0){
		System.out.println ("Positive");
		
	}else if (number < 0){
		System.out.println ("Negative");
		
	}else 
		System.out.println ("Zero");	
	}
		
		
	}