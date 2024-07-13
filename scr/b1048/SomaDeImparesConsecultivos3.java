package b1048;

import java.util.Scanner;

public class SomaDeImparesConsecultivos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] somas = new int[n];




        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int cont = 0;
            int sum = 0;
            for (int j = x; cont < y; j++) {
                if (j % 2 != 0) {
                    sum += j;
                    cont++;

                }
            }
            somas[i] = sum;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(somas[i]);
        }
        sc.close();
    }
}
