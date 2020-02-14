package lab2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        // Create a scanner for user input
	Scanner input = new Scanner(System.in);
        
        // Prompt the user 
	System.out.print("Enter a lower limit integer: ");
		
	// Assign the input to the lower limit variable
	int lowerLimit = input.nextInt();

	System.out.print("Enter an upper limit integer: ");
	int upperLimit = input.nextInt();
        
        if (lowerLimit < upperLimit) {
            for (int i = 1; i <= 3; i++) {
                
                // Generate 3 random numbers using the following equation
                int random = (int)(Math.random() * ((upperLimit - lowerLimit) + 1) + lowerLimit);
                System.out.println("Random integer " + i + ": " + random);
                
            }
        }    
        else {
            System.out.println("Lower limit must be an integer less than upper limit!");
        }
    
    }
    
}
