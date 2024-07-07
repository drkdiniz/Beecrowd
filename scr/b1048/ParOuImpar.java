package b1048;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            int a = sc.nextInt();
            list[i] = a;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                System.out.println("NULL");
            }
            else if (list[i] % 2 == 0) {
                System.out.print("EVEN ");
            }
            else {
                System.out.print("ODD ");
            }
            if (list[i] > 0) {
                System.out.println("POSITIVE");
            }
            else if (list[i] < 0) {
                System.out.println("NEGATIVE");
            }
        }


        sc.close();
    }
}
