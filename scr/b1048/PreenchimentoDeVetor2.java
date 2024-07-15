package b1048;

import java.util.Random;
import java.util.Scanner;

public class PreenchimentoDeVetor2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vector = new int[1000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i % n;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vector[i]);
        }

        sc.close();
    }
}
