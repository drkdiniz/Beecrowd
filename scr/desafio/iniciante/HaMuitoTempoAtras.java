package desafio.iniciante;

import java.util.Scanner;

public class HaMuitoTempoAtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            int year = 2015 - T;

            if (year > 0) {
                System.out.println(year + " D.C.");
            } else {
                System.out.println((Math.abs(year) + 1) + " A.C.");
            }
        }
        sc.close();
    }

}
