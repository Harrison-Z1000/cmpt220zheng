
package lab9;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for a binary string and store it
        System.out.println("Enter a binary string (1s and/or 0s): ");
        String binaryString = input.next();
        
        // Try converting binary string to decimal number and print the 
        // exception message if one is thrown
        try {
            int decNum = bin2Dec(binaryString);
            System.out.println("The decimal equivalent of " + binaryString + " is " + decNum);
        } 
        catch(NumberFormatException ex) {
            System.out.println(ex);
        }
    }

    // Convert binary string into decimal number and return it
    public static int bin2Dec (String binaryString) {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            // Throw an exception if the string is not a binary string
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1') {
                throw new NumberFormatException("Input is not a binary string!");
            }
            decimal += (binaryString.charAt(i) - '0') * Math.pow(2, binaryString.length()-1-i);
        }
        return decimal;
    }
}
