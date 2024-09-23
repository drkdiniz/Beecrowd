package desafio.iniciante;

import java.util.Scanner;

public class RaizQuadradaDeDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double x = 0.0;
        for (int i = 0; i < n; i++) {
            x += 2;
            x = 1 / x;
        }
        x += 1;

        System.out.printf("%.10f\n", x);

        sc.close();
    }
}
