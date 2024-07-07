package b1048;

import java.util.Scanner;

public class ParesImparesPosNeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int positivo = 0, negativo = 0, par = 0, impar = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n > 0) {
                positivo++;
            }
            else if (n < 0) {
                negativo++;
            }
            if (n % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }

        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");


    }
}
