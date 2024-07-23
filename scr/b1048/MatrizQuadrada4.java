package b1048;

import java.util.Scanner;

public class MatrizQuadrada4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {

            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            if (n < 5 || n > 102) break;

            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == (n - 1)/2 && j == (n - 1)/2) {
                        matriz[i][j] = 4;
                    }
                    else if (i != 0 && i != n-1 && j != 0 & j != n-1) {
                        matriz[i][j] = 1;
                    }
                    else if (i == j) {
                        matriz[i][j] = 2;
                    }
                    else if (j == n - 1 - i) {
                        matriz[i][j] = 3;
                    }
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (j == 0) {
                        sb.append(matriz[i][j]);
                    } else {
                        sb.append(" ").append(matriz[i][j]);
                    }
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
        sc.close();
    }
}



