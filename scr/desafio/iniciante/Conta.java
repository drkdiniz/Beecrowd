package desafio.iniciante;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int s = 0;
            for (int j = 0; j < a; j++) {
                if (j % 2 == 0) {
                    s++;
                }
                else{
                    s--;
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
