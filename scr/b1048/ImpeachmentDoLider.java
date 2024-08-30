package b1048;

import java.util.Scanner;

public class ImpeachmentDoLider {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int votesInFavor = 0;

            for (int i = 0; i < n; i++) {
                int vote = sc.nextInt();
                if (vote == 1) {
                    votesInFavor++;
                }
            }
            if (votesInFavor >= (2 * n + 2) / 3) {
                System.out.println("impeachment");
            } else {
                System.out.println("acusacao arquivada");
            }
        }
        sc.close();
    }
}
