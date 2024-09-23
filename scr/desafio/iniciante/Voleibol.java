package desafio.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Voleibol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> listTentativa = new ArrayList<>();
        List<Integer> listAcertos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            for (int j = 0; j < 3; j++) {
                listTentativa.add(sc.nextInt());
            }
            for (int k = 0; k < 3; k++) {
                listAcertos.add(sc.nextInt());
            }
            sc.nextLine();
        }
        int totSaques = 0;
        int sucessoSaque = 0;
        int totBloqueio = 0;
        int sucessoBloqueio = 0;
        int totAtaque = 0;
        int sucessoAtaque = 0;
        for (int i = 0; i < listTentativa.size(); i+=3) {
            totSaques += listTentativa.get(i);
            sucessoSaque += listAcertos.get(i);

            totBloqueio += listTentativa.get(i+1);
            sucessoBloqueio += listAcertos.get(i+1);

            totAtaque += listTentativa.get(i+2);
            sucessoAtaque += listAcertos.get(i+2);
        }
        double saque = (double)(sucessoSaque * 100) / totSaques;
        double bloqueio = (double) (sucessoBloqueio * 100) / totBloqueio;
        double ataque = (double)(sucessoAtaque * 100) / totAtaque;

        System.out.printf("Pontos de Saque: %.2f %%.\n", saque);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", bloqueio);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", ataque);

        sc.close();

    }
}
