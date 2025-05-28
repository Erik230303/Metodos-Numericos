package Tema6;

public class MetodoTaylor {
    public static void main(String[] args) {
        double x = 0, y = 1;
        double h = 0.1;
        int pasos = 10;

        for (int i = 0; i < pasos; i++) {
            double f = x + y;
            double fp = 1 + f; // f' ≈ 1 + y'

            y = y + h * f + (h * h / 2) * fp;
            x += h;

            System.out.printf("x=%.2f, y=%.5f%n", x, y);
        }
    }
}
