package OOPS1.PolynomialClass;

public class Polynomial {
    int degCoeff[];

    Polynomial() {
        degCoeff = new int[10];
    }

    public void setCoefficient(int degree, int coeff) {
        if (degree > degCoeff.length - 1) {
            int temp[] = degCoeff;
            degCoeff = new int[degree + 1];
            for (int i = 0; i < temp.length; i++) {
                degCoeff[i] = temp[i];
            }
        }
        degCoeff[degree] = coeff;
    }

    public void print() {
        for (int i = 0; i < degCoeff.length; i++) {
            if (degCoeff[i] != 0) {
                System.out.print(degCoeff[i] + "x" + i + " ");
            }
        }
        System.out.println();
    }

    public Polynomial add(Polynomial p) {
        Polynomial ans = new Polynomial();
        int p1 = this.degCoeff.length;
        int p2 = p.degCoeff.length;
        int len = Math.min(p1, p2);

        for (int i = 0; i < len; i++) {
            ans.setCoefficient(i, this.degCoeff[i] + p.degCoeff[i]);
        }

        int i = 0;
        while (i < p1) {
            ans.setCoefficient(i, this.degCoeff[i]);
            i++;
        }
        while (i < p2) {
            ans.setCoefficient(i, p.degCoeff[i]);
            i++;
        }
        return ans;

    }

    public Polynomial subtract(Polynomial p) {
        Polynomial ans = new Polynomial();
        int p1 = this.degCoeff.length;
        int p2 = p.degCoeff.length;
        int len = Math.min(p1, p2);

        for (int i = 0; i < len; i++) {
            ans.setCoefficient(i, this.degCoeff[i] - p.degCoeff[i]);
        }

        int i = 0;
        while (i < p1) {
            ans.setCoefficient(i, this.degCoeff[i]);
            i++;
        }
        while (i < p2) {
            ans.setCoefficient(i, -p.degCoeff[i]);
            i++;
        }
        return ans;
    }

    public int getCoefficient(int degree) {
        if (degree > degCoeff.length - 1) {
            return 0;
        }
        return degCoeff[degree];
    }

    public Polynomial multiply(Polynomial p) {
        Polynomial ans = new Polynomial();
        for (int i = 0; i < this.degCoeff.length; i++) {
            for (int j = 0; j < p.degCoeff.length; j++) {
                int coeff = this.degCoeff[i] * p.degCoeff[j];
                int degree = i + j;
                int oldCoeff = ans.getCoefficient(degree);
                ans.setCoefficient(degree, coeff + oldCoeff);
            }
        }
        return ans;
    }

}
