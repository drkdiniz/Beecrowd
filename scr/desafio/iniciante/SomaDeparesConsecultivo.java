package desafio.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDeparesConsecultivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        List<Integer> list = new ArrayList<>();



        while (x != 0) {
            int cont = 0;
            int soma = 0;
            for (int i = x; cont < 5; i++) {
                if (i % 2 == 0) {
                    soma += i;
                    cont++;
                }

            }
            list.add(soma);
            x = sc.nextInt();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
