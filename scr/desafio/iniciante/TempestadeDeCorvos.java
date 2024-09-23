package desafio.iniciante;

import java.util.Scanner;

public class TempestadeDeCorvos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            if (!sc.hasNextInt()) break;
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int vel = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            if (x1 < 0 || x1 > 100 || y1 < 0 || y1 > 100 || x2 < 0 || x2 > 100
                    || y2 < 0 || y2 > 100 || vel < 0 || vel > 100 || r1 < 0
                    || r1 > 100 || r2 < 0 || r2 > 100) {
                break;
            }

            double distanciaInicial = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double distanciaDeMovimento = vel * 1.5;
            double distanciaFinal = distanciaInicial + distanciaDeMovimento;
            double alcance = r1 + r2;

            if (distanciaFinal <= alcance) {
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }

        }
        sc.close();
    }
}



