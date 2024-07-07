package b1048;

import java.util.Scanner;

public class SomaDeImparesConsecultivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = 0;

        if (x != y) {
            int a = Math.min(x, y) ;
            int b = Math.max(x, y) ;
            for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);



    sc.close();
    }
}
