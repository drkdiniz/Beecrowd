package b1048;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class McPronalts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, Double> map = new HashMap<>();

        map.put(1001, 1.50);
        map.put(1002, 2.50);
        map.put(1003, 3.50);
        map.put(1004, 4.50);
        map.put(1005, 5.50);

        int n = sc.nextInt();
        double totalValue = 0;

        for (int i = 0; i < n; i++) {
            int index = sc.nextInt();
            int quantidade = sc.nextInt();
            double value = map.get(index);
            totalValue += value * quantidade;
        }
        System.out.printf("%.2f\n", totalValue);

        sc.close();
    }
}
