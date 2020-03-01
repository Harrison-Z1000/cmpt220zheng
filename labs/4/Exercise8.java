package lab4;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of positive real numbers and enter 0 at the end): ");
        String numSequence = input.nextLine();
        
        // Store entered numbers in an array
        String[] numArray = numSequence.split("");
        
        // Sort array from smallest to largest
        Arrays.sort(numArray);
        
        // Ignore the first index when printing if user entered 0
        for (int i = 1; i < numArray.length; i++) {
            if (!numArray[i].equals("0")) {
                System.out.print(numArray[i] + " ");
            }
        }
    }
}