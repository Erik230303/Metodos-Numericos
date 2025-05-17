package Tema1;

public class ErrorTruncamiento {
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        double x = 1;
        int n = 3;
        double taylor = 1.0;
        for (int i = 1; i <= n; i++) {
            taylor += Math.pow(x, i) / factorial(i);
        }
        double real = Math.exp(x);
        double error = Math.abs(real - taylor);

        System.out.println("Aproximación de e^1 con " + n + " términos: " + taylor);
        System.out.println("Valor real: " + real);
        System.out.println("Error de truncamiento: " + error);
    }
}
