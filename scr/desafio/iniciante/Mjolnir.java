package desafio.iniciante;

import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] concorrente = new String[n];
        String[] resultado = new String[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().trim();
            String[] aux = str.split(" ");
            concorrente[i] = aux[0];
        }
        for (int i = 0; i < n; i++) {
            if (concorrente[i].equalsIgnoreCase("Thor")) {
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }
        }
        sc.close();
    }
}
