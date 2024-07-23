package b1048;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aaateste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q, r;
        if (a >= 0) {
            q = a / b;
            r = a % b;
        } else {
            // x = c e y = d
            int c = 0, d = 0;

            if (b < 0) c = b * -1;
            else c = b;

            for (r = 0; r < c; r++) {
                d = a - r;
                if (d % b == 0) break;
            }
            q = d / b;
        }

        System.out.println(q + " " + r);
        sc.close();
    }
}
