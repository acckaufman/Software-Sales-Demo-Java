package chapter4;

/*Amanda Kaufman
Chapter 4
Programming Challenge 4
SoftwareSalesDemo Class
This class demonstrates the SoftwareSales class.
*/

import java.util.Scanner;

class SoftwareSalesDemo
{
	public static void main (String[] args)
	{
		int quantitySold;		//Get the number of software units sold from the user
		double costPerUnit;		//Get the cost per unit from the user
		String input;			//Variables used to ask the user if they want to run the program again
		char again;
		
		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Header
		System.out.print("Software Sales Calculator\n------------------------------\n\n");
		
		do {
			//Get the number of units sold from the user.
			System.out.print("How many units were sold? ");
			quantitySold = keyboard.nextInt();
			
			//Validate the input.
			while (quantitySold < 1)
			{
				System.out.print("Error! You must enter a quantity greater than 0.  Please try again.\n");
				System.out.print("How many units were sold? ");
				quantitySold = keyboard.nextInt();
			}
			
			//Get the cost per unit from the user.
			System.out.print("\nWhat is the cost per unit? ");
			costPerUnit = keyboard.nextDouble();
			
			//Validate the input.
			while (costPerUnit < 0.01)
			{
				System.out.print("Error! You must enter a cost greater than 0.  Please try again.\n");
				System.out.print("What is the cost per unit?" );
				costPerUnit = keyboard.nextDouble();
			}
			
			//Create a SoftwareSales object and initialize it with the user's input.
			SoftwareSales purchase = new SoftwareSales(quantitySold, costPerUnit);
			
			//Tell the user what the discount is on the purchase based on number of units sold.
			purchase.printDiscount();
			
			//Tell the user the total cost of the purchase, using the getTotalCost() function.
			System.out.printf("The total cost of the purchase is $%,.2f.\n\n", purchase.getTotalCost());
			
			//Clear any extra input from the keyboard buffer.
			keyboard.nextLine();
			
			//Ask the user if they would like to run the program again.
			System.out.print("Would you like to calculate another purchase total? (y/n) ");
			input = keyboard.nextLine();
			again = input.charAt(0);
		} while (again == 'y' || again == 'Y');	//Repeat the program until the user enters 'n' or another key
		
		//Close the keyboard resource.
		keyboard.close();
		
		//Terminate the program gracefully with a message
		System.out.print("\nThank you for using this program!\n");
	}
}