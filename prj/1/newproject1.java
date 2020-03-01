package project1;

import java.util.Scanner;
import java.util.Arrays;

public class newproject1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        
        for (int caseNum = 0; caseNum < cases; caseNum++){
            int entries = input.nextInt();
            String [] completeNames = new String [entries];
            // Bring cursor to end of line with number of entries
            input.nextLine();
            for (int j = 0; j < entries; j++){
                completeNames[j] = input.nextLine();
            }
            String [] finalArray = new String [entries];
            for (int k = 0; k < completeNames.length; k++){
                 // Take string and split it into name, class, and word "class"
                String[] split1 = completeNames[k].split(" ");
                // Take class and split it into individual rankings
                String[] split2 = split1[1].split("-");
                String numRank = storeEntry(split2);
                // Make sure string has length 10, if any blanks then add 1
                numRank = String.format("%-10s", numRank ).replace(' ', '1');
                numRank = numRank + ":" + split1[0].substring(0, split1[0].length() - 1);
                finalArray[k] = numRank;
            }
            // Sort array by ranking and print just the names
            Arrays.sort(finalArray);
            for (int l = 0; l < finalArray.length; l++){
                String split3[] = finalArray[l].split(":");
                System.out.println(split3[1]);
            }
            System.out.println("=============================="); 
        }
    }
    
    public static String storeEntry(String [] split2){
        String numRank = "";
        // Store rankings as a number
        for (int i = split2.length - 1; i >= 0; i--){
            if(split2[i].equals("upper")) {
                numRank = numRank + "0";
            }
            else if(split2[i].equals("middle")) {
                numRank = numRank + "1";
            }
            else {
                numRank = numRank + "2";
            }

        }
        return numRank;
    }
}
