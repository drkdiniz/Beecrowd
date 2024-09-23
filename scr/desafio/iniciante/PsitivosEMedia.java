package desafio.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class PsitivosEMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double sum = 0.0;
        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0.0) {
                sum += n;
                cont += 1;
            }
        }
        double avg = sum / cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", avg);
    }
}
