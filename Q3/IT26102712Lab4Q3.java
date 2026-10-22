import java.util.Scanner;
public class IT26102712Lab4Q3{
	public static void main(String[] args){
		Scanner abc=new Scanner(System.in);
		double number;
		String message;
	System.out.print("Enter a number : ");
	number=abc.nextDouble();
	message = (number>0) ? "The number is : Positive" : (number<0) ? "The number is : Negative" : "The number is : Zero";
	System.out.print(message);
	}
}