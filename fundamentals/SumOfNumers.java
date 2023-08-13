public class SumOfNumers {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
