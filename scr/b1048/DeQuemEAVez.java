package b1048;

import java.util.Scanner;

public class DeQuemEAVez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String player1 = sc.next();
            String choice1 = sc.next();
            String player2 = sc.next();
            String choice2 = sc.next();

            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            sc.nextLine();

            int sum = number1 + number2;
            boolean isEven = sum % 2 == 0;

            String winner;
            if (isEven) {
                winner = choice1.equals("PAR") ? player1 : player2;
            } else {
                winner = choice1.equals("IMPAR") ? player1 : player2;
            }

            System.out.println(winner);
        }

        sc.close();
    }
}
