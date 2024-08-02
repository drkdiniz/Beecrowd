package b1048;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int n = sc.nextInt();

            System.out.println(n - 1);
        }
        sc.close();
    }
}
