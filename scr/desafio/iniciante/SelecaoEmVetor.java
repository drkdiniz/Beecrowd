package desafio.iniciante;

import java.util.Scanner;

public class SelecaoEmVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vect = new double[100];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, vect[i]);
            }
        }
        sc.close();

    }
}
