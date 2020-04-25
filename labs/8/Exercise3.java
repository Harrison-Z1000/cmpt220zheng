
package lab8;

public class Exercise3 {

    public static void main(String[] arg) {
        // Create instances of each shape and display their string 
        // representations and areas
        Sphere s = new Sphere (10, "Sphere s");
        System.out.println(s.toString());
        System.out.println("You would need " + s.area() + 
                " square units of paint to cover this sphere.");
        Rectangle r = new Rectangle(12, 21, "Rectangle r");
        System.out.println(r.toString());
        System.out.println("You would need " + r.area() + 
                " square units of paint to cover this rectangle.");
        Cylinder c = new Cylinder(5, 10, "Cylinder c");
        System.out.println(c.toString());
        System.out.println("You would need " + c.area() + 
                " square units of paint to cover this cylinder. ");
    }
    
    // Shape is the base class
    public abstract class Shape {
        private String shapeName;

        // Create an instance of Shape with the specified name
        public void setShapeName (String shapeName) {
            this.shapeName = shapeName;
        }
        
        public String getShapeName () {
            return shapeName;
        }
        
        public abstract double area();
        
        // Return string representation of Shape object
        @Override
        public String toString() {
            return "The shape's name is " + shapeName;
        }
    }

    // Sphere is a subclass of Shape
    class Sphere extends Shape {
        private double radius;

        // Create an instance of Sphere with the specified attributes
        public Sphere () {
        }
        public Sphere (double radius) {
            this.radius = radius;
        }
        public Sphere (double radius, String shapeName) {
            this.radius = radius;
            setShapeName(shapeName);
        }

        // Return the surface area of the sphere
        public double area() {
            return 4 * Math.PI * radius * radius;
        }
        
        // Return string representation of Sphere object
        @Override
        public String toString() {
            return getShapeName() + " has a radius of " + radius;
        }
    }
    
    // Rectangle is a subclass of Shape
    class Rectangle extends Shape {
        private double length;
        private double width;

        // Create an instance of Rectangle with the specified attributes
        public Rectangle() {
        }
        public Rectangle (double length, double width) {
            this.length = length;
            this.width = width;
        }
        public Rectangle (double length, double width, String shapeName) {
            this.length = length;
            this.width = width;
            setShapeName(shapeName);
        }
        
        // Return the area of the rectangle
        public double area() {
            return length * width;
        }
        
        // Return string representation of Rectangle object
        @Override
        public String toString() {
            return getShapeName() + " has a length of " + length + 
                    " and a width of " + width;
        }
    }
    
    // Cylinder is a subclass of Shape
    class Cylinder extends Shape{
        private double radius;
        private double height;

        // Create an instance of Cylinder with the specified attributes
        public Cylinder() {
        }
        public Cylinder (double radius, double height) {
            this.radius = radius;
            this.height = height;
        }
        public Cylinder(double radius, double height, String shapeName) {
            this.radius = radius;
            this.height = height;
            setShapeName(shapeName);
        }

        // Return the surface area of the cylinder
        public double area() {
            return Math.PI * radius * radius * height;
        }
        
        // Return string representation of Cylinder object
        @Override
        public String toString() {
            return getShapeName() + " has a radius of " + radius + 
                    " and a height of " + height;
        }
    }
}
