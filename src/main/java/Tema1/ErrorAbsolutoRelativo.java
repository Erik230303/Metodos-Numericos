package Tema1;

public class ErrorAbsolutoRelativo {
    public static void main(String[] args) {
        double valorReal = 3.1416;
        double valorAprox = 3.14;

        double errorAbsoluto = Math.abs(valorReal - valorAprox);
        double errorRelativo = errorAbsoluto / Math.abs(valorReal);

        System.out.println("Error absoluto: " + errorAbsoluto);
        System.out.println("Error relativo: " + errorRelativo);
    }
}
