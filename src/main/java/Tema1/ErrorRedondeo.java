package Tema1;

public class ErrorRedondeo {
    public static double redondear(double valor, int cifras) {
        double factor = Math.pow(10, cifras);
        return Math.round(valor * factor) / factor;
    }

    public static void main(String[] args) {
        double original = 1.0 / 3.0;
        double redondeado = redondear(original, 4);
        
        System.out.println("Valor original: " + original);
        System.out.println("Valor redondeado a 4 cifras: " + redondeado);
    }
}
