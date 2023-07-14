import java.util.Scanner;

class Matrix {
    Scanner sc = new Scanner(System.in);

    int row;
    int column;
    int[][] matrix;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public void insertElements() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter the element of [%d][%d] : ", i + 1, j + 1);
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        Matrix m1 = new Matrix(r1, c1);
        m1.insertElements();
        m1.display();

        System.out.print("Enter row and column of first matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        Matrix m2 = new Matrix(r2, c2);
        m2.insertElements();
        m2.display();

        System.out.println("Performing matrix multiplication...");
        if (m1.column == m2.row) {
            int[][] result = multiplication(m1.matrix, m2.matrix);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Can't multiply the following matrix");
        }
        sc.close();
    }

    static int[][] multiplication(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < m2.length; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
