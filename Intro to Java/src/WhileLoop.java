import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args)
	   {
		
		 // Initial declarations
		
		 double calories;
		 double sum=0;
		 double average;

		 Scanner scan = new Scanner(System.in);
		 System.out.println("You will be prompted to enter the number of calories burned for each day of the week.");

		 // While loop declarations & statements

		 int count = 0;
		 while (count< 7)
		 {
		   System.out.println("Enter the number of calories burned for today: ");
		 
		   calories=scan.nextDouble();
		   sum =sum +calories;
		   count++;

		 }
		 average = sum/7;

		 System.out.println("The average number of calories burned for 1 week is " + average);
	   }
}