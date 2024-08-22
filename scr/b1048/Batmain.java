package b1048;

import java.util.Scanner;

public class Batmain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtsBandidos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtsBandidos; i++) {
            String bandido = sc.nextLine().trim();
            System.out.println("Y");
        }

        sc.close();
    }
}
