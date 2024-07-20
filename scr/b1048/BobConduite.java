package b1048;

import java.util.Scanner;

public class BobConduite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = Math.abs(a) + Math.abs(b);
            System.out.println(c);
        }
        sc.close();
    }
}




