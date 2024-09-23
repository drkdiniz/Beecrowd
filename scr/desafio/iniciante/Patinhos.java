package desafio.iniciante;

import java.math.BigInteger;
import java.util.Scanner;

public class Patinhos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        while (n.compareTo(BigInteger.ZERO) >= 0) {
            BigInteger patinhos = n.subtract(BigInteger.ONE);
            if (patinhos.compareTo(BigInteger.ZERO) <= 0) {
                System.out.println("0");
            } else {
                System.out.println(patinhos);
            }
            n = sc.nextBigInteger();
        }

        sc.close();
    }
}
