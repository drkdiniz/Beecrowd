package desafio.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class ExameGeral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            int[] notas = new int[N];

            for (int i = 0; i < N; i++) {
                notas[i] = sc.nextInt();
            }

            Arrays.sort(notas);
            int[] notasOrdenadas = new int[N];
            for (int i = 0; i < N; i++) {
                notasOrdenadas[i] = notas[N - 1 - i];
            }

            for (int i = 0; i < Q; i++) {
                int posicao = sc.nextInt();
                System.out.println(notasOrdenadas[posicao - 1]);
            }
        }

        sc.close();
    }
}
