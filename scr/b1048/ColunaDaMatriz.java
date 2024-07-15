package b1048;

import java.util.Scanner;

public class ColunaDaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        char T = sc.next().charAt(0);


        double[][] matriz = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }


        double resultado = 0.0;
        for (int j = 0; j < 12; j++) {
            resultado += matriz[j][C];
        }

        if (T == 'M') {
            resultado /= 12;
        }
        System.out.printf("%.1f\n", resultado);

        sc.close();
    }
}
