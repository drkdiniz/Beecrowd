package b1048;

import java.util.Scanner;

public class JogoDoOperador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] num1 = new int[n];
        int[] num2 = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().trim();
            String[] aux = str.split( "");
            num1[i] = Integer.parseInt(aux[0]);
            num2[i] = Integer.parseInt(aux[2]);
            result[i] = Integer.parseInt(aux[4]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(num1[i] + " " + num2[i] + " " + result[i]);
        }





    }
}
