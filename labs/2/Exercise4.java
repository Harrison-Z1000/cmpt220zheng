package lab2;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
        // Prompt user to enter 2 characters and store them in variables
	System.out.print("Enter first character: ");
	char char1 = input.next().charAt(0);
	System.out.print("Enter second character: ");
	char char2 = input.next().charAt(0);
        
        // Adds 2 characters and prints the integer result
        System.out.println("Result is:" + (int)(char1 + char2));
    }
    
}
