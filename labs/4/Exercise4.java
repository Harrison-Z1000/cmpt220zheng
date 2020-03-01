package lab4;

import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        
        // Keep track of characters that have been checked for
        String temp = "";
        
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            char ch = str.charAt(i);
            
            // Check whether the character is in the alphabet
            if (Character.isAlphabetic(ch)) {
                for (int j = 0; j < str.length(); j++){
                    if(ch == str.charAt(j)) {
                        count++;
                    }
                }
                
                // Print the count of the character if it has not been printed yet
                if (!temp.contains(ch + "")) {
                    System.out.println(ch + ": " + count);
                    temp += ch;
                }
            }
        }
    }
}
