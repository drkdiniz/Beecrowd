package b1048;

import java.util.Scanner;

public class ARespostaDeTheon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] pessoas = new int[n];

        for (int i = 0; i < n; i++) {
            pessoas[i] = sc.nextInt();
        }

        int menorValor = pessoas[0];
        int indice = 1;
        for (int i = 1; i < n; i++) {
            if (pessoas[i] < menorValor) {
                menorValor = pessoas[i];
                indice = i + 1;
            }
        }
        System.out.println(indice);
    }
}
