package desafio.iniciante;

import java.util.Scanner;

public class UltrapassandoZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int n = 0;
        int sum = 0;
        int cont = 0;

        do {
            n = sc.nextInt();
        } while (n <= a);

        for (int i = a; sum < n; i++) {
            sum += i;
            cont++;
        }
        System.out.println(cont);
    }
}
