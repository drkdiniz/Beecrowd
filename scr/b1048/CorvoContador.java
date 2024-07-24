package b1048;

import java.util.Scanner;

public class CorvoContador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] piscadas = {"--*", "-*-", "-**", "*--", "*-*", "**-", "***"};
        int[] valores = {1, 2, 3, 4, 5, 6, 7};
        int[] numSorteados = new int[3];
        int sum = 0;
        int indice = 0;

        while (indice < 3) {
            String str = sc.nextLine();

            if (str.equals("caw caw")) {
                numSorteados[indice] = sum;
                sum = 0;
                indice ++;
            }
            for (int i = 0; i < piscadas.length; i++) {
                if (str.equals(piscadas[i])) {
                    sum += valores[i];
                    break;
                }
            }
        }
        for (Integer num : numSorteados) {
            System.out.println(num);
        }
        sc.close();
    }
}
