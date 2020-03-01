package lab4;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of numbers separated by spaces: ");
        String str = input.nextLine();
        
        // Store the numbers in an array
        String[] numArray = str.split(" ");
        
        // Invoke modArray to get size of updated array
        int newSize = modArray(numArray, numArray.length);
        
        // Print updated array
        for (int i = 0; i < newSize; i++) {
           System.out.print(numArray[i] + " "); 
        }
    }

    public static int modArray(String[] numArray, int size) {
        // Create temporary array to store each unique value from the original
        String[] temp = new String[size]; 
        
        // Represents size of updated array
        int newSize = 0; 
        for (int i = 0; i < size - 1; i++) {
            // If a value is not equal to the next one, then add it to the 
            // temporary array
            if (!numArray[i].equals(numArray[i + 1])) {
                temp[newSize++] = numArray[i];
            }
        }
        // Add the last value to the temporary array
        temp[newSize++] = numArray[size - 1];    
        
        // Replace the original array with the updated one
        for (int i = 0; i < newSize; i++) 
            numArray[i] = temp[i]; 
       
        return newSize;
    }
}
