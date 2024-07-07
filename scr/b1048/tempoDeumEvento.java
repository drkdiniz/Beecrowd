package b1048;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class tempoDeumEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Dia");
        int diaInicio = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String horaInicio = sc.nextLine().replaceAll("\\s+", "");
        System.out.println("Dia");
        int diaFinal = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String horaFinal = sc.nextLine().replaceAll("\\s+", "");

        String dataHoraInicio = String.format("%02d/04/2024 %s", diaInicio, horaInicio);
        String dataHoraFinal = String.format("%02d/04/2024 %s", diaFinal, horaFinal);

        LocalDateTime datetime1 = LocalDateTime.parse(dataHoraInicio, dtf);
        LocalDateTime datetime2 = LocalDateTime.parse(dataHoraFinal, dtf);

        Duration duracao = Duration.between(datetime1, datetime2);

        long diferencaEmSegundos = duracao.getSeconds();
        long dias = diferencaEmSegundos / 86400;
        long restoDias = diferencaEmSegundos % 86400;
        long horas = restoDias / 3600;
        long restoHoras = restoDias % 3600;
        long minutos = restoHoras / 60;
        long segundos = restoHoras % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();

    }
}
