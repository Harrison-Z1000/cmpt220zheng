package lab4;

public class Exercise6 {

    public static void main(String[] args) {
        // Create an array for storing numbers
        int[] arrayOfNums = new int [20];
        
        // Fill array by adding numbers to the end
        arrayOfNums = addAtEnd(arrayOfNums);
        
        // Fill array by adding numbers at specific positions
        int num = 10; 
	int pos = 3;
        arrayOfNums = addAtPos(arrayOfNums, num, pos); 
        num = 100; 
	pos = 7;
        arrayOfNums = addAtPos(arrayOfNums, num, pos); 
        System.out.println("\nNew array: ");
        
        // Print updated array
        for (int i = 0; i < 13; i++) {
            if (i < 12) {
                System.out.print(arrayOfNums[i] + ", ");
            }
            else {
                System.out.println(arrayOfNums[i]);
            }
        }
    }
    
    public static int[] addAtEnd(int[] arrayOfNums) {
        // Add numbers 1 through 10 to the array and print them
        System.out.println("Original array: ");
        for (int i = 0; i < 10; i++) {
            arrayOfNums[i] = i + 1;
            System.out.print(arrayOfNums[i] + ", ");
        }
        
        // List ends with -1
        arrayOfNums[arrayOfNums.length - 1] = -1;
        System.out.print(arrayOfNums[arrayOfNums.length - 1] + "\n");
        
        return arrayOfNums;
    }
    
    public static int[] addAtPos(int[] oldArray, int num, int pos) {
        // Create new array for storing added values
        int[] newArray = new int[20];
        
        // Copy elements from old array to new array until reaching the position 
        // to insert a new number and continue copying afterwards
        for (int i = 0; i < oldArray.length; i++) { 
            if (i < pos - 1) 
                newArray[i] = oldArray[i]; 
            else if (i == pos - 1) 
                newArray[i] = num; 
            else
                newArray[i] = oldArray[i - 1]; 
        }
        newArray[12] = -1;
        
        return newArray;
    }
}
