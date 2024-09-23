package desafio.iniciante;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaFixa = sc.nextInt();

        while (senhaFixa != 2002) {
            System.out.println("Senha Invalida");
            senhaFixa = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

    }
}
