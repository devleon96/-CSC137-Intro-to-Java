import java.util.Random;
import java.util.Scanner;

public class HotelRoom 
{
	public static void main (String [] args)
	{
		Scanner guestName = new Scanner(System.in);
		System.out.println("Welcome to our hotel, please enter your name: ");
		
		String name = guestName.nextLine();
		guestName.close();
		
		System.out.println("Thank you Mr/Ms. " + name + ".");
		
		Random generator = new Random();
		int num;
		
		num = generator.nextInt(200) + 1;
		System.out.println("From rooms 1 to 200, you will be staying at room number: " + num);
	}
}