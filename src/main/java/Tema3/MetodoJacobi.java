package Tema3;

public class MetodoJacobi {
    public static void main(String[] args) {
        double[][] A = {
            {10, -1, 2},
            {-1, 11, -1},
            {2, -1, 10}
        };
        double[] b = {6, 25, -11};
        double[] x = {0, 0, 0};  // inicial
        double[] xNuevo = new double[3];

        int maxIter = 25;
        double tol = 1e-6;

        System.out.println("Iter\t x0\t x1\t x2");

        for (int iter = 1; iter <= maxIter; iter++) {
            for (int i = 0; i < 3; i++) {
                double suma = 0;
                for (int j = 0; j < 3; j++) {
                    if (j != i) suma += A[i][j] * x[j];
                }
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            System.out.printf("%d\t %.6f\t %.6f\t %.6f%n", iter, xNuevo[0], xNuevo[1], xNuevo[2]);

            if (norma(xNuevo, x) < tol) break;

            System.arraycopy(xNuevo, 0, x, 0, 3);
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
