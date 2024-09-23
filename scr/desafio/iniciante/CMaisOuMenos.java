package desafio.iniciante;

import java.util.HashMap;
import java.util.Scanner;

public class CMaisOuMenos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> alimentos = new HashMap<>();
        alimentos.put("suco de laranja", 120);
        alimentos.put("morango fresco", 85);
        alimentos.put("mamao", 85);
        alimentos.put("goiaba vermelha", 70);
        alimentos.put("manga", 56);
        alimentos.put("laranja", 50);
        alimentos.put("brocolis", 34);

        while (true) {
            int T = sc.nextInt();

            if (T == 0) {
                break;
            }

            int totalVitaminaC = 0;

            for (int i = 0; i < T; i++) {
                int quantidade = sc.nextInt();
                String alimento = sc.nextLine().trim();
                totalVitaminaC += quantidade * alimentos.get(alimento);
            }

            if (totalVitaminaC > 130) {
                System.out.println("Menos " + (totalVitaminaC - 130) + " mg");
            } else if (totalVitaminaC < 110) {
                System.out.println("Mais " + (110 - totalVitaminaC) + " mg");
            } else {
                System.out.println(totalVitaminaC + " mg");
            }
        }

        sc.close();
    }
}
