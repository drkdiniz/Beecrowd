package desafio.iniciante;

import java.util.Scanner;

public class SubstituicaoEmVetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] <= 0) {
                vect[i] = 1;
            }
            System.out.printf("X[%d] = %d\n", i, vect[i]);
        }
        sc.close();
    }
}
