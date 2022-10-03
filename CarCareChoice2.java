/*Chapter 8 Exercise 3b
 * Programmer : Diosdado Cartas
 * Date: October 3, 2022
 * 
 * It might not be reasonable to expect users to type long entries such as “oil change” accurately. 
 * Modify the CarCareChoice class so that as long as the user enters the first three characters of a service, 
 * the choice is considered valid. Save the file as CarCareChoice2.java.
 * */

import java.util.Scanner;

public class CarCareChoice2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		//List of available services
		String[] services = {"Oil Change","Tire Rotation", "Battery Check","Break Inspection"};
		//List of prices
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
			//I use or userServices.equalsIgnoreCase(services.substring(0,3) -- first 3 letters
			if (userServices.equalsIgnoreCase(services[i]) || userServices.equalsIgnoreCase(services[i].substring(0,3))) {
				System.out.println("The would cost $" + price[i]);
				// I use boolean to make the loop continue 
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
