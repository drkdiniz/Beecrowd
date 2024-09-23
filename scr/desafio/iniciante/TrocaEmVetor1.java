package desafio.iniciante;

import java.util.Scanner;

public class TrocaEmVetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[20];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }


        for (int i = 0; i < vect.length / 2; i++) {
            int temp = vect[i];
            vect[i] = vect[vect.length -1 - i];
            vect[vect.length -1 - i] = temp;

        }
        for (int i = 0; i < vect.length ; i++) {
            System.out.printf("N[%d] = %d\n", i, vect[i]);
        }
        sc.close();

    }
}
