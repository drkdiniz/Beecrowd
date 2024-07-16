package b1048;

import java.util.Scanner;

public class AbaixoDaDiagonalSecundaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char O = sc.next().charAt(0);

        double[][] matriz = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        double sum = 0.0;

        int cont = 0;
        for (int i = 11; i > 0; i--) {
            for (int j = 11; j > cont; j--) {
                sum += matriz[i][j];
            }
            cont++;

        }
        if (O == 'M') {
            sum = sum / 66;
        }
        System.out.printf("%.1f\n", sum);

        sc.close();
    }
}
