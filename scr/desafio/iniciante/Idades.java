package desafio.iniciante;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int cont = 0;

        while (n >= 0) {
            sum += n;
            cont++;
            n = sc.nextInt();
        }
        double avg = (double) sum / cont;
        System.out.printf("%.2f\n", avg);

        sc.close();
    }
}
