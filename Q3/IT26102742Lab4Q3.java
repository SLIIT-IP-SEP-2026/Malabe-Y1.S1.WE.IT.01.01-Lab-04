import java.util.Scanner;
public class IT26102742Lab4Q3{
	public static void main(String[] args){
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = input.nextInt();
		System.out.println(num>0 ? "The number is: Positive": num<0 ? "The number is: Negative": "The number is: Zero");
	}
}