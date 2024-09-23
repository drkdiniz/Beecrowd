package desafio.iniciante;

import java.util.Scanner;

public class VaiTerCopa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            if (n < 0 || n > 100) break;

            if (n == 0) {
                System.out.println("vai ter copa!");
            }
            else {
                System.out.println("vai ter duas!");
            }
        }

        sc.close();
    }
}
