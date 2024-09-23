package desafio.iniciante;

import java.util.Scanner;

public class GRenais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inter = 0;
        int gremio = 0;
        int empates = 0;
        int cont = 0;
        boolean continuar = true;

        do {
            int i = sc.nextInt();
            int g = sc.nextInt();
            cont++;
            if (i == g) {
                empates ++;
            }
            else if (i > g) {
                inter++;
            }
            else {
                gremio++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int novo = sc.nextInt();
            switch (novo) {
                case 1:
                    break;

                case 2:
                    continuar = false;
                    break;
            }

        } while (continuar);

        System.out.println(cont + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);

        if (inter == gremio) {
            System.out.println("Nao houve vencedor");
        }
        else if (inter > gremio) {
            System.out.println("Inter venceu mais");
        }
        else {
            System.out.println("Gremio venceu mais");
        }


    }
}
