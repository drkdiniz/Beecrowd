package desafio.iniciante;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciEmVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] vect = new BigInteger[100];
        int[] posicao = new int[n];

        vect[0] = BigInteger.valueOf(0);
        vect[1] = BigInteger.valueOf(1);

        for (int i = 2; i < vect.length; i++) {
            vect[i] = vect[i - 2].add(vect[i - 1]);

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
