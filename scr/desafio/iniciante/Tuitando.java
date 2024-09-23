package desafio.iniciante;

import java.util.Scanner;

public class Tuitando {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        String[] aux = s.split("");

        if (aux.length <= 140){
            System.out.println("TWEET");
        }
        else {
            System.out.println("MUTE");
        }
        sc.close();
    }
}
