package b1048;

import java.util.Scanner;

public class PreenchimentoDeVetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];

        vect[0] = sc.nextInt();

        for (int i = 1; i < vect.length; i++) {
            vect[i] = vect[i - 1] * 2;
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vect[i]);
        }
        sc.close();


    }
}
