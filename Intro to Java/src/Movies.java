// By: Edwin Leon

import java.util.ArrayList;

public class Movies {
	
	public static void main(String[] args)
	{
		System.out.println("These are my 5 favorite movies: ");
		
		// Initialize ArrayList
		
		ArrayList<String> movie = new ArrayList<String>();
		
		movie.add("Interstellar");
		movie.add("Avatar");
		movie.add("Gravity");
		movie.add("Passengers");
		movie.add("The Martian");
		
		// Print movie list
		
		System.out.println(movie);
		
		// Get index of most favorite movie in ArrayList
		
		System.out.println("Out of these 5, my most favorite movie is: " + movie.get(0));
		
	}
}
