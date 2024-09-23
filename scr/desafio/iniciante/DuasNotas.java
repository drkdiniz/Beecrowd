package desafio.iniciante;

import java.util.Scanner;

public class DuasNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            if (n == 0) break;
            if (!sc.hasNextInt()) break;
            int m = sc.nextInt();
            if (m == 0) break;

            int[] notas = {100, 50, 20, 10, 5, 2};
            int troco = m - n;
            int sum = 0;
            for (int nota : notas) {
                if (nota <= troco) {
                    troco -= nota;
                    sum++;
                }
            }
            if (sum == 2) {
                System.out.println("possible");
            }
            else {
                System.out.println("impossible");
            }
        }

        sc.close();
    }
}
