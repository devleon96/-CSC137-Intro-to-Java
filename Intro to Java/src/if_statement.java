import java.util.Scanner;



public class if_statement

{

   //-----------------------------------------------------------------

   //  Reads the user's age and prints comments accordingly.

   //-----------------------------------------------------------------

   public static void main(String[] args)

   {
	  final int MINOR = 21;
	   
      String state; 

      Scanner scan = new Scanner(System.in);

      // Gathering User Information

      System.out.println("Enter the state you reside in: ");
      state = scan.nextLine();

      System.out.println("Enter your age: ");
      int age = scan.nextInt();

      // Condition

      if (age <= MINOR && state.equals("NJ") )

      {
         System.out.println("Youth is a wonderful thing. Enjoy.");

         System.out.println("Enjoy your reading.");

         System.out.println("Keep Child Passenger Safety Law");
      }

      else
         System.out.println("Age is a state of mind.");
   }

}