package recursion1;

public class Primenum {

    public static void print1ton(int n) {
        // Write your code here
        if (n == 0) {
            return;
        }
        print1ton(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print1ton(5);
    }

}
