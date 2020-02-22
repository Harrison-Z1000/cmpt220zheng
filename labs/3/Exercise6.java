package lab3;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for a string
        System.out.println("Enter a string of words: ");
        String words = input.nextLine();
        
        // Print the number of vowels in the string
        System.out.println("Your string has " + vowels(words) + " vowels.");
    }
    
    public static int vowels(String words) {
        // Create array that holds all the vowels
        char[] vowelArr = {'a', 'e', 'i', 'o', 'u'};
        
        // Initialize counter variable
        int count = 0;
        
        // Compare character to vowels for all characters in input and count
        // number of matches
        for (int i = 0; i < words.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (words.charAt(i) == vowelArr[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
