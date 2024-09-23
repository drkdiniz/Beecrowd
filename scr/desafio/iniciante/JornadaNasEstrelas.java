package desafio.iniciante;

import java.util.Scanner;

public class JornadaNasEstrelas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //utilizei long pois nos testes do beecrowd estava acusando divergência nos resultados.
        long[] carneiros = new long[n];
        boolean[] estrelaAtacada = new boolean[n];
        int jornada = 0;
        int estrelasAtacadas = 0;
        long carneirosRestantes = 0;

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) break;
            carneiros[i] = sc.nextInt();
            if (carneiros[i] < 1) break;

        }
        while (jornada >= 0 && jornada < n) {
            //precisei colocar a lógica da direção antes do carneiro ser decrementado para evitar problemas de direção
            //antes dessa alteração eu estava com problemas quando o carneiro se tornava 0
            boolean direcao = carneiros[jornada] % 2 == 0;
            if (carneiros[jornada] > 0) {
                carneiros[jornada]--;
                if (!estrelaAtacada[jornada]) {
                    estrelaAtacada[jornada] = true;
                    estrelasAtacadas++;
                }
            }
            if (direcao) {
                jornada--;
            }  else {
                jornada++;
            }
        }
        for (int i = 0; i < n; i++) {
            carneirosRestantes += carneiros[i];
        }
        System.out.printf("%d %d\n", estrelasAtacadas, carneirosRestantes);

    }
}
