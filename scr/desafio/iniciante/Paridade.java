package desafio.iniciante;

import java.util.Scanner;

public class Paridade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String msg = sc.nextLine().trim();
        String saida = paridade(msg);
        sc.close();

        System.out.println(saida);

    }
    public static  String paridade(String s){
        int cont=0;
        String[] aux=s.split("");
        for (String string : aux) {
            if (string.equals("1")) {
                cont++;
            }
        }
        if (cont == 0){
            return s + "0";
        } else if (cont % 2 == 0) {
            return s + "0";
        }else {
            return s + "1";
        }
    }
}
