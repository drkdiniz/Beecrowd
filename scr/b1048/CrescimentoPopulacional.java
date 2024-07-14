package b1048;

import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int PA = sc.nextInt();
            int PB = sc.nextInt();
            double G1 = sc.nextDouble();
            double G2 = sc.nextDouble();

            int anos = 0;

            while (PA <= PB && anos <= 100) {
                PA += (int) (PA * G1 / 100);
                PB += (int) (PB * G2 / 100);
                anos++;
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }

        sc.close();
    }
}
