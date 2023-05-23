package basics;
import java.util.ArrayList;
import java.util.Collections; 

public class ListArray {

	public static void main(String[] args) {
	
		/* The ArrayList class is a resizable array, which can be found in the java.util package.
		 * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
		 * if you want to add or remove elements to/from an array, you have to create a new one
		 * While elements can be added and removed from an ArrayList whenever you want
		 */

		// Import ArrayList class
		// Create  ArrayList object  
		
		ArrayList<String> colors = new ArrayList<String>();
		
		// Add elements to list 
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		
		System.out.println(colors);
		//for loop
		
		for( int i =0; i<colors.size() ; i++)
		{
			System.out.println(colors.get(i));
		}
		// for-each loop
		for(String i : colors)
		{
			System.out.println(i);
		}
		
		colors.add("Pink");
		colors.add("Purple");
		
		System.out.println(colors);
		
		colors.remove(4);
		System.out.println(colors);
		
		colors.set(3, "Purple");
		System.out.println(colors);
		
		//java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
	    Collections.sort(colors);
		System.out.println(colors);
	    
	
	}
	

}
