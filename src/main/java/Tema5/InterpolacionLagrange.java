package Tema5;

public class InterpolacionLagrange {
    public static void main(String[] args) {
        double[] x = {1, 2, 3};
        double[] y = {2, 3, 5};

        double xi = 2.5;
        double yi = lagrange(x, y, xi);

        System.out.printf("✅ Lagrange: f(%.2f) ≈ %.4f%n", xi, yi);
    }

    public static double lagrange(double[] x, double[] y, double xi) {
        double result = 0;
        int n = x.length;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i)
                    term *= (xi - x[j]) / (x[i] - x[j]);
            }
            result += term;
        }

        return result;
    }
}
