public class RectangularNums {

    public static void print(int n) {
        // Write your code here
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                System.out.print(Math.max(i, j));
            }
            for (int j = 2; j <= n; j++) {
                System.out.print(Math.max(i, j));
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(Math.max(i, j));
            }
            for (int j = 2; j <= n; j++) {
                System.out.print(Math.max(i, j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
