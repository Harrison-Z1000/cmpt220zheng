package lab5;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter the size of the matrix and create an array from it
        System.out.print("Enter the size of the matrix: ");
        int dimension = input.nextInt();
        int[][] matrix = new int[dimension][dimension];
        
        // Ask user to fill in the cells of the original matrix
        System.out.println("Enter the numbers in the matrix from left to right, top to bottom.");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("Enter a number: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Print the matrix with values entered by the user
        System.out.println("Original Matrix:");
        for (int i = 0; i < dimension; i++) {
            int count = 0;
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + "  ");
                count += 1;
                if (count == dimension) {
                    System.out.println();
                }
            }
            }
        
        System.out.println("========================");
        
        // Print the transposed matrix
        System.out.println("Transpose of the Original Matrix:");
        for (int i = 0; i < dimension; i++) {
            int count = 0;
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[j][i] + "  ");
                count += 1;
                if (count == dimension) {
                    System.out.println();
                }
            }
        }
    }    
}
