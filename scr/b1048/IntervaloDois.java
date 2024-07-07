package b1048;

import java.util.Scanner;

public class IntervaloDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0, out = 0;
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
            if (vect[i] >= 10 && vect[i] <= 20) {
                in++;
            }
            else {
                out++;
            }

        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
