package lab5;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create array for storing user inputs
        double[] nums = new double[10];
        System.out.println("Enter 10 numbers separated by spaces: ");
        
        // Store each number in the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextDouble();
        }
        
        // Print the maximum value
        System.out.println("The largest number is " + max(nums));
    }
    
    public static double max(double[] array) {
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Return the last value since it will be the largest in the list
        return array[array.length-1];
    }
}
