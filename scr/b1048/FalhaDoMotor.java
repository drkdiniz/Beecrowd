package b1048;

import java.util.Scanner;

public class FalhaDoMotor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int indice = 0;
        int aumento = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a >= aumento){
                aumento = a;
            }
            else {
                indice = i + 1;
                break;
            }
        }
        System.out.println(indice);

        sc.close();
    }
}
