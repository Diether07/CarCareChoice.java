/*Chapter 8 Exercises 3 b
 * Programmer :
 * Date : September 30, 2022
 * 
 * It might not be reasonable to expect users to type long entries such as “oil change” accurately.
 * Modify the CarCareChoice class so that as long as the user enters the first three characters of a 
 * service, the choice is considered valid. Save the file as CarCareChoice2.java.
 * 
 * */
import java.util.Scanner;
public class CarChoice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] list = {"Oil change", "Tire rotation", "Battery check", "Break inspection"};
		String[] subList = {"Oil", "Tire", "Battery", "Break"};
		int[] price = {25, 22, 15, 5};
		String userInput;
		boolean flag = false;
		// Revised code and clean
		System.out.println("*****************Welcome to Cody's Care Care Shop*****************");
		System.out.println("List of available service: ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		
		System.out.println();
		System.out.println("Pick a service that you need: ");
		userInput = scanner.nextLine();
		
		for (int i = 0; i < list.length; i++) {
			if (list[i].equalsIgnoreCase(userInput) || subList[i].equalsIgnoreCase(userInput)) {
				System.out.println(list[i] + " cost $" + price[i]);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("We don't have that service or check your spelling");
		}
		
		//My Code
//		
//		
// 
//		System.out.println("*****************Welcome to Cody's Care Care Shop*****************");
//		System.out.println("List of available services: ");
//		for (int i = 0; i < list.length; i++)
//			System.out.print(list[i] + " = $" + price[i] + "\t" );
//		//End for loop
//		
//		System.out.println();
//		System.out.println("Enter the type of service that you want : ");
//		userInput = scanner.nextLine();
//		while (true) 
//			if (userInput.equalsIgnoreCase(list[0]) || userInput.equalsIgnoreCase(subList[0])) 
//				System.out.println("You picked " + list[0] + " that will be $" + price[0] );
//			else if (userInput.equalsIgnoreCase(list[1]) || userInput.equalsIgnoreCase(subList[1]))
//				System.out.println("You picked " + list[1] + " that will be $" + price[1] );
//			else if (userInput.equalsIgnoreCase(list[2]) || userInput.equalsIgnoreCase(subList[2]))
//				System.out.println("You picked " + list[2] + " that will be $" + price[2] );
//			else if (userInput.equalsIgnoreCase(list[3]) || userInput.equalsIgnoreCase(subList[3]))
//				System.out.println("You picked " + list[3] + " that will be $" + price[3] );
//			else 
//				System.out.println("We don't have that please choose in the available list");
//				
//	
		}
	
	}


