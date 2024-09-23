package desafio.iniciante;

import java.util.Scanner;

public class IdentificandoOCha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] palpites = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            palpites[i] = sc.nextInt();
        }
        for (int palpite : palpites) {
            if (palpite == n) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
