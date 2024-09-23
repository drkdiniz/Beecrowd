package desafio.iniciante;

import java.util.Scanner;

public class SomandoInteirosConsecultivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        int sum = 0;
        int aux = 0;

        do {
             n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            aux = (i + a);
            sum += aux;
            aux = 0;
        }
        System.out.println(sum);
    }
}
