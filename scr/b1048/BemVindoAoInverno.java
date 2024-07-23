package b1048;

import java.util.Scanner;

public class BemVindoAoInverno {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {

            if (!sc.hasNextInt()) break;
            int a = sc.nextInt();
            if (a > 100 || a < -100) break;

            if (!sc.hasNextInt()) break;
            int b = sc.nextInt();
            if (b > 100 || b < -100) break;

            if (!sc.hasNextInt()) break;
            int c = sc.nextInt();
            if (c > 100 || c < -100) break;

            int difAB = Math.abs(a - b);
            int difBC = Math.abs(b - c);

            if (a > b) {
                if (c >= b) {
                    System.out.println(":)");
                } else if (difAB > difBC) {
                    System.out.println(":)");
                } else if (difBC > difAB) {
                    System.out.println(":(");
                }
            } else if (a < b) {
                if (c <= b) {
                    System.out.println(":(");
                } else if (difAB > difBC) {
                    System.out.println(":(");
                } else if (difBC > difAB) {
                    System.out.println(":)");
                }
            } else {
                if (c > b) {
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            }
        }

    }
}
