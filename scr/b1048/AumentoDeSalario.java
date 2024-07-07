package b1048;

import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n = sc.nextFloat();
        int percentual;
        float reajuste;
        float salario;

        if (n >= 0 && n <= 400.00) {
            percentual = 15;
            reajuste = n * percentual / 100;
            salario = n + reajuste;
        }
        else if (n > 400.00 && n <= 800.00) {
            percentual = 12;
            reajuste = n * percentual / 100;
            salario = n + reajuste;
        }
        else if (n > 800.00 && n <= 1200.00) {
            percentual = 10;
            reajuste = n * percentual / 100;
            salario = n + reajuste;
        }
        else if (n > 1200.00 && n <= 2000.00) {
            percentual = 7;
            reajuste = n * percentual / 100;
            salario = n + reajuste;
        }
        else {
            percentual = 4;
            reajuste = n * percentual / 100;
            salario = n + reajuste;
        }
        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);


        sc.close();
    }
}

