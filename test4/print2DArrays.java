package test4;

// Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
// Input format :
// Line 1 : No of rows (n) and no of columns (m) (separated by single space)
// Line 2 : Row 1 elements (separated by space)
// Line 3 : Row 2 elements (separated by space)
// Line 4 : and so on

public class print2DArrays {

    public static void print2DArray(int input[][]) {
        // Write your code here

        int n = input.length;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int times = n - i;
                for (int j = 0; j < times; j++) {
                    printRow(input[i]);
                }
            }
        }
    }

    public static void printRow(int[] row) {
        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
        print2DArray(arr);
    }

}
