package day5._6SymmetryLooksPretty;

public class MatrixChecker {

    /**
     * Checks if an array of integers is symmetrical or not.
     * @param input     Receives an array of integers.
     * @return          Returns true if the array is symmetrical
     *                  or false otherwise.
     */
    public boolean isSymmetrical(int[] input){
        for (int i = 0; i < (input.length/2); i++){
            if (input[i] != input[(input.length-1)-i]){
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if a 2D matrix is symmetrical
     * @param input     Receives a 2D array.
     * @return          Returns true if the array is symmetrical,
     *                  false otherwise.
     */
    public boolean isSymmetrical(int[][] input){
        for (int i = 0; i < input.length; i++){
            for(int j = 0; j < input[0].length; j++){
                if (input[i][j] != input[j][i] && j > i){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if a 2D matrix is triangular
     * @param input     Receives a 2D array.
     * @return          Returns true if the array is symmetrical,
     *                  false otherwise.
     */
    public boolean isTriangular(int[][] input){
        for (int i = 0; i < input.length; i++){
            for(int j = 0; j < input[0].length; j++){
                if (input[i][j] != 0 && j > i){
                    System.out.println("Fails at: " + i + " " + j );
                    return false;
                }
            }
        }
        return true;
    }
}
