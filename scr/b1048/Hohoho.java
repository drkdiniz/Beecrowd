package b1048;

import java.util.Collections;
import java.util.Scanner;

public class Hohoho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ho = String.join("", Collections.nCopies(n -1, " Ho"));


        System.out.println("Ho" + ho + "!");
        sc.close();
    }
}

