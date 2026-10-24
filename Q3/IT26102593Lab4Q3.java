import java.util.Scanner;

public class  IT26102593Lab4Q3{
   public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);
	  
	  System.out.print("Enter a number: ");
	  double number = Scanner.nextDouble();
	  
	  String result = (number > 0) ? "Positive" :
                (number < 0) ? "Negative" : "Zero";
	  
	   
		System.out.println("The number is" + result);
	  }
	  
 	       
		  }
		  
		  