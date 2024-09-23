package desafio.iniciante;

import java.util.Scanner;

public class PreenchimentoDeVetor3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vect = new double[100];
        vect[0] = sc.nextDouble();

        for (int i = 1; i < vect.length; i++) {
            vect[i] = vect[i-1] / 2;
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, vect[i]);
        }
        sc.close();
    }
}
