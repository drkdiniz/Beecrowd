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

            int difAB = b - a;
            int difBC = c - b;

            if (difAB < 0) { // a > b
                if (difBC >= 0) {
                    System.out.println(":)");
                } else if (difBC > difAB) {
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            } else if (difAB > 0) { // a < b
                if (difBC <= 0) {
                    System.out.println(":(");
                } else if (difBC < difAB) {
                    System.out.println(":(");
                } else {
                    System.out.println(":)");
                }
            } else { // a == b
                if (difBC > 0) {
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            }
        }
        sc.close();
    }
}
