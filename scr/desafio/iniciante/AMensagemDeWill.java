package desafio.iniciante;

import java.util.Scanner;

public class AMensagemDeWill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String a = sc.next();
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sb.append(a.charAt(num - 1));
            }

            System.out.println(sb);
        }

        sc.close();
    }
}
