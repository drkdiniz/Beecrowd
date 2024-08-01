package b1048;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NatalDePedrinho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int mes = sc.nextInt();
            int dia = sc.nextInt();

            LocalDate natal = LocalDate.of(2024, 12, 25);
            LocalDate dataParaVerificar = LocalDate.of(2024, mes, dia);

            long diasParaNatal = ChronoUnit.DAYS.between(dataParaVerificar, natal);

            if (diasParaNatal == 0) {
                System.out.println("E natal!");
            } else if (diasParaNatal == 1) {
                System.out.println("E vespera de natal!");
            } else if (diasParaNatal < 0) {
                System.out.println("Ja passou!");
            } else {
                System.out.println("Faltam " + diasParaNatal + " dias para o natal!");
            }
        }

        sc.close();




    }
}
