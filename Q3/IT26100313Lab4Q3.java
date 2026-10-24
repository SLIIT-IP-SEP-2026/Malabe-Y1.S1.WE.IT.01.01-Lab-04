import java.util.Scanner;

public class IT26100313Lab4Q3{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Number:");
	double number = input.nextDouble();
	
	String result = (number > 0)? "Positive": (number < 0)? "Negative":"Number IS zero";
	
	System.out.println(result);
	
	}
  }