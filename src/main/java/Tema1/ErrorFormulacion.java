package Tema1;

public class ErrorFormulacion {
    public static void main(String[] args) {
        System.out.println("Modelo mal formulado: s = v * t");
        double v = 9.8;  // mal uso de aceleración como velocidad
        double t = 2.0;

        double incorrecto = v * t;
        double correcto = 0.5 * 9.8 * t * t;

        System.out.println("Modelo incorrecto (s = vt): " + incorrecto);
        System.out.println("Modelo correcto (s = 0.5 * g * t^2): " + correcto);
        System.out.println("Diferencia (error de formulación): " + Math.abs(correcto - incorrecto));
    }
}
