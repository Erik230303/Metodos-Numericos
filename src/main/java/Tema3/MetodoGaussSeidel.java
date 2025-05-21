package Tema3;

public class MetodoGaussSeidel {
    public static void main(String[] args) {
        double[][] A = {
            {10, -1, 2},
            {-1, 11, -1},
            {2, -1, 10}
        };
        double[] b = {6, 25, -11};
        double[] x = {0, 0, 0}; // inicial

        int maxIter = 25;
        double tol = 1e-6;

        System.out.println("Iter\t x0\t x1\t x2");

        for (int iter = 1; iter <= maxIter; iter++) {
            double[] xOld = x.clone();

            for (int i = 0; i < 3; i++) {
                double suma = 0;
                for (int j = 0; j < 3; j++) {
                    if (j != i) suma += A[i][j] * x[j];
                }
                x[i] = (b[i] - suma) / A[i][i];
            }

            System.out.printf("%d\t %.6f\t %.6f\t %.6f%n", iter, x[0], x[1], x[2]);

            if (norma(x, xOld) < tol) break;
        }
    }

    public static double norma(double[] a, double[] b) {
        double suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += Math.pow(a[i] - b[i], 2);
        }
        return Math.sqrt(suma);
    }
}
