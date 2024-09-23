package desafio.iniciante;

import java.util.Scanner;

public class NumeracaoRomana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        /* Como não achei uma solução mais plausível eu inclui os valores que gerariam uma
        repeticação que excedesse 3 */
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        int n = sc.nextInt();
        for (int i = 0; i < decimal.length; i++) {
            while (n >= decimal[i]) {
                n -= decimal[i];
                sb.append(romano[i]);


            }
        }
        System.out.println(sb);

        sc.close();

    }
}
