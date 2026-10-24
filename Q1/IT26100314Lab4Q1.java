import java.util.Scanner;

public class IT26100314Lab4Q1 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		double number = input.nextDouble();
		
		if(number>0){
			System.out.println ("The number is positive");  
		
			}else if (number<0){
			System.out.println ("The number is negative");  
		
	        }else
			System.out.println ("The number is zero");
		
	
	}
	
}