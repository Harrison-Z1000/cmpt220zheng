
package lab9;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter three side lengths for a triangle
        System.out.println("Enter the length of triangle side A: ");
        double sideA = input.nextDouble();
        System.out.println("Enter the length of triangle side B: ");
        double sideB = input.nextDouble();
        System.out.println("Enter the length of triangle side C: ");
        double sideC = input.nextDouble();
        
        // Try creating a Triangle object and print the exception message if 
        // one is thrown
        try {
            Triangle t = new Triangle (sideA, sideB, sideC);
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static class Triangle {
        // Store the side lengths of a triangle
        private double sideA = 1.0;
        private double sideB = 1.0;
        private double sideC = 1.0;
        
        public Triangle() {
        }
        
        public Triangle(double sideA, double sideB, double sideC) 
                throws IllegalTriangleException {
            // Check if the user is trying to create a triangle with sides that 
            // violate the rule
            if (sideA + sideB <= sideC || sideB + sideC <= sideA || 
                    sideA + sideC <= sideB) {
                throw new IllegalTriangleException();
            }
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            System.out.println("Triangle object was successfully created!");
        }
    }
    
    public static class IllegalTriangleException extends Exception {
        public IllegalTriangleException() {
            // Invoke the superclass's constructor with a message
            super("Illegal Triangle Exception: The sum of any two sides in a "
                    + "triangle must be greater than the other.");
        }
    }
}
