package b1048;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pepe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            String aux = formatacao(s1) + ":" + formatacao(s2);
            LocalTime hora = LocalTime.parse(aux, dtf);
            if (s3.equals("1")) {
                System.out.println(hora + " - A porta abriu!");
            }
            else {
                System.out.println(hora + " - A porta fechou!");
            }
        }
        sc.close();
    }
    public static String formatacao(String input) {
        if (input.length() == 1){
            return "0" + input;
        }
        return input;
    }
}
