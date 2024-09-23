package desafio.iniciante;

import java.util.Scanner;

public class MatrizQuadrada2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 1 + Math.abs(i - j);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0) {
                        sb.append(String.format("%3d", matrix[i][j]));
                    } else {
                        sb.append(String.format(" %3d", matrix[i][j]));
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        sc.close();

        System.out.print(sb);
    }
}
