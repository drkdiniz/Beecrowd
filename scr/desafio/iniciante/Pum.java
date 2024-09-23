package desafio.iniciante;

import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        double cont = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j != 3) {
                    cont = Math.pow(i,j);
                    System.out.print((int)cont + " ");
                }
                else {
                    cont = Math.pow(i,j);
                    System.out.println((int)cont);
                }
            }
        }


        sc.close();
    }
}
