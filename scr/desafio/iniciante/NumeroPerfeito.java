package desafio.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int sum = 0;
            for (int j = 1; j < a; j++) {
                if (a % j == 0) {
                    sum += j;
                }
            }
            if (sum == a) {
                list.add(a + " eh perfeito");
            }
            else {
                list.add(a + " nao eh perfeito");
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        sc.close();

    }
}
