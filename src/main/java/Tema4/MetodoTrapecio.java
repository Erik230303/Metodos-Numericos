package Tema4;

import java.util.function.Function;

public class MetodoTrapecio {
   public static void main(String[] args) {
        Function<Double, Double> f = x -> Math.exp(x); // f(x) = e^x

        double a = 0, b = 1;
        int n = 10;
        double h = (b - a) / n;

        double suma = f.apply(a) + f.apply(b);
        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            suma += 2 * f.apply(xi);
        }

        double integral = (h / 2) * suma;
        System.out.printf("✅ Aproximación integral ≈ %.6f%n", integral);
    } 
}
