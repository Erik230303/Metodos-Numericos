package Tema6;

public class MetodoPasoMultiple {
    public static void main(String[] args) {
        double[] x = {0.0, 0.1};
        double[] y = {1.0, 1.11}; // suponer que y(0.1) fue hallado antes con Euler o Runge-Kutta
        double h = 0.1;
        int pasos = 8;

        for (int i = 1; i < pasos; i++) {
            double f1 = funcion(x[i], y[i]);
            double f0 = funcion(x[i - 1], y[i - 1]);

            double yNext = y[i] + (h / 2) * (3 * f1 - f0);
            double xNext = x[i] + h;

            System.out.printf("x=%.2f, y=%.5f%n", xNext, yNext);

            // actualizar valores
            x[0] = x[1];
            y[0] = y[1];
            x[1] = xNext;
            y[1] = yNext;
        }
    }

    public static double funcion(double x, double y) {
        return x + y; // y' = x + y
    }
}
