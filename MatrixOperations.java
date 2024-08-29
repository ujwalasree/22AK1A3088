import java.util.Scanner;

public class MatrixOperations {

    // Function to add, subtract, and multiply matrices
    public static int[][] matrixOperation(int[][] mat1, int[][] mat2, char op) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                switch (op) {
                    case '+':
                        result[i][j] = mat1[i][j] + mat2[i][j];
                        break;
                    case '-':
                        result[i][j] = mat1[i][j] - mat2[i][j];
                        break;
                    case '*':
                        result[i][j] = 0;
                        for (int k = 0; k < cols; k++) {
                            result[i][j] += mat1[i][k] * mat2[k][j];
                        }
                        break;
                }
            }
        }

        return result;
    }

    // Function to calculate the trace of a matrix
    public static int traceOfMatrix(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix Addition:");
        displayMatrix(matrixOperation(mat1, mat2, '+'));

        System.out.println("Matrix Subtraction:");
        displayMatrix(matrixOperation(mat1, mat2, '-'));

        System.out.println("Matrix Multiplication:");
        displayMatrix(matrixOperation(mat1, mat2, '*'));

        System.out.println("Trace of the first matrix:");
        System.out.println(traceOfMatrix(mat1));
    }
}

