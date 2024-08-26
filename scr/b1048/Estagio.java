package b1048;

import java.util.Scanner;

public class Estagio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int M = sc.nextInt();  // Número de disciplinas cursadas
            double somaNotasPonderadas = 0.0;
            double somaCargasHorarias = 0.0;

            for (int i = 0; i < M; i++) {
                int Ni = sc.nextInt();  // Nota na i-ésima disciplina
                int Ci = sc.nextInt();  // Carga horária da i-ésima disciplina

                somaNotasPonderadas += Ni * Ci;
                somaCargasHorarias += Ci;
            }

            double IRA = (somaNotasPonderadas / somaCargasHorarias) * 100;

            // Imprime o IRA com 4 casas decimais
            System.out.printf("%.4f%n", IRA);
        }

        sc.close();
    }
}
