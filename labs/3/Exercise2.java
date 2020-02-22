package lab3;

public class Exercise2 {

    public static void main(String[] args) {
        // Keep track of how many numbers have satisfied the condition
        int count = 0;
        
        for (int num = 100; num <= 500; num++) {
            // Find all numbers from 100 to 500 divisible by 5 or 7 but not both.
            if ((num % 5 == 0 && num % 7 != 0) || (num % 5 != 0 && num % 7 == 0)) {
                count += 1;
                // Print 10 numbers on each line.
                if (count % 10 == 0) {
                    System.out.println(num);
                }
                else {
                    System.out.print(num + " ");
                }
            }
        }
    }
    
}
