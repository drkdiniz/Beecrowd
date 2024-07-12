package b1048;

import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4) {
            switch (combustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;

            }
            combustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
