package desafio.iniciante;

import java.util.Scanner;

public class Bazinga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= T; i++) {
            String[] escolha = sc.nextLine().split(" ");
            String sheldon = escolha[0];
            String raj = escolha[1];

            String resultado = jokenpo(sheldon, raj);
            System.out.printf("Caso #%d: %s%n", i, resultado);
        }

        sc.close();
    }

    public static String jokenpo(String sheldon, String raj) {
        if (sheldon.equals(raj)) {
            return "De novo!";
        }

        switch (sheldon) {
            case "tesoura":
                if (raj.equals("papel") || raj.equals("lagarto")) {
                    return "Bazinga!";
                }
                break;
            case "papel":
                if (raj.equals("pedra") || raj.equals("Spock")) {
                    return "Bazinga!";
                }
                break;
            case "pedra":
                if (raj.equals("lagarto") || raj.equals("tesoura")) {
                    return "Bazinga!";
                }
                break;
            case "lagarto":
                if (raj.equals("Spock") || raj.equals("papel")) {
                    return "Bazinga!";
                }
                break;
            case "Spock":
                if (raj.equals("tesoura") || raj.equals("pedra")) {
                    return "Bazinga!";
                }
                break;
        }

        return "Raj trapaceou!";
    }
}

