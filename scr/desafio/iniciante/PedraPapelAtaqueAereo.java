package desafio.iniciante;

import java.util.Scanner;

public class PedraPapelAtaqueAereo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String jogador1 = sc.next().toLowerCase();
            String jogador2 = sc.next().toLowerCase();
            switch (jogador1) {
                case "ataque":
                    if (jogador2.equals("ataque")) {
                        System.out.println("Aniquilacao mutua");
                    }
                    else if (jogador2.equals("pedra")) {
                        System.out.println("Jogador 1 venceu");
                    }
                    else if (jogador2.equals("papel")) {
                        System.out.println("Jogador 1 venceu");
                    }
                    break;
                case "pedra":
                    if (jogador2.equals("ataque")) {
                        System.out.println("Jogador 2 venceu");
                    }
                    else if (jogador2.equals("pedra")) {
                        System.out.println("Sem ganhador");
                    }
                    else if (jogador2.equals("papel")) {
                        System.out.println("Jogador 1 venceu");
                    }
                    break;
                case "papel":
                    if (jogador2.equals("ataque")) {
                        System.out.println("Jogador 2 venceu");
                    }
                    else if (jogador2.equals("pedra")) {
                        System.out.println("Jogador 2 venceu");
                    }
                    else if (jogador2.equals("papel")) {
                        System.out.println("Ambos venceram");
                    }
                    break;
            }

        }
        sc.close();
    }
}
