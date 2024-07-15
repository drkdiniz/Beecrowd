package b1048;

import java.util.Scanner;

public class PreenchimentoDeVetor4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                par[contPar] = num;
                contPar++;
                if (contPar == 5) {
                    for (int j = 0; j < par.length; j++) {
                        System.out.printf("par[%d] = %d\n",j , par[j]);
                    }
                    contPar = 0;
                }
            }
            else {
                impar[contImpar] = num;
                contImpar++;
                if (contImpar == 5) {
                    for (int j = 0; j < impar.length; j++) {
                        System.out.printf("impar[%d] = %d\n",j , impar[j]);
                    }
                    contImpar = 0;
                }
            }
        }
        for (int j = 0; j < contImpar; j++) {
            System.out.printf("impar[%d] = %d\n",j , impar[j]);
        }
        for (int j = 0; j < contPar; j++) {
            System.out.printf("par[%d] = %d\n",j , par[j]);
        }
        sc.close();
    }
}
