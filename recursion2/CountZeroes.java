package recursion2;

public class CountZeroes {

    public static int countZerosRec(int input) {
        // Write your code here

        if (input == 0) {
            return 1;
        }

        if (input < 10) {
            return 0;
        }

        int sum = countZerosRec(input / 10);
        int digit = input % 10;
        if (digit == 0) {
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countZerosRec(45200250));
    }
}
