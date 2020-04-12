
package lab7;

public class Exercise3 {

    public static void main(String[] args) {
        // Create an instance of Circle
        Circle c1 = new Circle(2, 2, 5.5);
        
        // Test methods in Circle class and display results 
        System.out.println("Area of c1: " + Math.round(c1.getArea()* 100.0) / 100.0);
        System.out.println("Perimeter of c1: " + Math.round(c1.getPerimeter()* 100.0) / 100.0) ;
        System.out.println("c1 contains the point (3, 3): " + c1.contains(3, 3));
        System.out.println("c1 contains a circle with its center at (4, 5) and "
                + "a radius of 10.5: " + c1.contains(new Circle(4, 5, 10.5)));
        System.out.println("c1 overlaps with a circle that's centered at (3, 5) "
                + "and has a radius of 2.3: " + c1.overLaps(new Circle(3, 5, 2.3)));
    }
    
}
