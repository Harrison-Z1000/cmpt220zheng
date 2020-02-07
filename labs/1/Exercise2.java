
public class Exercise2 {
	
	public static void main(String[] args) {
		// Assigns part of the formula in Exercise 2 to a variable
		double fractions = 1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11);
		
		// Computes two approximations of Pi and prints results
		System.out.print("4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)) = ");
		System.out.println(4 * fractions);
		System.out.print("4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)) = ");
		System.out.println(4 * (fractions + (1.0 / 13)));
	}
}
