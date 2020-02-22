package lab3;

public class Exercise7 {

    public static void main(String[] args) {
        // Print the first 50 pentagonal numbers with 10 per line
        for (int n = 1; n <= 50; n++) {
            if (n % 10 == 0) {
                System.out.println(findPenta(n));
            }
            else {
                System.out.print(findPenta(n) + " ");
            }
        }
    }
    
    public static double findPenta(int n) {
        // Calculate and return nth pentagonal number
        return ((3 * n * n) - n) / 2;
    }
}
