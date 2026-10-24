import java.util.Scanner;
public class IT26102663Lab4Q1  {
	public static void main(String[] args)  {
		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number");
		num = input.nextInt();
		
		if(num>0)  {
			System.out.println("positive");
		} 
		else if(num<0)  {
			System.out.println("negative");
		}
		else {
			System.out.println("Zero");
		}
		
	}
}
		
		
		
		
		