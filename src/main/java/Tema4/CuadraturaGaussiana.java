package Tema4;

import java.util.function.Function;

public class CuadraturaGaussiana {
    public static void main(String[] args) {
        Function<Double, Double> f = x -> Math.exp(x); // f(x) = e^x

        double a = 0, b = 1;
        double h = (b - a) / 2;
        double c = (a + b) / 2;

        double x1 = c - h / Math.sqrt(3);
        double x2 = c + h / Math.sqrt(3);

        double integral = h * (f.apply(x1) + f.apply(x2));
        System.out.printf("✅ Aproximación integral ≈ %.6f%n", integral);
    }
}
