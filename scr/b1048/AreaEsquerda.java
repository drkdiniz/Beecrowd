package b1048;

import java.util.Scanner;

public class AreaEsquerda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char O = sc.next().charAt(0);

        double[][] matriz = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        int contador = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < i - contador; j++) {
                    sum += matriz[i][j];
            }
            if (i == 5){
                contador ++;
            }
            if (i > 5){
                contador += 2;
            }
        }
        if (O == 'M') {
            sum = sum / 30;
        }
        System.out.printf("%.1f\n", sum);

        sc.close();
    }
}





