package b1048;

import java.util.Scanner;

public class NumeroAproximadoDePrimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        double p = num / Math.log(num);

        double m = 1.25506 * (num / Math.log(num));

        System.out.printf("%.1f %.1f\n", p, m);

        sc.close();
    }
}
