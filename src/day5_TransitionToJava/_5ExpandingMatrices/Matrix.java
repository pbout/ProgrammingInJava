package day5_TransitionToJava._5ExpandingMatrices;

public class Matrix {

    private int[][] array;

    /**
     * getter used for exersise 6.
     * @return
     */
    public int[][]getArray(){
        return array;
    }

    /**
     * Constructor sets the size of the array and initializes
     * all elements to 1.
     * @param x     x size of the 2D array.
     * @param y     y size of the 2D array.
     */
    public Matrix(int x, int y){
        array = new int[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                array[i][j] = 1;
            }
        }
    }

    /**
     * Receives the coordinates of a single element in the 2D array
     * and changes that element to the new Value.
     * @param x             The x position of the element.
     * @param y             The y position of the element.
     * @param newValue      The new value.
     */
    public void setElement(int x, int y, int newValue){
        if (isValid(x,y)) {
            array[x-1][y-1] = newValue;
        }else{
            // This can be commented out to avoid any action as per Objective instruction.
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Changes the entire x row to a new value.
     * @param x             The x row to be changed.
     * @param newValue      The new value.
     */
    public void setRow(int x, int newValue){
        if (isValid(x,0)){
            for(int i = 0; i < array[x-1].length; i++){
                array[x-1][i] = newValue;
            }
        }
    }

    /**
     * Changes the entire y column to a new value.
     * @param y             The y column to be changed.
     * @param newValue      The new value.
     */
    public void setColumn(int y, int newValue){
        if (isValid(0,y)){
            for(int i=0; i < array.length; i++){
                array[i][y-1] = newValue;
            }
        }
    }

    /**
     * Converts the entire table into a single row string of the form:
     * [x,x,x,x;x,x,x,x;x,x,x,x;] (4/3 table)
     * @return              The single line representation of the table.
     */
    public String toString(){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j != array[0].length-1) {
                    result = result + array[i][j]  + ",";
                }else{
                    result = result + array[i][j];
                }
            }
            if (i != array.length-1) {
                result = result+";";
            }
        }
        result = result + "]";
        return result;
    }

    /**
     * Prints the entire table in a visual format
     * [x][x][x]
     * [x][x][x]   (3/3 table)
     * [x][x][x]
     */
    public void prettyPrint() {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result = result + "[" + array[i][j] + "]" + "\t";
            }
            result = result + "\n";
        }
        System.out.println(result);
    }

    /**
     * Receives a String representation of a matrix and converts that to a 2D Array
     * Example: 3,4,5;1,2,3;7,8,9
     * Produces: [3][4][5]
     *           [1][2][3]
     *           [7][8][9]
     *
     * @param input     A String representation of a matrix
     */
    public void setMatrix(String input){
        String[][] result;
        if (!input.contains(",") | !input.contains(";")){
            System.out.println("The input appears to not be properly formatted. Please use , to seperate columns and ; to seperate rows");
        }else{
            String[] rows = input.split(";");
            result = new String[rows.length][];
            for (int i = 0; i < rows.length; i++){
                result[i] = rows[i].split(",");
            }
            array = new int[result.length][result[0].length];
            for(int i = 0; i < result.length; i++){
                for(int j = 0; j < result[0].length; j++){
                    array[i][j] = Integer.parseInt(result[i][j]);
                }
            }
        }
    }

    /**
     * Checks if the provided values are withing the bounds of the table
     * @param x         The x coordinate
     * @param y         The y coordinate
     * @return          Returns true if the coordinates are within the table
     *                  and false if otherwise.
     */
    private boolean isValid(int x, int y){
        return x <= array.length | y <= array[0].length;
    }

}
