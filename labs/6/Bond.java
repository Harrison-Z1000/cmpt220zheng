
package lab6;

public class Bond {
    // Specifies the amount of a coupon payment
    double coupon;
    
    // Specifies the number of coupon payments
    int payments;
    
    // Specifies the interest rate of the bond
    double interest;
    
    // Specifies the value at maturity
    double valueMaturity;
    
    // Creates a default bond
    public Bond() {
    }
    
    /** Creates a bond with the specified coupon, payments, interest, and value
    at maturity */
    public Bond(double coupon, int payments, double interest, double valueMaturity) {
        this.coupon = coupon;
        this.payments = payments;
        this.interest = interest;
        this.valueMaturity = valueMaturity;
    }
    
    // Calculates and returns the price of the bond
    public double getPrice() {
        double price = (coupon * (1 - (1 / Math.pow(1 + interest, payments)))) +
                (valueMaturity * (1 / Math.pow(1 + interest, payments)));
        return price;
    }
}
