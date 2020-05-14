
package project2;

public class Turtle extends GUI{
    
    // Data fields capture the same info as columns in the database table
    private int id = 1001;
    private String species = "Red-Eared Slider";
    private double length = 30.25;
    private double weight = 0.819;
    private String shellTopPattern = "Striped";
    private String headPattern = "Striped";
    private String skinColor = "Dark Green";
    private String dateFound = "2020-03-20";
    private String notes = "It seemed to be in good health.";
    
    // No arg-constructor creates a sample Turtle object
    public Turtle() {
    }

    // Create a Turtle object with data provided by the user
    public Turtle(int id, String species, double length, double weight, 
            String shell, String head, String skin, String date, String notes) {
        this.id = id;
        this.species = species;
        this.length = length;
        this.weight = weight;
        this.shellTopPattern = shell;
        this.headPattern = head;
        this.skinColor = skin;
        this.dateFound = date;
        this.notes = notes;
    }

    // Return a turtle's ID
    public int getId() {
        return id;
    }

    // Change a turtle's ID
    public void setId(int id) {
        this.id = id;
    }

    // Return the species a turtle belongs to
    public String getSpecies() {
        return species;
    }

    // Change the species a turtle belongs to
    public void setSpecies(String species) {
        this.species = species;
    }

    // Return a turtle's length
    public double getLength() {
        return length;
    }

    // Change a turtle's length
    public void setLength(double length) {
        this.length = length;
    }

    // Return a turtle's weight
    public double getWeight() {
        return weight;
    }

    // Change a turtle's weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Return the pattern on a turtle's shell
    public String getShellTopPattern() {
        return shellTopPattern;
    }

    // Change the pattern on a turtle's shell
    public void setShellTopPattern(String shellTopPattern) {
        this.shellTopPattern = shellTopPattern;
    }

    // Return the pattern on a turtle's head
    public String getHeadPattern() {
        return headPattern;
    }

    // Change the pattern on a turtle's head
    public void setHeadPattern(String headPattern) {
        this.headPattern = headPattern;
    }

    // Return a turtle's skin color
    public String getSkinColor() {
        return skinColor;
    }

    // Change a turtle's skin color
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    // Return the date the user found the turtle
    public String getDateFound() {
        return dateFound;
    }

    // Change the date the user found the turtle
    public void setDateFound(String dateFound) {
        this.dateFound = dateFound;
    }

    // Return notes the user made on a turtle
    public String getNotes() {
        return notes;
    }

    // Change notes the user made on a turtle
    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Calculate a turtle's length in inches and weight in pounds
    public double[] convertUnits() {
        double[] arr = new double[2];
        arr[0] = length * 0.3937;
        arr[1] = weight * 2.2046;
        return arr;
    }
    
    // Return a string representation of a Turtle object
    @Override
    public String toString() {
        return "Information About Turtle \nID: " + id + "\nSpecies: " + species +
                "\nLength: " + length + " cm \nWeight: " + weight + 
                " kg \nShell Top Pattern: " + shellTopPattern +
                "\nHead Pattern: " + headPattern + "\nSkin Color: " + skinColor +
                "\nDate Found: " + dateFound + "\nNotes: " + notes;
    }
    
}
