package desafio.iniciante;

import java.util.Scanner;

public class Estagio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int M = sc.nextInt();
            double somaNotasPonderadas = 0.0;
            double somaCargasHorarias = 0.0;

            for (int i = 0; i < M; i++) {
                int Ni = sc.nextInt();
                int Ci = sc.nextInt();

                somaNotasPonderadas += Ni * Ci;
                somaCargasHorarias += Ci;
            }

            double IRA = (somaNotasPonderadas / somaCargasHorarias) * 100;

            System.out.printf("%.4f%n", IRA);
        }

        sc.close();
    }
}
