package Tema6;

public class EulerSistemaEDO {
    public static void main(String[] args) {
        double x = 0.0, y = 1.0, z = 0.0; // z = y'
        double h = 0.1;
        int pasos = 10;

        for (int i = 0; i < pasos; i++) {
            double dy = z;                   // dy/dx = z
            double dz = -y;                  // dz/dx = -y → y'' = -y

            y += h * dy;
            z += h * dz;
            x += h;

            System.out.printf("x=%.2f, y=%.5f, y'=%.5f%n", x, y, z);
        }
    }
}
