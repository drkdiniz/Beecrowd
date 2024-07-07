package b1048;


import java.util.Scanner;

public class mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cont = 0.0;
        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0) {
                cont += 1;
            }
        }
        System.out.println(cont + "valores positivos");





    }
}
