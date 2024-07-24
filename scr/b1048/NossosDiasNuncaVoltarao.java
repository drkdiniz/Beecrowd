package b1048;

import java.util.Scanner;

public class NossosDiasNuncaVoltarao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        String corte = frase.substring(0, n);

        System.out.println(corte);

        sc.close();
    }
}
