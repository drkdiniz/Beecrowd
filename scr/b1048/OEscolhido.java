package b1048;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OEscolhido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            double b = sc.nextDouble();
            map.put(a, b);
        }
        double maiorValor = 0.0;
        int index = 0;
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            if (entry.getValue() > maiorValor) {
                maiorValor = entry.getValue();
                index = entry.getKey();
            }
        }
        if (maiorValor >= 8.0) {
            System.out.println(index);
        }
        else {
            System.out.println("Minimum note not reached");
        }
        sc.close();
    }
}
