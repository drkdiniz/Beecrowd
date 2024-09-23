package desafio.iniciante;

    import java.util.Scanner;

    public class RaizQuadrada10Aproximada {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double n = sc.nextInt();
            double x = 0.0;
            for (int i = 0; i < n; i++) {
                x += 6.0;
                x = (1.0 / x);
            }
            x += 3.0;

            System.out.printf("%.10f\n", x);

            sc.close();
        }
    }


