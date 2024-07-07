package b1048;

import java.util.Locale;
import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int PESO1 = 2;
        final int PESO2 = 3;
        final int PESO3 = 5;

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            double media = (x * PESO1 + y * PESO2 + z * PESO3) / (PESO1 + PESO2 + PESO3);
            vect[i] = media;
        }
        for (double v : vect) {
            System.out.printf("%.1f\n", v);
        }
        sc.close();
    }
}
