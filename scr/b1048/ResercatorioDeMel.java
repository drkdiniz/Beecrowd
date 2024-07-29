package b1048;

import java.util.Scanner;

public class ResercatorioDeMel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14;

        while (sc.hasNext()) {
            double volume = sc.nextDouble();
            double diametro = sc.nextDouble();

            double raio = diametro / 2;

            double altura = volume / (PI * Math.pow(raio, 2));

            double area = PI * Math.pow(raio, 2);

            System.out.printf("ALTURA = %.2f%n", altura);
            System.out.printf("AREA = %.2f%n", area);


        }
    }
}
