package b1048;

import java.util.Scanner;

public class CrepusculoEmPortland {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n+1][n+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == 1) cont++;
                if (matriz[i][j+1] == 1) cont++;
                if (matriz[i+1][j] == 1) cont++;
                if (matriz[i+1][j+1] == 1) cont++;
                if (cont >= 2) {
                    System.out.print("S");
                }
                else {
                    System.out.print("U");
                }
                cont = 0;

            }
            System.out.println();
        }

    }
}
