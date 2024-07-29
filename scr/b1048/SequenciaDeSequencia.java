package b1048;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaDeSequencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list;

        int caso = 1;

        while (true) {
            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            if (n < 0 || n > 200) break;

            list = new ArrayList<>();
            list.add(0);
            int sum = 1;
            for (int i = 0; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    list.add(i);
                    sum++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Caso %d: %d numero%s\n", caso, sum, sum == 1 ? "" : "s"));

            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(list.get(i));
            }
            sb.append("\n\n");

            System.out.print(sb);

            caso++;
        }

        sc.close();
    }
}
