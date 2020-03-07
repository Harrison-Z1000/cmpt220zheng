package lab5;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a two-dimensional array without any zeroes "
                + "(ex: 23 3, 5 55, 7 77 778): ");
        
        // Separate user's input by rows of their array
        String userNums = input.nextLine();
        String[] split1 = userNums.split(", ");
        
        // The number of values entered on the lower level of the array could 
        // vary so we will arbitrarily set it to 100.
        double[][] numArray = new double[split1.length][100];
        
        // Populate array with the user's input and convert from String to double
        for (int i = 0; i < split1.length; i++) {
            String[] split2 = split1[i].split(" ");
            for (int j = 0; j < split2.length; j++) {
                numArray[i][j] = Double.parseDouble(split2[j]);
            }
        }
        
        // Prompt user for row index and call on averageRow method
        System.out.println("Enter the index of the row that you would like to "
                + "find the average of: ");
        int rowIndex = input.nextInt();
        double average = averageRow(numArray, rowIndex);
        
        // Print the average
        System.out.println("The average of the values is " + average);
    }
    
    public static double averageRow(double[][] array, int row) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
            
            // Since we set the rows to be size 100, we have to find how many 
            // of them are actually filled.
            if (array[row][i] != 0) {
                count += 1;
            }
        }
        return (double) sum / count;
    }
}
