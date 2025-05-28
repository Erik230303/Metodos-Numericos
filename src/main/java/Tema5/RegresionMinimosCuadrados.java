package Tema5;

public class RegresionMinimosCuadrados {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 4, 5, 4, 5};

        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        // Predicción en x = 6
        double xPred = 6;
        double yPred = a + b * xPred;

        System.out.printf("✅ Regresión: y = %.4f + %.4fx%n", a, b);
        System.out.printf("📈 Predicción para x = %.1f: y ≈ %.4f%n", xPred, yPred);
    }
}
