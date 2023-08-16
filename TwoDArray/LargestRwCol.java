package TwoDArray;

public class LargestRwCol {

    public static void findLargest(int mat[][]) {
        // Your code goes here
        int maxsumrow = Integer.MIN_VALUE;
        int maxsumcol = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        if (mat.length == 0 || mat[0].length == 0) {
            System.out.print("row 0 " + maxsumrow);
            return;
        }

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            if (maxsumrow < sum) {
                maxsumrow = sum;
                row = i;
            }
        }
        // System.out.println();

        for (int i = 0; i < mat[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum += mat[j][i];
            }
            if (maxsumcol < sum) {
                maxsumcol = sum;
                col = i;
            }
        }

        if (maxsumcol > maxsumrow) {
            System.out.print("column " + col + " " + maxsumcol);
        } else {
            System.out.print("row " + row + " " + maxsumrow);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 1 }, { 1, 3, 1 }, { 1, 1, 2 } };
        findLargest(mat);
    }
}