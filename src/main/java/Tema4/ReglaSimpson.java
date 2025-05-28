package Tema4;

import java.util.function.Function;

public class ReglaSimpson {
    public static void main(String[] args) {
        Function<Double, Double> f = x -> Math.exp(x); // f(x) = e^x

        double a = 0, b = 1;
        int n = 10; // Debe ser par
        double h = (b - a) / n;

        double suma = f.apply(a) + f.apply(b);
        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            suma += (i % 2 == 0 ? 2 : 4) * f.apply(xi);
        }

        double integral = (h / 3) * suma;
        System.out.printf("✅ Aproximación integral ≈ %.6f%n", integral);
    }
}
