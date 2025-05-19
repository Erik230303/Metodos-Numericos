package Tema2;

import java.util.function.Function;

public class MetodoSecante {
    public static void main(String[] args) {

        Function<Double, Double> f = x -> Math.pow(x, 3) + x - 1;

        double x0 = 0.0;
        double x1 = 1.0;
        double tol = 1e-6;
        int maxIter = 100;

        System.out.println("Iter\t x\t\t f(x)");
        for (int i = 1; i <= maxIter; i++) {
            double fx0 = f.apply(x0);
            double fx1 = f.apply(x1);

            if (fx1 - fx0 == 0) {
                System.out.println("❌ División por cero en la secante.");
                return;
            }

            double x2 = x1 - fx1 * (x1 - x0) / (fx1 - fx0);
            System.out.printf("%d\t %.6f\t %.6f%n", i, x2, f.apply(x2));

            if (Math.abs(x2 - x1) < tol) {
                System.out.println("\n✅ Raíz aproximada: x ≈ " + x2);
                return;
            }

            x0 = x1;
            x1 = x2;
        }

        System.out.println("❌ No se alcanzó la convergencia.");
    }
}
