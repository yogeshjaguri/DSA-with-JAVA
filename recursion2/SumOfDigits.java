package recursion2;

public class SumOfDigits {
    public static int sumOfDigits(int input) {
        // Write your code here
        int sum = 0;
        if (input > 0) {
            int digit = input % 10;
            sum = digit + sumOfDigits(input / 10);
        }
        return sum;
    }

    public static void main(String[] args) {
        int input = 123456;
        int ans = sumOfDigits(input);
        System.out.println(ans);
    }

}
