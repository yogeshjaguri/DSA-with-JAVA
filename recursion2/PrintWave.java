package recursion2;

public class PrintWave {

    public static void wavePrint(int mat[][]) {
        int rows = mat.length;
        if (rows == 0 || mat[0].length == 0) {
            return;
        }
        int cols = mat[0].length;

        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 1 }, { 1, 3, 1 }, { 1, 1, 2 } };
        wavePrint(mat);
    }

}
