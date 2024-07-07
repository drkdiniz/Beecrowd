package b1048;

import java.util.Scanner;

public class ParesEntreCincoNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 0;
        for (int i = 0 ; i < 5 ; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                cont += 1;
            }
        }
        System.out.println(cont + " valores pares");



        sc.close();

    }
}
