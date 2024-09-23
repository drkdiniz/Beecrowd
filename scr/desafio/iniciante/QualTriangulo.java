package desafio.iniciante;

import java.util.Scanner;

public class QualTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean triangulo = true;

        if (a >= b + c || b >= a + c || c >= a + b){
            System.out.println("Invalido");
            triangulo = false;
        }else{
            if (a == b && b == c){
                System.out.println("Valido-Equilatero");
            }else if (a == b || a == c || b == c){
                System.out.println("Valido-Isosceles");
            }else {
                System.out.println("Valido-Escaleno");
            }
        }
        if (triangulo){
            int a2 = a * a;
            int b2 = b * b;
            int c2 = c * c;

            System.out.print("Retangulo: ");
            if (a2 == b2 + c2 || b2 == a2 + c2 || c2 == a2 + b2){
                System.out.println("S");
            }else{
                System.out.println("N");
            }
        }
        sc.close();
    }
}
