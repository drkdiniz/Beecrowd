package b1048;

import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int cont = 0;

        for (int i = 1; i <= y; i++) {
            System.out.print(i);
            cont++;
            if (cont == x || i == y) {
                System.out.println();
                cont = 0;
            } else {
                System.out.print(" ");
            }
        }

    sc.close();
    }
}
