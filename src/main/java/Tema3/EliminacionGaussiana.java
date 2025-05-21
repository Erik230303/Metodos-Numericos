package Tema3;

public class EliminacionGaussiana {
    public static void main(String[] args) {
        double[][] A = {
            {2, 1, -1},
            {-3, -1, 2},
            {-2, 1, 2}
        };
        double[] b = {8, -11, -3};

        int n = b.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = A[j][i] / A[i][i];
                for (int k = i; k < n; k++) {
                    A[j][k] -= factor * A[i][k];
                }
                b[j] -= factor * b[i];
            }
        }

        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            x[i] = b[i];
            for (int j = i + 1; j < n; j++) {
                x[i] -= A[i][j] * x[j];
            }
            x[i] /= A[i][i];
        }

        System.out.println("✅ Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %.4f%n", i, x[i]);
        }
    }
}
