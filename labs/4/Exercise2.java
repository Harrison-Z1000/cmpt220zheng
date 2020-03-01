package lab4;

import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {
        // Method for generating random number
        Random rand = new Random();
        int count = 0;
        
        // Print random characters with five per line
        for (int i = 0; i < 25; i++) {
            char ch = (char) (rand.nextInt(26) + 'a');
            System.out.print(ch + " ");
            count += 1;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }    
}
