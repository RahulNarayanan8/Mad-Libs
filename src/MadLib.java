
import java.util.Scanner;
public class MadLib
	{

		public static void main(String[] args) 
		{
			Scanner madlib = new Scanner (System.in);
			System.out.print("Enter a male name: ");
			String maleName = madlib.nextLine();
			System.out.print("Enter a store name: ");
			String storeName = madlib.nextLine();
			System.out.print("Enter a food: ");
			String food = madlib.nextLine();
			System.out.print("Enter an animal: ");
			String animal = madlib.nextLine();
			System.out.print("Enter an adjective ending in y: ");
			String adjective = madlib.nextLine();
			System.out.print("Enter a body part: ");
			String bodyPart = madlib.nextLine();
			System.out.print("Enter a country: ");
			String country = madlib.nextLine();
			System.out.print("Enter a piece of furniture: ");
			String furniture = madlib.nextLine();
			System.out.print("Enter an airline: ");
			String airline = madlib.nextLine();
			System.out.print("Enter a second country: ");
			String secondCountry = madlib.nextLine();
			
			
			System.out.println("There was once a man named " + maleName + ". He went to " + storeName + " to buy some " + food + ".");
			System.out.println(" Whilst at the store, he saw a " + animal + " which was very " + adjective + " and was missing a ");
			System.out.println(bodyPart + ". He took the animal back to his home in " + country  + " and it ate his new " + furniture + ".");
			System.out.println(" In order to escape the dog, he flew to "  + secondCountry + " by using the services of " + airline);
			
			

		}

	}


