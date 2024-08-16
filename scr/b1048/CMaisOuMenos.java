package b1048;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CMaisOuMenos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        map.put("suco de laranja", 120);
        map.put("morango fresco", 85);
        map.put("mamao", 85);
        map.put("goiaba vermelha", 70);
        map.put("manga", 56);
        map.put("laranja", 50);
        map.put("brocolis", 34);

        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {

            int cont = 0;
            for (int i = 0; i < n; i++) {
                int quantidade = sc.nextInt();
                sc.nextLine();
                String nome = sc.nextLine().trim().toLowerCase();
                if (map.containsKey(nome)) {
                    cont += map.get(nome) * quantidade;
                }
            }
            if (cont >= 110 && cont <= 130) {
                System.out.println(cont +" mg");
            }else if (cont > 130) {
                int result = cont - 130;
                System.out.println("Menos "+result+" mg");
            } else  {
                int result = 110 - cont;
                System.out.println("Mais "+result+" mg");
            }
            if (!sc.hasNextInt()) break;
            n = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
    }
}
