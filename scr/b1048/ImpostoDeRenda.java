package b1048;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario >= 0.0 && salario <= 2000.0) {
            System.out.println("Isento");
        }
       else {
           double valorAPagar = salario - 2000;
           if (valorAPagar <= 1000.0) {
               valorAPagar = valorAPagar * 0.08;
               System.out.printf("R$ %.2f", valorAPagar);
           }
           else if (valorAPagar > 1000.0 && valorAPagar <= 2500.0 ) {
               valorAPagar = (valorAPagar - 1000) * 0.18 + 80;
               System.out.printf("R$ %.2f", valorAPagar);
           }
           else {
               valorAPagar = (valorAPagar - 2500.0) * 0.28 + 80 + 270;
               System.out.printf("R$ %.2f", valorAPagar);
           }

        }



        sc.close();
    }
}
