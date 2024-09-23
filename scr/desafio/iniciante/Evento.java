package desafio.iniciante;

import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            int bonusExp = sc.nextInt();
            long exp = sc.nextLong();
            if (bonusExp == 0 || exp == 0) break;

            long resultado = exp * bonusExp;

            System.out.println(resultado);


        }
        sc.close();
    }
}
