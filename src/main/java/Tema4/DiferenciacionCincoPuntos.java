package Tema4;

import java.util.function.Function;

public class DiferenciacionCincoPuntos {
    public static void main(String[] args) {
        Function<Double, Double> f = x -> Math.exp(x); // f(x) = e^x

        double x = 1.0;
        double h = 0.01;

        double derivada = (-f.apply(x + 2*h) + 8*f.apply(x + h) - 8*f.apply(x - h) + f.apply(x - 2*h)) / (12 * h);
        System.out.printf("✅ f'(%.2f) ≈ %.6f%n", x, derivada);
    }
}
