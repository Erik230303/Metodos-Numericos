package Tema6;

public class MetodoUnPaso {
    public static void main(String[] args) {
        double x0 = 0, y0 = 1, h = 0.1;
        int pasos = 10;

        for (int i = 0; i < pasos; i++) {
            double f = funcion(x0, y0);
            y0 = y0 + h * f;
            x0 = x0 + h;

            System.out.printf("x=%.2f, y=%.5f%n", x0, y0);
        }
    }

    // dy/dx = f(x, y)
    public static double funcion(double x, double y) {
        return x + y; // ejemplo: y' = x + y
    }
}
