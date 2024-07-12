package b1048;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[2];
        int indice = 0;

        while (indice < 2) {
            double nota = sc.nextDouble();
            if (nota >= 0.0 && nota <= 10.0) {
                notas[indice] = nota;
                indice++;
            }
            else {
                System.out.println("nota invalida");
            }
        }
        double avg = (notas[0] + notas[1]) / 2;
        System.out.printf("media = %.2f", avg);

    }
}
