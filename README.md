# CarCareChoice.java
Java Chapter 8 exercise 3a&amp;&amp;b

//Sharing is caring. Please share your code because I want to see all version 


/*Chapter 8 Exercises 3 a
 *Programmer : 
 *Date : September 20, 2022
 *
 *Write an application for Cody’s Car Care Shop that shows a user a list of available services: 
 *oil change, tire rotation, battery check, or brake inspection. Allow the user to enter a string that corresponds
 *to one of the options, and display the option and its price as $25, $22, $15, or $5, accordingly.
 *Display an error message if the user enters an invalid item. Save the file as CarCareChoice.java.
 * 
 * */
import java.util.Scanner;
public class CarCareChoice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] list = {"Oil change", "Tire rotation", "Battery check", "Break inspection"};
		int[] price = {25, 22, 15, 5};
		String userInput;
 
		System.out.println("*****************Welcome to Cody's Care Care Shop*****************");
		System.out.println("List of available services: ");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " = $" + price[i] + "\t");
		//End for loop
		
		System.out.println();
		System.out.println("Enter the type of service that you want : ");
		userInput = scanner.nextLine();
		
		if (userInput.equalsIgnoreCase(list[0])) 
			System.out.println("You picked " + list[0] + " that will be $" + price[0] );
		else if (userInput.equalsIgnoreCase(list[1]))
			System.out.println("You picked " + list[1] + " that will be $" + price[1] );
		else if (userInput.equalsIgnoreCase(list[2]))
			System.out.println("You picked " + list[2] + " that will be $" + price[2] );
		else if (userInput.equalsIgnoreCase(list[3]))
			System.out.println("You picked " + list[3] + " that will be $" + price[3] );
		else
			System.out.println("We don't have that please choose in the available list");

	}//End main
}//End Class
