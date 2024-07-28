package b1048;

import java.util.Scanner;

public class OEnigmaDoPronalandia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] num = s.split("");

        for (int i = num.length -1; i >= 0 ; i--) {
            System.out.print(num[i]);
        }
        System.out.println();
        sc.close();
    }
}
