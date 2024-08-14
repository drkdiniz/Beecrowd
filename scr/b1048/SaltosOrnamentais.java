package b1048;

import java.util.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SaltosOrnamentais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //Tive que trocar o hashmap para o linkedhashmap para preservar a ordem na iteração,
        //não foi necessário remover nenhuma entrada dupliacada mas no site ocorreram erros em função da ordem.
        Map<String, Double> saltosOrnamentais = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            double gd = sc.nextDouble();
            double[] notas = new double[7];

            for (int j = 0; j < 7; j++) {
                notas[j] = sc.nextDouble();
            }
            Arrays.sort(notas);
            double sum = 0.0;
            for (int j = 1; j < 6; j++) {
                sum += notas[j];
            }

            double result = sum * gd;
            saltosOrnamentais.put(nome, result);
        }
        for (Map.Entry<String, Double> entry : saltosOrnamentais.entrySet()) {
            System.out.printf("%s %.2f\n", entry.getKey(), entry.getValue());
        }
    }
}
