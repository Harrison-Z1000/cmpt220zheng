
package lab6;

public class Exercise2 {

    public static void main(String[] args) {
        // Creates Bond object and prints its price
        Bond testBond = new Bond(500, 100, 0.05, 10000);
        System.out.println("Price of bond: $" + Math.round(testBond.getPrice() * 100.0) / 100.0);
    }
}
