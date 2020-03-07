package lab5;

import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numArray[] = new double[10];
        
        // Ask user for 10 numbers and store them in an array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++){
            numArray[i] = input.nextDouble();
        }
        
        // Call methods for finding mean and standard deviation and print 
        // the results.
        System.out.println("Mean: " + mean(numArray));
        System.out.println("Standard Deviation: " + deviation(numArray));
    }

    public static double mean(double[] x) {
        double sum = 0;
        double mean = 0;
        double arrLength = x.length;
        
        // Add up all of the elements in the array
        for (int j = 0; j < x.length; j++){
            sum += x[j];
        }
        
        // Calculate the mean
        mean = sum / arrLength;
        
        return mean;
    }

    public static double deviation(double[] x) {
        double difSquared = 0;
        double arrLength = x.length;
        double mean = mean(x);
        double stdDev = 0;
        
        // Find the square of the distance between each entered number and the mean
        for (int i = 0; i < arrLength; i++){
            difSquared += (x[i] - mean) * (x[i] - mean);
        }
        
        // Calculate the standard deviation of the numbers
        stdDev = Math.sqrt(difSquared / (arrLength - 1));
        
        return stdDev; 
    }
}