package lab3;

public class Exercise4 {

    public static void main(String[] args) {
        // Count backwards from 15,000 and check whether each integer is prime 
        // The first one to be prime will be the largest
        for (int n = 15000; n > 0; n--) {
            if (prime(n)) {
                System.out.println("The largest prime number that is also less "
                        + "than 15,000 is " + n);
                System.exit(0);
            }
        }
    }
    
    public static boolean prime(int n) {  
        // Divide n by integers 2 and greater to check that it has no other 
        // factors besides 1 and itself. Increment the divisor until reaching 
        // half of n since no number has whole number factors greater than half 
        // of itself.
        for (int i = 2; i < (n/2); i++) {  
            if (n % i == 0) {  
                return false;  
            }
        }
        return true;
    }  
}
