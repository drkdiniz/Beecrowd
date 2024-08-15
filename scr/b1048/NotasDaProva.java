package b1048;

import java.util.Scanner;

public class NotasDaProva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("E");
        }else if (n > 0 && n <= 35) {
            System.out.println("D");
        }else if (n > 35 && n <= 60) {
            System.out.println("C");
        }else if (n > 60 && n <= 85) {
            System.out.println("B");
        }else{
            System.out.println("A");
        }
        sc.close();
    }

}
