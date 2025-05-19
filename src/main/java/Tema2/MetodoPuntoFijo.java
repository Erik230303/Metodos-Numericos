package Tema2;

import java.util.function.Function;

public class MetodoPuntoFijo {
        
        public static void main(String[] args) {
        
        Function<Double, Double> g = x -> 1 - Math.pow(x, 3);

        double x0 = 0.5;    
        double tol = 1e-6;
        int maxIter = 100;

        System.out.println("Iter\t x");
        for (int i = 1; i <= maxIter; i++) {
            double x1 = g.apply(x0);
            System.out.printf("%d\t %.6f%n", i, x1);

            if (Math.abs(x1 - x0) < tol) {
                System.out.println("\n✅ Raíz aproximada: x ≈ " + x1);
                return;
            }

            x0 = x1;
        }

        System.out.println("❌ No se alcanzó la convergencia.");
    }
}
