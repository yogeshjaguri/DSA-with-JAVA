package TESTS.test5;

import java.util.Scanner;

public class mat {
    int[][] matrix;

    mat(int[][] mat) {
        matrix = mat;
    }

    public static mat add(mat a, mat b) {
        int rows = a.matrix.length;
        int cols = a.matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        return new mat(result);
    }

    public static mat multiply(mat a, mat b) {
        int rowsA = a.matrix.length;
        int colsA = a.matrix[0].length;
        int colsB = b.matrix[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += a.matrix[i][k] * b.matrix[k][j];
                }
                result[i][j] = sum;
            }
        }
        return new mat(result);

    }

    public static mat transpose(mat m) {
        int rows = m.matrix.length;
        int cols = m.matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = m.matrix[j][i];
            }
        }
        return new mat(result);

    }

    public static mat rotate(mat m) {
        int rows = m.matrix.length;
        int cols = m.matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = m.matrix[rows - j - 1][i];
            }
        }
        return new mat(result);

    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
        if (option == 1) {
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            int[][] m1 = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m1[i][j] = s.nextInt();
                }
            }
            mat mat1 = new mat(m1);
            int r2 = s.nextInt();
            int c2 = s.nextInt();
            int[][] m2 = new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    m2[i][j] = s.nextInt();
                }
            }
            mat mat2 = new mat(m2);
            mat ans = mat.add(mat1, mat2);
            ans.print();
        } else if (option == 2) {
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            int[][] m1 = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m1[i][j] = s.nextInt();
                }
            }
            mat mat1 = new mat(m1);
            int r2 = s.nextInt();
            int c2 = s.nextInt();
            int[][] m2 = new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    m2[i][j] = s.nextInt();
                }
            }
            mat mat2 = new mat(m2);
            mat ans = mat.multiply(mat1, mat2);
            ans.print();
        } else if (option == 3) {
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            int[][] m1 = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m1[i][j] = s.nextInt();
                }
            }
            mat mat1 = new mat(m1);
            mat ans = mat.transpose(mat1);
            ans.print();
        } else {
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            int[][] m1 = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m1[i][j] = s.nextInt();
                }
            }
            mat mat1 = new mat(m1);
            mat ans = mat.rotate(mat1);
            ans.print();
        }
    }
}
