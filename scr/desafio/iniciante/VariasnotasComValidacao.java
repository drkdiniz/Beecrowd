package desafio.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class VariasnotasComValidacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[2];
        boolean continuar = true;
        int indice = 0;

        while (continuar) {
            double nota = sc.nextDouble();
            if (nota >= 0.0 && nota <= 10.0) {
                notas[indice] = nota;
                indice++;
            }
            else {
                System.out.println("nota invalida");
            }
            if (indice == 2) {
                double avg = (notas[0] + notas[1]) / 2;
                System.out.printf("media = %.2f\n", avg);
                int novoCalculo = 0;

                 do {
                     System.out.println("novo calculo (1-sim 2-nao)");
                     novoCalculo = sc.nextInt();
                }while (novoCalculo != 1 && novoCalculo != 2);

                if (novoCalculo == 1) {
                    notas = new double[2];
                    indice = 0;

                }
                else if (novoCalculo == 2) {
                    continuar = false;
                }


            }
        }





    }
}
