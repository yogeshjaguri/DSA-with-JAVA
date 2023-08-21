package TwoDArray;

public class Multiplication {

    public static int multiplyTwoIntegers(int m, int n) {
        // Write your code here
        if (m == 0 || n == 0) {
            return 0;
        }
        return m + multiplyTwoIntegers(m, n - 1);

    }

    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int ans = multiplyTwoIntegers(m, n);
        System.out.println(ans);
    }

}
