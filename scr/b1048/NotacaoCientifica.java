package b1048;

import java.util.Scanner;

public class NotacaoCientifica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();

        String notacaoCientifica = String.format("%+.4E", numero);

        notacaoCientifica = notacaoCientifica.replaceAll("E(\\+|\\-)(\\d)$", "E$10$2");

        System.out.println(notacaoCientifica);
    }
}
