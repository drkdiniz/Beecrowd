package desafio.iniciante;

import java.util.Scanner;

public class AVoltaDoRadar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            if (n == 0) break;


            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) break;
                int total;
                if (x % 2 == 0) {
                    total = (x - 2) * 2 + 2;
                }
                else {
                    total = (x - 1) * 2 + 1;
                }
                System.out.println(total);

            }

        }
        sc.close();
    }
}
