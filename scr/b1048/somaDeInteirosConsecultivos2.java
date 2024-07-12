package b1048;

import java.util.Scanner;

public class somaDeInteirosConsecultivos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] impares = new int[n];


        for (int i = 0; i < n; i++) {
            int cont =0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int start = Math.min(a, b);
            int end = Math.max(a, b);
            for (int j = start + 1; j < end; j++) {
                if (j % 2 != 0) {
                    cont += j;
                }
            }
            impares[i] = cont;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(impares[i]);
        }
    }

}
