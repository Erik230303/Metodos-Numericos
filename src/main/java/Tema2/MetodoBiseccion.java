package Tema2;

import java.util.function.Function;

public class MetodoBiseccion {
    public static void main(String[] args) {
        
        Function<Double, Double> f = x -> Math.pow(x, 3) - 4 * x - 9;

        double a = 2;      
        double b = 3;      
        double tol = 1e-6; 
        int maxIter = 100;

        if (f.apply(a) * f.apply(b) >= 0) {
            System.out.println("❌ No se puede aplicar el método de bisección: f(a) * f(b) >= 0");
            return;
        }

        double c = a;
        int iter = 0;

        System.out.println("Iter\t a\t\t b\t\t c\t\t f(c)");
        while ((b - a) / 2 > tol && iter < maxIter) {
            c = (a + b) / 2;
            double fc = f.apply(c);

            System.out.printf("%d\t %.6f\t %.6f\t %.6f\t %.6f%n", iter + 1, a, b, c, fc);

            if (Math.abs(fc) < tol) break;

            if (f.apply(a) * fc < 0) {
                b = c;
            } else {
                a = c;
            }

            iter++;
        }

        System.out.println("\n✅ Raíz aproximada: x ≈ " + c);
        System.out.println("🔁 Iteraciones: " + iter);
        System.out.println("📉 Error estimado: " + (b - a) / 2);
    }
}