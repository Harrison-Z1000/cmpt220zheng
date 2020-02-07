import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// Create a scanner for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user 
		System.out.print("Enter a value in ounces: ");
		
		// Assign the input in ounces
		double ounces = input.nextDouble();
		
		// Compute and print the value in grams
		System.out.println(ounces + " ounces is " + 28.3495 * ounces + " grams.");
	}
}
