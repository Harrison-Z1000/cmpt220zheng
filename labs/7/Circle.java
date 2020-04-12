
package lab7;

public class Circle {
    // Specify the center of a circle object
    private double x;
    private double y;
    
    // Specify the radius of a circle object
    private double radius;

    // Creates a Circle with default dimensions
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    
    // Creates a Circle object with the specified center and radius
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods for x, y, and radius
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }

    // Returns the area of a circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Returns the perimeter of a circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Checks if the specified point (x, y) is inside this circle
    public boolean contains(double x, double y) {
        if (Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2 ) < 
                Math.pow(this.radius, 2)){
            return true;
        }
        return false;
    }
    
    // Checks if the specified circle is inside this circle
    public boolean contains (Circle circle) {
        double distance = Math.sqrt((Math.pow(circle.getX() - this.getX(), 2) + 
                (Math.pow(circle.getY() - this.getY(), 2))));
        if (this.getRadius() > (distance + circle.getRadius())) {
            return true;
        }
        return false;
    }
    
    // Checks if the specified circle overlaps with this circle
    public boolean overLaps(Circle circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + 
                (Math.pow(circle.getY() - y, 2)));
        double minimum = Math.max(circle.getRadius(),this.radius) - 
                Math.min(circle.getRadius(),this.radius);
        if (distance <= (this.radius + circle.getRadius())) {
            if (distance >= minimum) {
                return true;
            }
        }
        return false;
    }
}
