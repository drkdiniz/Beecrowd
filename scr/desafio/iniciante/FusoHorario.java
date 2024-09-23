package desafio.iniciante;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int horaChegada = (a + b + c) % 24;

        if (horaChegada < 0) {
            horaChegada += 24;
        }

        System.out.println(horaChegada);
    }
}
