package recursion2;

public class GeomSum {

    public static double findGeometricSum(int k) {
        // Write your code here
        if (k == 0) {
            return 1.0;
        }

        double current = 1.0 / powerOfTwo(k);
        double next = findGeometricSum(k - 1);
        return current + next;
    }

    public static double powerOfTwo(int k) {
        if (k == 0) {
            return 1.0;
        }

        double halfPower = powerOfTwo(k / 2);

        if (k % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return 2.0 * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int k = 3;
        double ans = findGeometricSum(k);
        System.out.println(ans);
    }

}
