package lab5;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter size of arrays and create two of that size
        System.out.print("Enter length of arrays (same for two): ");
        int arrLength = input.nextInt();
        int[] array1 = new int[arrLength];
        int [] array2 = new int[arrLength];
        
        // User enters values for the first array
        System.out.println("First array");
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter a value: ");
            array1[i] = input.nextInt();
        }

        // User enters values for the second array
        System.out.println("Second array");
        for (int j = 0; j < arrLength; j++) {
            System.out.print("Enter a value: ");
            array2[j] = input.nextInt();
        }
        
        // Print whether the arrays are identical
        if (equal(array1, array2)) {
            System.out.println("The two arrays are identical");
        }
        else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equal(int[] x, int[] y) {
        // Sort the arrays and determine if they are identical
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }
}