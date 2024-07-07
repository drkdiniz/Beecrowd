package b1048;

import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posMaior = 0;

        for (int i = 1; i <= 100; i++) {
            int x = sc.nextInt();
            if (x > maior) {
                maior = x;
                posMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posMaior);




        sc.close();
    }
}
