package Tema1;

public class PropagacionError {
    public static void main(String[] args) {
        double a = 10.0, deltaA = 0.1;
        double b = 5.0, deltaB = 0.2;

        double f = a * b;
        double deltaF = f * (deltaA / a + deltaB / b);

        System.out.println("f = a * b = " + f);
        System.out.println("Error propagado Δf: " + deltaF);
    }
}
