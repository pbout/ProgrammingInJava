package week5._6SymmetryLooksPretty;

public class MatrixChecker {

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
                if (input[i][j] != input[j][i]){
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
    //TODO: Doesnt work as intended
    public boolean isTriangular(int[][] input){
        for (int i = 0; i < input.length; i++){
            for(int j = 0; j < input[0].length; j++){
                if (input[i][j] != 0 && i > j){
                    return false;
                }
            }
        }
        return true;
    }
}
