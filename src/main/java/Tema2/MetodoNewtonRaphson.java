package Tema2;

import java.util.function.Function;

public class MetodoNewtonRaphson {
    public static void main(String[] args) {
        
        Function<Double, Double> f = x -> Math.pow(x, 3) + x - 1;
        Function<Double, Double> df = x -> 3 * Math.pow(x, 2) + 1;

        double x0 = 0.5;
        double tol = 1e-6;
        int maxIter = 100;

        System.out.println("Iter\t x\t\t f(x)");
        for (int i = 1; i <= maxIter; i++) {
            double fx = f.apply(x0);
            double dfx = df.apply(x0);

            if (dfx == 0) {
                System.out.println("❌ Derivada cero. Método no aplicable.");
                return;
            }

            double x1 = x0 - fx / dfx;

            System.out.printf("%d\t %.6f\t %.6f%n", i, x1, f.apply(x1));

            if (Math.abs(x1 - x0) < tol) {
                System.out.println("\n✅ Raíz aproximada: x ≈ " + x1);
                return;
            }

            x0 = x1;
        }

        System.out.println("❌ No se alcanzó la convergencia.");
    }
}
