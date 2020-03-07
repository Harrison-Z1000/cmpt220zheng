package lab5;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Get the number of students and create an array of that length
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        String[] students = new String[numStudents];
        
        // Get students' scores and names and store them in the array
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter a score and the name of the student who "
                    + "earned the score (ex: 85 Joseph): ");
            input.nextLine();
            students[i] = input.nextLine();
        }
        
        // Sort the list of students by score
        Arrays.sort(students);
        
        // Print the sorted list
        System.out.println("List of students sorted by score: ");
        for (int j = 0; j < students.length; j++) {
            System.out.println(students[j]);
        }
    }
}