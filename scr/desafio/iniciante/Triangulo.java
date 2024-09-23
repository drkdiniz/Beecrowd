package desafio.iniciante;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        boolean triangulo = testeTriangulo(a, b, c) || testeTriangulo(a, b, d) ||
                testeTriangulo(a, c, d) || testeTriangulo(b, c, d);

        if (triangulo) {
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
    }

    private static boolean testeTriangulo(int x, int y, int z) {
        return x + y > z && x + z > y && y + z > x;

    }

}
