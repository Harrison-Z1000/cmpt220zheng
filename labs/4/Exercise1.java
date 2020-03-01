package lab4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise1 {

    public static void main(String[] args) {
        // Format the style of the output
        DecimalFormat decFormat = new DecimalFormat("#.##");
        
        // Round decimals up in positive direction
        decFormat.setRoundingMode(RoundingMode.CEILING);
        int inch = 1;
        double cent1 = (inch + 1.54);
        double cent = cent1;
        int cm = 1;
        double in = (cm / 2.54);
        System.out.print("in          cm | cm          in \n"
                + "--------------------------------\n");
        
        // Print 50 rows of conversions in both directions
        for (int i = 0; i < 50; i++) {
            System.out.println(inch + "       " + decFormat.format(cent) +   "  |  "
                    + decFormat.format(cm)   + "     " + decFormat.format(in));
            cent += 2.54;
            inch++;
            cm = cm + 5; 
            in = cm / 2.54;
        }
    }
}
