package Tema6;

public class RungeKuttaSistemaEDO {
    public static void main(String[] args) {
        double x = 0, y = 1, z = 0; // y'=z, y''=-y
        double h = 0.1;
        int pasos = 10;

        for (int i = 0; i < pasos; i++) {
            double k1 = h * z;
            double l1 = h * (-y);

            double k2 = h * (z + l1 / 2);
            double l2 = h * (-(y + k1 / 2));

            double k3 = h * (z + l2 / 2);
            double l3 = h * (-(y + k2 / 2));

            double k4 = h * (z + l3);
            double l4 = h * (-(y + k3));

            y += (k1 + 2*k2 + 2*k3 + k4) / 6;
            z += (l1 + 2*l2 + 2*l3 + l4) / 6;
            x += h;

            System.out.printf("x=%.2f, y=%.5f, y'=%.5f%n", x, y, z);
        }
    }
}
