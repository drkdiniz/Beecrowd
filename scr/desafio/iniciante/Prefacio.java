package desafio.iniciante;

import java.util.Scanner;

public class Prefacio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado = 0;

        double q = (double)a / b;

        if (a > 0 && b < 0) {
            resultado =(int)Math.ceil(q);
        }
        else if (a < 0 || q > 0){
            resultado = (int)Math.floor(q);
        }
        int r = a - b * resultado;

        System.out.printf("%d %d\n", resultado, Math.abs(r));

    sc.close();
    }
}







