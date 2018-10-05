import java.util.Scanner;

public class StringMutation
{
   //-----------------------------------------------------------------
   //  Displays my first and last name with their lengths accordingly
   //-----------------------------------------------------------------
	public static void main(String[] args)
   {
		// These lines display my first name with it's length
		
      String name = "Edwin";
      int nameLength = name.length();
      System.out.println("Your first name " + name + " contains " + nameLength + " letters.");
      
      	// These lines display my last name with it's length
      
      String name2 = "Leon";
      int nameLength2 = name2.length();
      System.out.println("Your last name " + name2 + " contains " + nameLength2 + " letters.");                              
   }
}