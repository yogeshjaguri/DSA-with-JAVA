package TwoDArray;

public class Spiral {
    public static void spiralPrint(int matrix[][]) {
        // Your code goes here
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        while (startRow <= endRow && startCol <= endCol) {
            // Print first row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Print last column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Print last row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Print first column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 1 }, { 1, 3, 1 }, { 1, 1, 2 } };
        spiralPrint(mat);
    }

}
