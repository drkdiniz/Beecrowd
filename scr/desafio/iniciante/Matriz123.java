package desafio.iniciante;

import java.util.Scanner;

public class Matriz123 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 3 || n >= 70) break;

            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        matriz[i][j] = 2;
                    } else if (i == j) {
                         matriz[i][j] = 1;
                    }else {
                        matriz[i][j] = 3;
                    }

                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    sb.append(matriz[i][j]);
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
        sc.close();
    }
}








