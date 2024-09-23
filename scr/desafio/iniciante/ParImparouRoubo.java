package desafio.iniciante;

import java.util.Scanner;

public class ParImparouRoubo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolhaj1 = sc.nextInt();
        int jogador1 = sc.nextInt();
        int jogador2 = sc.nextInt();
        int rouboj1 = sc.nextInt();
        int acusarRoubo = sc.nextInt();

        int resultado = jogador1 + jogador2;

        switch (escolhaj1) {
            case 1:
                if (resultado % 2 == 0){
                    if (rouboj1 == 1 && acusarRoubo == 1){
                        System.out.println("Jogador 2 ganha!");
                    }
                    else {
                        System.out.println("Jogador 1 ganha!");
                    }
                }else {
                    if (rouboj1 == 1 && acusarRoubo == 0){
                        System.out.println("Jogador 1 ganha!");
                    }
                    else {
                        System.out.println("Jogador 2 ganha!");
                    }
                }
                break;
                case 0:
                    if (resultado % 2 == 0){
                        if (rouboj1 == 1 && acusarRoubo == 0){
                            System.out.println("Jogador 1 ganha!");
                        }
                        else {
                            System.out.println("Jogador 2 ganha!");
                        }
                    }else {
                        if (rouboj1 == 1 && acusarRoubo == 1){
                            System.out.println("Jogador 2 ganha!");
                        }
                        else {
                            System.out.println("Jogador 1 ganha!");
                        }
                    }
        }


        sc.close();
    }
}
