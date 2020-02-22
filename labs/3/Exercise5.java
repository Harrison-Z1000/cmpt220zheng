package lab3;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter 3 numbers
        System.out.println("Enter a number: ");
        double first = input.nextDouble();
        System.out.println("Enter another number: ");
        double second = input.nextDouble();
        System.out.println("Enter another number: ");
        double third = input.nextDouble();
        
        // Print the average
        System.out.println("The average of the three numbers is " + 
                average(first, second, third));
    }
    
    public static double average(double a, double b, double c) {
        // Compute and return the average
        return (a + b + c) / 3;
    }
}
