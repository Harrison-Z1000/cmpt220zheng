package lab2;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        // The first digit generated will not be 0 or 1
        int first = (int)(Math.random() * ((9 - 2) + 1) + 2);
        
        // Call randNum function and print in format of phone number
        System.out.println("(" + first + randNum() + randNum() + ") " + 
                randNum() + randNum() + randNum() + "-" + 
                randNum() + randNum() + randNum() + randNum());
    }
    
    public static int randNum() {
        // Generate random number between 0 and 9
        int number = (int)(Math.random() * ((9 - 0) + 1) + 0);
        return number;
    }
}
