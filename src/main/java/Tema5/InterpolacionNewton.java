package Tema5;

public class InterpolacionNewton {
    public static void main(String[] args) {
        double[] x = {1, 2, 3};
        double[] y = {2, 3, 5};

        double xi = 2.5;
        double resultado = newtonInterpolacion(x, y, xi);
        System.out.printf("✅ Newton: f(%.2f) ≈ %.4f%n", xi, resultado);
    }

    public static double newtonInterpolacion(double[] x, double[] y, double xi) {
        int n = x.length;
        double[][] fdd = new double[n][n]; // Tabla de diferencias divididas

        for (int i = 0; i < n; i++)
            fdd[i][0] = y[i];

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                fdd[i][j] = (fdd[i + 1][j - 1] - fdd[i][j - 1]) / (x[i + j] - x[i]);
            }
        }

        double result = fdd[0][0];
        for (int i = 1; i < n; i++) {
            double term = fdd[0][i];
            for (int j = 0; j < i; j++)
                term *= (xi - x[j]);
            result += term;
        }

        return result;
    }
}
