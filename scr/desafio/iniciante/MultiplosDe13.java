package desafio.iniciante;

import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);


        sc.close();
    }
}
