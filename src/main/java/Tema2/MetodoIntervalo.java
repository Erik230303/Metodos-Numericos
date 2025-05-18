package Tema2;

import java.util.function.Function;

public class MetodoIntervalo {
    public static void main(String[] args) {
        
        Function<Double, Double> f = x -> Math.pow(x, 3) - 4 * x - 9;

        double a = 2;
        double b = 3;

        if (f.apply(a) * f.apply(b) < 0) {
            System.out.println("✅ Existe al menos una raíz en el intervalo [" + a + ", " + b + "]");
        } else {
            System.out.println("❌ No se garantiza raíz en el intervalo [" + a + ", " + b + "]");
        }
    }
}
