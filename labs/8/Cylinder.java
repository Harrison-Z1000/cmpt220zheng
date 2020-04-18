
package lab8;

// Cylinder is a subclass of the Circle class
public class Cylinder extends Circle {
    // Store the height of a Cylinder object
    private double height = 1.0;
    
    // Constructor methods that create Cylinder objects
    public Cylinder() {
    }
    public Cylinder(double radius) {
        // Since radius is a data field in the Circle class, its setter method 
        // is used to change its value here
        setRadius(radius);
    }
    public Cylinder(double radius, double height) {
        setRadius(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        setRadius(radius);
        this.height = height;
        setColor(color);
    }
    
    // Return a cylinder's height
    public double getHeight() {
        return height;
    }
    
    // Change a cylinder's height
    public void setHeight(double height) {
        this.height = height;
    }
    
    // Return a cylinder's volume
    public double getVolume() {
        return getArea() * height;
    }
}
