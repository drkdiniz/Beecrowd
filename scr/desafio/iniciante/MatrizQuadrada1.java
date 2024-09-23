package desafio.iniciante;

import java.util.Scanner;

public class MatrizQuadrada1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int x = Math.min(Math.min(i + 1, j + 1), Math.min(N - i, N - j));
                    matrix[i][j] = x;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
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
