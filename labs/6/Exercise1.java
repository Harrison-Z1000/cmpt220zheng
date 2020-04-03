
package lab6;

public class Exercise1 {

    public static void main(String[] args) {
        // Creates Square object and prints its properties
        Square square1 = new Square(40);
        System.out.println("Width of Square 1: " + square1.width +
                "\nArea of Square 1: " + square1.getArea() + 
                "\nPerimeter of Square 1: " + square1.getPerimeter());
        
        // Creates another Square object and prints its properties
        Square square2 = new Square(35.9);
        System.out.println("\nWidth of Square 2: " + square2.width +
                "\nArea of Square 2: " + square2.getArea() + 
                "\nPerimeter of Square 2: " + square2.getPerimeter());
    }
}
