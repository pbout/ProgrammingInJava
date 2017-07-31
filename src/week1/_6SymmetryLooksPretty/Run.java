package week1._6SymmetryLooksPretty;


import week1._5ExpandingMatrices.Matrix;

public class Run {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,4,3,2,1};
        int[] array2 = {1,2,3,7,6,5,8};
        Matrix matrix = new Matrix(5,5);
        MatrixChecker checkMatrix = new MatrixChecker();

       System.out.println("Is the array symmetrical (1,2,3,4,5,4,3,2,1)? " + checkMatrix.isSymmetrical(array));
        System.out.println("Is this (1,2,3,7,6,5,8)? " + checkMatrix.isSymmetrical(array2));
       System.out.println("");

        matrix.setMatrix("2,1,1;1,2,1;1,1,2");
        matrix.prettyPrint();

        System.out.println("Is the matrix symmetrical? " + checkMatrix.isSymmetrical(matrix.getArray()));

        matrix.setMatrix("1,0,0;1,1,0;1,1,1");
        matrix.prettyPrint();
        System.out.println("Is the matrix triangular? " + checkMatrix.isSymmetrical(matrix.getArray()));

    }
}
