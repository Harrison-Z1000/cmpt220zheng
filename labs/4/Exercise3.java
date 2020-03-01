package lab4;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        
        // Call reverse method to reverse the input
        String revStr = reverse(str);
        String revResult = isPalindrome(str, revStr);
        System.out.println("Your string in reverse is " + revStr + ". " + revResult);
    }
    
    public static String reverse(String s) {
        String rev = "";
        
        // Read user string from right to left and add each character
        // to the reverse string
        for (int i = s.length(); i > 0; i--) {
             rev = rev + s.charAt(i-1);
        }
        return rev;
    }
    
    public static String isPalindrome(String s, String rev) {
        // Compare orginal and reversed strings to see if it is a palindrom
        if (s.equals(rev)) {
            String result = "Your string is a palindrome.";
            return result;
        }
        String result = "Your string is not a palindrome.";
        return result;
    }
}
