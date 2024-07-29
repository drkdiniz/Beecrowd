package b1048;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DomingoDeManha {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("H:mm");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            LocalTime a = LocalTime.parse("5:00", fmt);
            LocalTime b = LocalTime.parse("9:00", fmt);
            LocalTime horario = LocalTime.parse(sc.next(), fmt);

            if (horario.isBefore(a) || horario.isAfter(b)) break;

            LocalTime horarioMaisTrajeto = horario.plusHours(1);
            LocalTime horaCombinada = LocalTime.parse("8:00", fmt);

            Duration duration = Duration.between(horarioMaisTrajeto, horaCombinada);

            long minutos = duration.toMinutes();

            if (minutos > 0) {
                minutos = 0;
            } else {
                minutos = Math.abs(minutos);
            }

            sb.append("Atraso maximo: ").append(minutos).append("\n");

        }
        System.out.println(sb);
    }
}
