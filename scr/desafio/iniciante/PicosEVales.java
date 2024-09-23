package desafio.iniciante;

import java.util.Scanner;

public class PicosEVales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean test = false;
        for (int i = 0; i < n - 2; i++) {
            if  ((a[i] > a[i + 1] && a[i + 1] < a[i + 2]) ||
                    (a[i] < a[i + 1] && a[i + 1] > a[i + 2])) {
                test = true;
                break;
            }
        }
        if (test) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        sc.close();
    }
}
