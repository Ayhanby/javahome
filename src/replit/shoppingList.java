package replit;

import java.util.Scanner;

public class shoppingList {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Item 1, count and its price:");
		String Item1 = scan.nextLine();
		int count1 = scan.nextInt();
	    double price1 = scan.nextDouble();

		
		System.out.println("Enter Item 2, count and its price:");
		String Item2 = scan.nextLine();
		
		int count2 = scan.nextInt();
		double price = scan.nextDouble();
		
		
		
		System.out.println("Enter Item 3, count and its price:");
		String Item3 = scan.nextLine();
		int count3 = scan.nextInt();
		double price3 = scan.nextDouble();
		
		double totalPrice = 0;
		String report = "";
		
		if (count1>0) {
			report = 
		}
		
		/*
		 * -Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values. 

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)


-calculate totalPrice for all items only if the item's count is more than 0!

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"

		 */
	}

}
