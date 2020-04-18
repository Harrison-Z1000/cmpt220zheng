
package lab8;

public class Circle {
    // Store the radius and color of a Circle object
    private double radius = 1.0;
    private String color = "red";
    
    // Constructor methods that create Circle objects
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    // Return a circle's radius
    public double getRadius() {
        return radius;
    }
    
    // Change a circle's radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Return a circle's color
    public String getColor() {
        return color;
    }
    
    // Change a circle's color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Return a circle's area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    // Return a string representation of a Circle object
    @Override
    public String toString() {
        return "Circle[Radius=" + radius + ", Color=" + color + "]";
    }
}
