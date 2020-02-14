package lab2;

import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args) {
        // Create a scanner for user input
	Scanner input = new Scanner(System.in);
        
        // Prompt the user 
	System.out.print("Enter a number (1-12) for a month: ");
        
        // Assign the input to number variable
	int number = input.nextInt();
        
        // Initiate month variable
        String month;
        
        // Determine the corresponding month and print it
        switch (number) {
        case 1:
            month = "January";
            break;
        case 2:
            month = "February";
            break;
        case 3:
            month = "March";
            break;    
        case 4:
            month = "April";
            break;
        case 5:
            month = "May";
            break;
        case 6:
            month = "June";
            break;
        case 7:
            month = "July";
            break;
        case 8:
            month = "August";
            break;
        case 9:
            month = "September";
            break;
        case 10:
            month = "October";
            break;    
        case 11:
            month = "November";
            break;
        case 12:
            month = "December";
            break;
        default:
            month = "Invalid Number";
            break;
        }
        System.out.println(month);
    }
}
