package lab3;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
	// Create scanner and prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some positive integers, ending with a 0: ");
        
        // Initialize all necessary variables
        int number;
        int evenNums = 0;
        int sum = 0;
        int count = 0;
        double average = 0;
        
        // Perform various calculations on the numbers entered
        while ((number = input.nextInt()) != 0) {
            count += 1;
            if (number % 2 == 0) {
                evenNums += 1;
            }
            sum += number;
            average = (double) sum / count;
        }
        
        // Print the results of the calculations
        System.out.println("The number of even numbers: " + evenNums);
        System.out.println("The total sum: " + sum);
        System.out.println("The average is: " + average);
    }
    
}
