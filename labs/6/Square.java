
package lab6;

public class Square {
    // Data field that specifies the width of the square
    double width = 1.0;
    
    // No-arg constructor that creates a default square
    public Square() {
    }

    // Constructor that creates a square with the specified width
    public Square(double width) {
        this.width = width;
    }
    
    // Returns the area of the square
    public double getArea() {
        return width * width;
    }
    
    // Returns the perimeter
    public double getPerimeter() {
        return 4 * width;
    }
}
