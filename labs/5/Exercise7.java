package lab5;

public class Exercise7 {

    public static void main(String[] args) {
        double[][] sqMatrix = {{ 2, 1, 4}, 
                               { 0, 3, -1}, 
                               { 0, 0, -2}}; 
        
        // Length of one side of the square array
        int arrDimension = 3;
        
        // Print result
        if (isUpperTriangular(sqMatrix, arrDimension)) {
            System.out.println("The matrix is upper triangular."); 
        }
        else {
            System.out.println("The matrix is not upper triangular."); 
        }
    }
    
    public static boolean isUpperTriangular(double[][] array, int arrDimension) {
        // Check cells where row > column and whether they hold a non-zero value
        for (int i = 1; i < arrDimension ; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] != 0) {
                    return false; 
                }
            }
        }
        return true;
    }
}
