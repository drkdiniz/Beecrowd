package b1048;

import java.util.Scanner;

public class NomeNoFormulario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] aux = s.split("");

        if (aux.length <= 80){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


        sc.close();
    }
}
