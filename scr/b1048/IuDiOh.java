package b1048;

import java.util.Scanner;

public class IuDiOh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int[][] marcos = new int[m][n];
            int[][] leo = new int[l][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    marcos[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < n; j++) {
                    leo[i][j] = sc.nextInt();
                }
            }
            int cartaMarcos = sc.nextInt() - 1;
            int cartaLeo = sc.nextInt() - 1;
            int atributoEscolhido = sc.nextInt() - 1;
            int atributoMarcos = marcos[cartaMarcos][atributoEscolhido];
            int atributoLeo = leo[cartaLeo][atributoEscolhido];

            if (atributoMarcos > atributoLeo) {
                System.out.println("Marcos");
            } else if (atributoMarcos < atributoLeo) {
                System.out.println("Leonardo");
            }else {
                System.out.println("Empate");
            }
        }
        sc.close();
    }
}
