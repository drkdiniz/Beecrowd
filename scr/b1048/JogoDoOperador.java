package b1048;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JogoDoOperador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();

            int[] num1 = new int[n];
            int[] num2 = new int[n];
            int[] result = new int[n];
            String[] operadorEliminado = new String[n];
            String[] nomes = new String[n];

            for (int i = 0; i < n; i++) {
                String str = sc.nextLine().trim();
                String[] aux = str.split("");
                num1[i] = Integer.parseInt(aux[0]);
                num2[i] = Integer.parseInt(aux[2]);
                result[i] = Integer.parseInt(aux[4]);
            }

            for (int i = 0; i < n; i++) {
                String nome = sc.next().trim();
                int indice = sc.nextInt() - 1;
                char operador = sc.next().charAt(0);
                nomes[i] = nome;

                boolean correto = false;
                switch (operador) {
                    case '+':
                        correto = (num1[indice] + num2[indice] == result[indice]);
                        break;
                    case '-':
                        correto = (num1[indice] - num2[indice] == result[indice]);
                        break;
                    case '*':
                        correto = (num1[indice] * num2[indice] == result[indice]);
                        break;
                    case 'I':
                        correto = (num1[indice] + num2[indice] != result[indice] &&
                                num1[indice] - num2[indice] != result[indice] &&
                                num1[indice] * num2[indice] != result[indice]);
                        break;
                }

                if (!correto) {
                    operadorEliminado[i] = nome;
                }
            }
            List<String> errados = new ArrayList<>();
            for (String nome : operadorEliminado) {
                if (nome != null) {
                    errados.add(nome);
                }
            }
            Collections.sort(errados);

            if (errados.isEmpty()) {
                System.out.println("You Shall All Pass!");
            } else {
                for (String nome : errados) {
                    System.out.print(nome + " ");
                }
            }
        }
        sc.close();
    }
}
