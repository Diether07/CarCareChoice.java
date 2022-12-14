/*Chapter 8 Exercises 3 a
 *Programmer : Diosdado Cartas 
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
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		//List of available services
		String[] services = {"Oil Change","Tire Rotation", "Battery Check","Break Inspection"};
		//List of price
		int[] price = {25,22,15,5};
		boolean stop = false;
		
		//Show the list to the user
		for(int i = 0; i < services.length;i++)
			System.out.print("-"+services[i]+ " ");
		
		//User input
		System.out.println("\nEnter the service that you want to get: ");
		String userServices = scanner.nextLine();
		
		//Display output
		for(int i = 0; i < services.length; i++) {
			if (userServices.equalsIgnoreCase(services[i])) {
				System.out.println("The would cost $" + price[i]);
				// I used boolean to make the loop continue 
				stop = true;
			}
			//I tried to use else but the display error will print 4 times
			//If I use break the loop will not continue
		}
		
		//So if the loop didn't find the stop it will go here 
		if (!stop) 
			System.out.println("We dont have that service or check your input ");
		
		
		
	}
}
