package desafio.iniciante;

import java.util.Scanner;

public class ConstruindoCasas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            if (!sc.hasNextInt()) break;
            int A = sc.nextInt();
            if (!sc.hasNextInt()) break;
            int B = sc.nextInt();
            if (!sc.hasNextInt()) break;
            int C = sc.nextInt();

            if (A == 0 || B == 0 || C == 0) {
                break;
            }
            int areaCasa = A * B;
            double areaDoTerreno = areaCasa / (C / 100.0);
            double ladoDoTerreno = Math.sqrt(areaDoTerreno);

            System.out.println((int) ladoDoTerreno);
        }
        sc.close();
    }
}
