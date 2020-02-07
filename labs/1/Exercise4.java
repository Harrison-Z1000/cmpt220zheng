import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		// Create a scanner for user input
		Scanner input = new Scanner(System.in);

		// Prompt the user 
		System.out.print("Enter a value for mass (in kg): ");
				
		// Assign the input to mass
		double mass = input.nextDouble();
				
		// Calculate the energy of the object
		double energy = mass * 299972458 * 299972458;
		
		// Print the amount of energy in the object
		System.out.println("The object has " + energy + " (kg*m)/s of energy.");
	}
}
