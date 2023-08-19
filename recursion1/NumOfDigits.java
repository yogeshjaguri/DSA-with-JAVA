package recursion1;

public class NumOfDigits {

    public static int countDigits(int n) {
        // Write your code here.
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);

    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }

}
