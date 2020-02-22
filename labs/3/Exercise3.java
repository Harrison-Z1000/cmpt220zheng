package lab3;

public class Exercise3 {

    public static void main(String[] args) {
        char character;
        for (int number = 1; number <= 100; number++) {
            // Convert ASCII code to corresponding character
            character = (char)number;
            
            // Print 20 characters per line
            if (number % 20 == 0) {
                System.out.println(character);
            }
            else {
                System.out.print(character + " ");
            }
        }
    }
    
}
