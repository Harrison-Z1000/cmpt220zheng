
package lab10;
import java.io.*;
import java.util.*;

public class ReplaceText {

    public static void main(String[] args) throws Exception {          
        // Check command-line parameter usage
        if (args.length != 3) {
            System.out.println(
            "Usage: java ReplaceText fileName oldStr newStr");
            System.exit(1);
        }
        
        // Check if the file exists
        File f = new File(args[0]);
        if (!f.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }
        
        // Create an arraylist
	ArrayList<String> arr = new ArrayList<>();
        
        try (
            // Create a Scanner for input
            Scanner input = new Scanner(f);
        ) {
            // Replace oldString with newString and temporarily store the 
            // changes in the arraylist
            while (input.hasNext()) {
                String s = input.nextLine();
                arr.add(s.replaceAll(args[1], args[2]));
            }
        }

        try (
            // Create a Printwriter for output
            PrintWriter output = new PrintWriter(f);
        ) {
            // Write the changes into the original file
            for (int i = 0; i < arr.size(); i++) {
                output.println(arr.get(i));
            }
        }
    }  
}
