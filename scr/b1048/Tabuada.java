package b1048;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = i * n;
            System.out.printf("%d x %d = %d\n", i, n, resultado);
        }

        sc.close();
    }
}
