package Tema5;

public class InterpolacionPolinomialSimple {
    public static void main(String[] args) {
        double[] x = {1, 2, 3};
        double[] y = {2, 3, 5};  // f(1)=2, f(2)=3, f(3)=5

        double xi = 2.5;
        double yi = interpolar(x, y, xi);

        System.out.printf("✅ Aproximación en x=%.2f es y=%.4f%n", xi, yi);
    }

    public static double interpolar(double[] x, double[] y, double xi) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term *= (xi - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }
        return result;
    }
}
