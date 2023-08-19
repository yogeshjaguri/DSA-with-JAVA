package recursion1;

public class fibonacciNum {

    public static int fib(int n) {
        // Write your code here
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

}
