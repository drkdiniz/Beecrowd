package b1048;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecifrandoACarta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            int C = scanner.nextInt();
            int N = scanner.nextInt();
            scanner.nextLine();

            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String[] original = s1.split("");
            String[] substituto = s2.split("");

            Map<Character, Character> mapa = new HashMap<>();
            for (int i = 0; i < C; i++) {
                char origChar = original[i].charAt(0);
                char substChar = substituto[i].charAt(0);
                mapa.put(Character.toLowerCase(substChar), Character.toLowerCase(origChar));
                mapa.put(Character.toUpperCase(substChar), Character.toUpperCase(origChar));
            }

            for (int i = 0; i < N; i++) {
                String linhaCifrada = scanner.nextLine();
                StringBuilder decifrada = new StringBuilder();

                for (char c : linhaCifrada.toCharArray()) {
                    if (mapa.containsKey(c)) {
                        decifrada.append(mapa.get(c));
                    } else {
                        decifrada.append(c);
                    }
                }

                System.out.println(decifrada);
            }
            System.out.println();
        }
        scanner.close();
    }
}
