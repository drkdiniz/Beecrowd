package b1048;

import java.util.Scanner;

public class FelizNatal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String mensagem = "Feliz nat" + "a".repeat(n) + "l!";

        System.out.println(mensagem);

        sc.close();
    }
}
