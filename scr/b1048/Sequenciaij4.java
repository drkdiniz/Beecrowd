package b1048;

import java.util.Locale;

public class Sequenciaij4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        for (double i = 0; i <= 2.1; i += 0.2) {
            for (double j = 1; j <= 3; j ++) {
                double aux = i + j;
                if (i == (int)i || i >= 1.9) {
                    System.out.printf("I=%.0f J=%.0f\n",Math.ceil(i), Math.ceil(aux));
                }
                else {
                    System.out.printf("I=%.1f J=%.1f\n", i, aux);
                }
            }

        }
    }
}
