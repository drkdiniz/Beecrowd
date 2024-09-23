package desafio.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACorridaDeLesmas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {

            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            if (n < 1 || n > 500) break;

            int maiorVel = 0;
            int nivel = 0;

            for (int i = 0; i < n; i++) {
                int velLesma = sc.nextInt();
                if (velLesma < 1 || velLesma > 50) break;
                if (velLesma > maiorVel) {
                    maiorVel = velLesma;
                }
            }
            if (maiorVel < 10) {
                nivel = 1;
            } else if (maiorVel < 20) {
                nivel = 2;
            } else {
                nivel = 3;
            }
            list.add(nivel);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        sc.close();
    }
}








