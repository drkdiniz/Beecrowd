package b1048;

import java.util.Scanner;

public class FibonacciRapido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double x = Math.sqrt(5);

        double fib = ((Math.pow((1+x)/2, n)) - (Math.pow((1-x)/2, n))) / x;

        System.out.printf("%.1f%n", fib);

        sc.close();
    }
}
