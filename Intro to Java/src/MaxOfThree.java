import java.lang.Math;
import java.util.Scanner;

public class MaxOfThree {

		public static void main (String [] args)
		{
			Scanner scan = new Scanner(System.in);
			
			//Program prompts user to enter several values and reads them
			
			System.out.println("Please enter a value: ");
			int a = scan.nextInt();
			
			System.out.println("Please enter a second value: ");
			int b = scan.nextInt();
			
			System.out.println("Please enter a third value: ");
			int c = scan.nextInt();
			
			//Program prints the maximum value out of all the values
				
			int max = Math.max(Math.max(a, b), c);
			System.out.println("Out of the values you entered, the maximum value is " + max);
			
		}
}
