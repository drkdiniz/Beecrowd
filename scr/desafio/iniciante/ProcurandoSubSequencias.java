package desafio.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcurandoSubSequencias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int caso = 1;
        while (sc.hasNext()) {

            String s1 = sc.next();
            String s2 = sc.next();


            int sum = 0;
            int indice = s2.indexOf(s1);
            List<Integer> list = new ArrayList<>();

            while (indice != -1) {
                list.add(indice + 1);
                sum ++;
                indice = s2.indexOf(s1, indice + 1);

            }
            System.out.println("Caso #" + caso + ":");
            if (sum == 0) {
                System.out.println("Nao existe subsequencia");
            } else {
                System.out.println("Qtd.Subsequencias: " + sum);
                System.out.println("Pos: " + list.get(list.size() - 1));
            }
            System.out.println();
            caso++;

        }
        sc.close();
    }
}
