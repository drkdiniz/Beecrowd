package desafio.iniciante;

import java.util.Scanner;

public class TriDu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a, b));

        sc.close();
    }
}
