package desafio.iniciante;

import java.util.Scanner;

public class PulaSapo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int P = sc.nextInt();
            int N = sc.nextInt();

            int[] saltos = new int[N];

            for (int i = 0; i < saltos.length; i++) {
                saltos[i] = sc.nextInt();
            }

            boolean game = true;
            for (int i = 1; i < saltos.length; i++) {
                int x = Math.abs(saltos[i] - saltos[i - 1]);
                if (x > P) {
                    game = false;
                    break;
                }
            }
            if (game) {
                System.out.println("YOU WIN");
            } else {
                System.out.println("GAME OVER");
            }
        sc.close();
    }
}

