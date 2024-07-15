package b1048;

import java.util.Arrays;
import java.util.Scanner;

public class MenorEPosicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();

        }
        Integer menorValor = vect[0];
        Integer menorPosicao = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < menorValor) {
                menorValor = vect[i];
                menorPosicao = i;
            }
        }
        System.out.printf("Menor valor: %d\n", menorValor);
        System.out.printf("Posicao: %d\n", menorPosicao);
        sc.close();
    }
}
