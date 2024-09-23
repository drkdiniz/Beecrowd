package desafio.iniciante;

import java.util.Scanner;

public class BatalhaDePomekons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int B = sc.nextInt();

            int Ad = sc.nextInt();
            int Dd = sc.nextInt();
            int Ld = sc.nextInt();
            int Ag = sc.nextInt();
            int Dg = sc.nextInt();
            int Lg = sc.nextInt();

            double golpeDabriel = (Ad + Dd) / 2.0;
            if (Ld % 2 == 0) {
                golpeDabriel += B;
            }
            double golpeGuarte = (Ag + Dg) / 2.0;
            if (Lg % 2 == 0) {
                golpeGuarte += B;
            }

            if (golpeDabriel > golpeGuarte) {
                System.out.println("Dabriel");
            } else if (golpeGuarte > golpeDabriel) {
                System.out.println("Guarte");
            } else {
                System.out.println("Empate");
            }
        }
        sc.close();
    }
}
