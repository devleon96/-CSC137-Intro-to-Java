import java.util.Scanner;

public class PositiveInteger {
	
	public static void main(String[] args) {
		
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		
		// Program reads integer input from user
		
		number = scan.nextInt();
		
		while (number <=0) {
			System.out.println("That is not a positive integer. Please enter a positive integer: ");
			number = scan.nextInt();
		}
		if (number > 0) {
			System.out.println("Positive integer confirmed. Thank you");
		}	
	}

}
