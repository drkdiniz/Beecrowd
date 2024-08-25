package b1048;

import java.util.Scanner;

public class OUltimoAnalogimon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] matriz = new int[n][m];
            int playerX = 0, playerY = 0;
            int analogimonX = 0, analogimonY = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matriz[i][j] = sc.nextInt();
                    if (matriz[i][j] == 1) {
                        playerX = i;
                        playerY = j;
                    }
                    if (matriz[i][j] == 2) {
                        analogimonX = i;
                        analogimonY = j;
                    }
                }
            }

            int distancia = Math.abs(playerX - analogimonX) + Math.abs(playerY - analogimonY);
            System.out.println(distancia);
        }

        sc.close();
    }
}
