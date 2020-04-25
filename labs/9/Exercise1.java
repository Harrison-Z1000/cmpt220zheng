
package lab9;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Invoke getArray and store the generated array 
        int[] array = getArray();

        // Ask user to enter an array index and displays its value
        System.out.print("Enter an array index: ");
        try {
            System.out.println("The value at this index is " + 
                    array[input.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
    
    // Return an array of 100 random integers
    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }
        return array;
    }
}
