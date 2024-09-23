package desafio.iniciante;

import java.math.BigInteger;
import java.util.Scanner;

public class PoligonosRegularesSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        BigInteger bigN = BigInteger.valueOf(N);
        BigInteger bigL = BigInteger.valueOf(L);
        BigInteger perimetro = bigN.multiply(bigL);

        System.out.println(perimetro);

        sc.close();

        sc.close();
    }
}
