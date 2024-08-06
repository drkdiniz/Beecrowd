package b1048;

import java.util.Scanner;

public class ODespertarDaForca {
    public static void main(String[] args) {

        /* Tive que fazer 3 grandes alterações:
        1- Cuidar para o 43 não estar nas bordas pois estava causando exceção
        2- Criar uma variável booleana para imprimir 0 0 caso a combinação não seja encontrada.
        3- Criar um Stringbuilder para corrigir o timelimit que estava aparecendo com o print

         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        final int X = 42;
        final int Y = 7;
        StringBuilder sb = new StringBuilder();

        boolean encontrou = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == X) {
                    if (i > 0 && j > 0 && i < n - 1 && j < m - 1) {
                        if (matriz[i][j - 1] == Y && matriz[i][j + 1] == Y
                                && matriz[i - 1][j - 1] == Y && matriz[i - 1][j] == Y && matriz[i - 1][j + 1] == Y
                                && matriz[i + 1][j - 1] == Y && matriz[i + 1][j] == Y && matriz[i + 1][j + 1] == Y) {
                            sb.append(i + 1).append(" ").append(j + 1).append("\n");
                            encontrou = true;
                        }
                    }
                }
            }
        }
        if (!encontrou) {
            sb.append("0 0\n");
        }

        System.out.print(sb);
        sc.close();
    }
}
