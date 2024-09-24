package desafio.iniciante;

import java.util.Scanner;

public class Beecrowd2547 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int n = sc.nextInt();
            int alturaMinima = sc.nextInt();
            int alturaMaxima = sc.nextInt();

            int contador = 0;
            for (int i = 0; i < n; i++) {
                int convidado = sc.nextInt();
                if (convidado >= alturaMinima && convidado <= alturaMaxima) {
                    contador++;
                }
            }
            System.out.println(contador);
        }
        sc.close();
    }
}
