package day5._6SymmetryLooksPretty;


import day5._5ExpandingMatrices.Matrix;

public class Run {
    public static void main(String[] args) {
        int[] array0 = {};
        int[] array1 = {1,2,3,4,5,4,3,2,1};
        int[] array2 = {1,2,3,7,6,5,8};
        int[] array3 = {3};
        int[] array4 = {2,2};
        int[] array5 = {2,3};
        int[] array6 = {2,3,2};
        int[] array7 = {2,2,3};
        Matrix matrix = new Matrix(5,5);
        MatrixChecker checkMatrix = new MatrixChecker();
        System.out.println("Check the symmetry of the following arrays:");
        System.out.println("Empty -> " + checkMatrix.isSymmetrical(array0));
        System.out.println("[1,2,3,4,5,4,3,2,1] -> " + checkMatrix.isSymmetrical(array1));
        System.out.println("[1,2,3,7,6,5,8] -> " + checkMatrix.isSymmetrical(array2));
        System.out.println("[3] -> " + checkMatrix.isSymmetrical(array3));
        System.out.println("[2,2] -> " + checkMatrix.isSymmetrical(array4));
        System.out.println("[2,3] -> " + checkMatrix.isSymmetrical(array5));
        System.out.println("[2,3,2] -> " + checkMatrix.isSymmetrical(array6));
        System.out.println("[2,2,3] -> " + checkMatrix.isSymmetrical(array7));

        matrix.setMatrix("2,1,1;1,2,1;1,1,2");
        matrix.prettyPrint();

        System.out.println("Is the matrix symmetrical? " + checkMatrix.isSymmetrical(matrix.getArray()));
        matrix.setMatrix("1,0,0,0,0;1,1,0,0,0;1,1,1,0,0;1,1,1,1,0;1,1,1,1,1");
        matrix.prettyPrint();
        System.out.println("Is the matrix triangular? " + checkMatrix.isTriangular(matrix.getArray()));

        matrix.setMatrix("1,0,0;1,1,0;1,1,1");
        matrix.prettyPrint();
        System.out.println("Is the matrix triangular? " + checkMatrix.isTriangular(matrix.getArray()));
        matrix.setMatrix("1,0,0,0,0;1,1,0,0,1;1,1,1,0,0;1,1,1,1,0;1,1,1,1,1");
        matrix.prettyPrint();
        System.out.println("Is the matrix triangular? " + checkMatrix.isTriangular(matrix.getArray()));
    }
}
