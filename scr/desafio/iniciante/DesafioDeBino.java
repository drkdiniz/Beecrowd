package desafio.iniciante;

import java.util.Scanner;

public class DesafioDeBino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int multiplo2 = 0, multiplo3 = 0, multiplo4 = 0, multiplo5 = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x % 5 == 0) multiplo5++;
            if (x % 4 == 0) multiplo4++;
            if (x % 3 == 0) multiplo3++;
            if (x % 2 == 0) multiplo2++;
        }
        System.out.printf("%d Multiplo(s) de 2\n", multiplo2);
        System.out.printf("%d Multiplo(s) de 3\n", multiplo3);
        System.out.printf("%d Multiplo(s) de 4\n", multiplo4);
        System.out.printf("%d Multiplo(s) de 5\n", multiplo5);

        sc.close();
    }
}
