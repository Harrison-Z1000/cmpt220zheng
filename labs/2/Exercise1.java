package lab2;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        // Create a scanner for user input
	Scanner input = new Scanner(System.in);
        
        // Prompt the user 
	System.out.print("Enter a number: ");
		
	// Assign the input to number1
	double number1 = input.nextDouble();

	System.out.print("Enter a second number: ");
	double number2 = input.nextDouble();
        
        // Assign the result of the statement to a boolean variable
        boolean a = number1 < number2;
        
        // Print the result in a sentence
        System.out.println(number1 + " is less than " + number2 + "? " + a);
        
        a = number1 <= number2;
        System.out.println(number1 + " is less than OR equal to " + number2 + "? " + a);
        
        a = number1 == number2;
        System.out.println(number1 + " is equal to " + number2 + "? " + a);
        
        a = number1 != number2;
        System.out.println(number1 + " is NOT equal to " + number2 + "? " + a);
        
        a = number1 > number2;
        System.out.println(number1 + " is greater than " + number2 + "? " + a);
        
        a = number1 >= number2;
        System.out.println(number1 + " is greater than OR equal to " + number2 + "? " + a);
    }
    
}
