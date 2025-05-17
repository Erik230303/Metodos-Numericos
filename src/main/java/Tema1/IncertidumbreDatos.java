package Tema1;

public class IncertidumbreDatos {
    public static void main(String[] args) {
        double medicion = 10.0;
        double incertidumbre = 0.3;

        double inferior = medicion - incertidumbre;
        double superior = medicion + incertidumbre;

        System.out.println("Medición: " + medicion + " ± " + incertidumbre);
        System.out.println("Intervalo posible: [" + inferior + ", " + superior + "]");
    }
}
