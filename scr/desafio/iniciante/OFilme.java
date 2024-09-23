package desafio.iniciante;

import java.util.Scanner;

public class OFilme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precoAntigo = sc.nextDouble();
        double precoNovo = sc.nextDouble();

        double percentualDeAumento = (precoNovo - precoAntigo) /precoAntigo * 100;

        System.out.printf("%.2f%%\n", percentualDeAumento);

        sc.close();
    }
}
