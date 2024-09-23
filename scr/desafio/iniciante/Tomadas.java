package desafio.iniciante;

import java.util.Scanner;

public class Tomadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int result = a-1 + b-1 + c-1 + d;

        System.out.println(result);

        sc.close();
    }
}
