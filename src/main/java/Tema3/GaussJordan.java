package Tema3;

public class GaussJordan {
    public static void main(String[] args) {
        double[][] A = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        int n = A.length;

        for (int i = 0; i < n; i++) {
            double pivote = A[i][i];
            for (int j = 0; j <= n; j++) {
                A[i][j] /= pivote;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = A[k][i];
                    for (int j = 0; j <= n; j++) {
                        A[k][j] -= factor * A[i][j];
                    }
                }
            }
        }

        System.out.println("✅ Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %.4f%n", i, A[i][n]);
        }
    }
}
