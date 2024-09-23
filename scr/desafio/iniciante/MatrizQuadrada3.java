package desafio.iniciante;

import java.util.Collections;
import java.util.Scanner;

public class MatrizQuadrada3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n = sc.nextInt();
            if (n == 0) break;

            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if  (j ==0) {
                        matriz[i][j] = (int)Math.pow(2, i);
                    }
                    else {
                        matriz[i][j] = matriz[i][j-1] * 2;
                    }
                }
            }
            int espacamento = (int) Math.floor(Math.log10(matriz[n-1][n-1]) + 1);

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (j == 0) {
                        sb.append(String.format("%" + espacamento + "d", matriz[i][j]));
                    }
                    else {
                        sb.append(String.format(" %" + espacamento + "d", matriz[i][j]));
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");

        }
        System.out.print(sb);
        sc.close();
    }
}
