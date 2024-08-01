package b1048;

import java.util.Scanner;

public class AsAbasDePericles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            String s = sc.next();
            if (s.equalsIgnoreCase("fechou")) n++;
            else if (s.equalsIgnoreCase("clicou")) n--;
        }
        System.out.println(n);
    }
}
