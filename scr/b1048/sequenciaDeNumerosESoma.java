package b1048;

import java.util.Scanner;

public class sequenciaDeNumerosESoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int cont = 0;
        while (m > 0 && n > 0) {

            int a = Math.min(m, n);
            int b = Math.max(m, n);
            for (int i = a; i <= b; i++) {
                cont += i;
                System.out.print(i + " ");

            }

            System.out.println("Sum=" + cont);
            cont = 0;
            m = sc.nextInt();
            n = sc.nextInt();

        }
    }
}
