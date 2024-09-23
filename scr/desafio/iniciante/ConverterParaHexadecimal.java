package desafio.iniciante;

import java.util.Scanner;

public class ConverterParaHexadecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String hexadecimal = Integer.toHexString(n).toUpperCase();

        System.out.println(hexadecimal);

        sc.close();
    }
}
