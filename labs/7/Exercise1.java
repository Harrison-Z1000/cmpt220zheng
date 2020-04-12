
package lab7;

public class Exercise1 {

    public static void main(String[] args){
        // Create 3 instances of MyLong
        MyLong long1 = new MyLong(123456);
        MyLong long2 = new MyLong(-56);
        MyLong long3 = new MyLong(2);
        
        // Test all methods in MyLong class and display results 
        System.out.printf("%d is even? %s%n",long1.getValue(),long1.isEven());
        System.out.printf("%d is odd? %s%n",long2.getValue(),long2.isOdd());
        System.out.printf("%d is prime? %s%n",long3.getValue(),long3.isPrime());
        System.out.printf("%d equals %d? %s%n",long1.getValue(),long2.getValue(),long1.equals(long2));
        System.out.println(MyLong.parseInt(new char[] {'1', '2', '3', '4', '5'}));
        System.out.println(MyLong.parseInt("101010"));
    }
}
