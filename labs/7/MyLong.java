
package lab7;

public class MyLong {
    // Stores the value represented by an object of this class
    public long value;

    // Creates a MyLong object for the specified long value
    public MyLong(long value) {
        this.value = value;
    }

    // Getter method that returns the long value
    public long getValue() {
        return value;
    }

    // Checks whether value is even
    public boolean isEven() {
        return value % 2 == 0;
    }
    
    // Checks whether value is odd
    public boolean isOdd() {
        return value % 2 == 1;
    }
    
    // Checks whether value is prime
    public boolean isPrime() {
        if (value == 1 || value == 2) {
            return true;
        } else {
            for (long i = 2; i < value; i++) {
                if (i % value == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Check if a long value is even, odd, and prime
    public static boolean isEven(long value) {
        return (value % 2) == 0;
    }
    public static boolean isOdd(long value) {
        return (value % 2) == 1;
    }
    public static boolean isPrime(long value) {
        if (value == 1 || value == 2) {
            return true;
        }
        else {
            for (long i = 2; i < value; i++) {
                if (i % value == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Check if the value in a MyLong object is even, odd, and prime
    public static boolean isEven(MyLong value) {
        return value.isEven();
    }
    public static boolean isOdd(MyLong value) {
        return value.isOdd();
    }
    public static boolean isPrime(MyLong value) {
        return value.isPrime();
    }
    
    // Check if the value in the object is equal to the specified value
    public boolean equals(int value) {
        if (value == this.value) {
            return true;
        } 
        return false;
    }
    public boolean equals(MyLong num) {
        if (num.value == this.value) {
            return true;
        }
        return false;
    }

    // Converts an array of numeric characters to a long value
    public static long parseInt(char[] array) {
        int value = 0;
        for (char i : array) {
            value += Character.getNumericValue(i);
        }
        return value;
    }

    // Converts a string into a long value
    public static long parseInt(String value) {
        return Integer.parseInt(value);
    }
}
