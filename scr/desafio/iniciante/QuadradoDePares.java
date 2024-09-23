package desafio.iniciante;

import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int numQuadrado = i * i;
                System.out.printf("%d^2 = %d%n", i, numQuadrado);
            }
        }


        sc.close();
    }
}
