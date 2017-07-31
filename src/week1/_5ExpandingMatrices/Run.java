package week1._5ExpandingMatrices;

public class Run {
    public static void main(String[] args) {
        System.out.println("Constructing 2D Array");
        Matrix matrix = new Matrix(5,5);
        matrix.prettyPrint();

        System.out.println("Changing a single element with coordinates (2,2)");
        matrix.setElement(2,2,8);
        matrix.prettyPrint();

        System.out.println("Changing a single element with coordinates (5,5)");
        matrix.setElement(5,5,8);
        matrix.prettyPrint();

        System.out.println("Changing the entire 3rd row");
        matrix.setRow(3,5);
        matrix.prettyPrint();

        System.out.println("Changing the entire 3rd column");
        matrix.setColumn(3,8);
        matrix.prettyPrint();

        System.out.println("Getting the single line string equivalent of the array");
        System.out.println(matrix.toString());
        System.out.println("");

        System.out.println("Creating a new matrix using a textual representation: 4,5,6;3,4,5;1,1,1;1,9,9");
        matrix.setMatrix("4,5,6;3,4,5;1,1,1;1,9,9");
        matrix.prettyPrint();
    }
}
