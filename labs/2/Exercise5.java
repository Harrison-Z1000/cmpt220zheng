package lab2;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter 2 strings and store them in variables
	System.out.print("Enter first string: ");
	String str1 = input.next();
	System.out.print("Enter second string: ");
	String str2 = input.next();
        
        // Print the strings in ascending order lexicographically
        if (str1.charAt(0) < str2.charAt(0)) {
            System.out.println("In ascending order: ");
            System.out.println(str1);
            System.out.println(str2);
        }
        else {
            System.out.println("In ascending order: ");
            System.out.println(str2);
            System.out.println(str1);
        }
    }
    
}
