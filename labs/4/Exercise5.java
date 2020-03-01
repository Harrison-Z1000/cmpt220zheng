package lab4;

import java.util.Random;

public class Exercise5 {
    
    public static void main(String[] arg) {
        Random rand = new Random();
        int[] randInts = new int [1000];
        int sum = 0;
        
        // Add random integers to the running sum and store them in the array
        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt();
            sum += num;
            randInts[i] = num;
        }
        
        double average = (double) sum / 1000;
        int lower = 0;
        int higher = 0;
        
        // Count number of values from the array that are lower than average 
        // and number of values that are higher
        for (int j = 0; j < 1000; j++) {
            if (randInts[j] < average) {
                lower += 1;
            }
            else if (randInts[j] > average) {
                higher += 1;
            }
        }
        
        // Print the average and counts
        System.out.println(lower + " numbers in the list are lower than the "
                + "list average of " + average);
        System.out.println(higher + " numbers in the list are higher than the "
                + "list average of " + average);
    }
}
