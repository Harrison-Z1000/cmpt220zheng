
package lab8;

public class Exercise1 {

    public static void main(String args[]){
        // Create a Rodent array and fill it with instances of different types
        Rodent r[] = {new Rodent(), new Mouse(), new Gerbil(), new Hamster()};

        // Call base class methods for each element
        for (Rodent i : r) {
            i.eat();
            i.run();
        }
    }
    
    // Rodent is the base class
    public static class Rodent {
        // Some methods that are common to all rodents
        void eat() {
            System.out.println("The rodent eats whatever it can find.");
        }
        void run() {
            System.out.println("The rodent runs fast!");
        }
    }

    // Mouse is a subclass of Rodent
    public static class Mouse extends Rodent {
        // Override methods in base class
        void eat(){
            System.out.println("The mouse eats cheese.");
        }
        void run(){
            System.out.println("The mouse runs at 7 MPH!");
        }
    }

    // Gerbil is a subclass of Rodent
    public static class Gerbil extends Rodent{
        // Override methods in base class
        void eat(){
            System.out.println("The gerbil eats fruit.");
        }
        void run(){
            System.out.println("The gerbil runs at 6 MPH!");
        }
    }

    // Hamster is a subclass of Rodent
    public static class Hamster extends Rodent{
        // Override methods in base class
        void eat(){
            System.out.println("The hamster eats seeds.");
        }
        void run(){
            System.out.println("The hamster runs at 5 MPH!");
        }
    }
}
