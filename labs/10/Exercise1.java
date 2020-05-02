
package lab10;
import java.util.*;
import java.io.*;

public class Exercise1 {

    public static void main(String[] args) throws Exception {
        // Check if the file already exists
        File f = new File("Exercise10_1.txt");
        if (f.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
            // Create a Printwriter for output
            PrintWriter output = new PrintWriter(f);
        ) {
            // Write 100 randomly created integers into the file
            for (int i = 0; i < 100; i++) {
                output.print(((int)(Math.random() * 100) + 1) + " ");
            }
        }

        // Create an arraylist
        ArrayList<Integer> arr = new ArrayList<>();

        try (
            // Create a Scanner for input
            Scanner input = new Scanner(f);
        ) {
            // Read the data back from the file
            while (input.hasNext()) {
                arr.add(input.nextInt());
            }
        }

        // Sort the arraylist in ascending order
        Collections.sort(arr);

        // Display data from the sorted arraylist
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0 || i % 10 != 0) {
                System.out.print(arr.get(i) + " ");
            } 
            else {
                System.out.println(arr.get(i));
            }
        }
    }
}
