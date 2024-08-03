package b1048;


import java.util.Scanner;

public class Galopeira {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            String s = sc.next();
            String[]aux = s.split("");
            double galopeira = aux.length / 100.0;
            System.out.printf("%.2f\n", galopeira);
        }
        sc.close();
    }
}
