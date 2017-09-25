#Symmetry Looks Pretty

Make a class MatrixChecker with three methods:
- **isSymmetrical(int[])** takes an array of int and returns true if the array is symmetrical and false 
otherwise. An array is symmetrical if the element at <u>[0]</u> is the same as the element at <u>[length-1]</u>, 
the element at <u>[1]</u> is thesame as the element at <u>[length-2]</u>, etc.
- **isSymmetrical(int[][])** takes a bidimensional array of int and returns true if the matrix is symmetrical
and false otherwise. An matrix is symmetrical if <u>m[i][j] == m[j][i]</u> for any value of i and j
- **isTriangular(int[][])** takes a bidimensional array of int and returns true if the matrix is triangular
and false otherwise. An matrix is triangular if <u>m[i][j] == 0</u> for any value of i that is greater than
j. 

Add some methods to your Matrix class from the other exercise to perform tests on the matrices yo
u create using the methods from MatrixChecker. (Hint: these methods will n eed to create objects of type
MatrixChecker).