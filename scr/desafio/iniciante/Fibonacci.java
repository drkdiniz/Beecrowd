package desafio.iniciante;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        if (n == 1) {
            System.out.println(t1);
        }
        else if (n == 2) {
            System.out.printf("%d %d\n", t1, t2);
        }
        else {
            System.out.printf("%d %d ", t1, t2);
            for (int i = 3; i <= n; i++) {
                int t3 = t1 + t2;
                t1 = t2;
                t2 = t3;
                System.out.print(t3);
                if (i == n) {
                    System.out.println();
                }
                else {
                    System.out.print(" ");
                }
            }
        }


    sc.close();
    }
}

