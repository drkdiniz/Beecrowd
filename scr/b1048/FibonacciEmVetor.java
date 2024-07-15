package b1048;

import java.util.Scanner;

public class FibonacciEmVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vect = new int[60];
        int[] posicao = new int[n];

        vect[0] = 0;
        vect[1] = 1;

        for (int i = 2; i < vect.length; i++) {
            vect[i] = vect[i -2] + vect[i -1];

        }
        for (int i = 0; i < n; i++) {
            posicao[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Fib(%d) = %d\n", posicao[i], vect[posicao[i]]);
        }
        sc.close();
    }
}
