package b1048;

import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0;
        int r = 0;
        int s = 0;

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String cobaia = sc.nextLine().toUpperCase();
            if (cobaia.contains("C")) {
                String[] aux = cobaia.split(" ");
                c += Integer.parseInt(aux[0]);
            }
            else if (cobaia.contains("R")) {
                String[] aux = cobaia.split(" ");
                r += Integer.parseInt(aux[0]);
            }
            else if (cobaia.contains("S")) {
                String[] aux = cobaia.split(" ");
                s += Integer.parseInt(aux[0]);
            }
        }
        int total = c + r + s;
        double porcentageC = (double) c / total * 100;
        double porcentageR = (double) r / total * 100;
        double porcentageS = (double) s / total * 100;

        System.out.printf("Total: %d cobaias\n", total);
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.printf("Percentual de coelhos: %.2f%%\n", porcentageC);
        System.out.printf("Percentual de ratos: %.2f%%\n", porcentageR);
        System.out.printf("Percentual de sapos: %.2f%%\n", porcentageS);

    sc.close();

    }
}
