import java.util.Scanner;

public class IT26100314Lab4Q3 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		double number = input.nextDouble();
		
		String result = (number>0)? "positive": (number<0)? "negative": "zero";
		
		System.out.println ( "The number is: " + result);
		
	}
}