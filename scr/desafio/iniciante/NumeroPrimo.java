package desafio.iniciante;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int cont = 0;
            for (int j = 1; j <= x; j++) {
                if (x % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(x + " eh primo");
            }
            else {
                System.out.println(x + " nao eh primo");
            }
        }


    }
}
