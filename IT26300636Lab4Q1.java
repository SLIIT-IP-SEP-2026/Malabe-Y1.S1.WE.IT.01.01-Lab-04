import java.util.Scanner;

public class IT26300636Lab4Q1{
	
	public static void main(String[] args){
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter The Number: " );
	double number = scanner.nextDouble();
	
	if (number > 0){
		System.out.println("The Number is: Positive");
	}
	else if(number < 0){
		System.out.println("The Number is: Negative");
	}
	else{
		System.out.println("The number is: zero");
	}	
	scanner.close();	
	}
	
}