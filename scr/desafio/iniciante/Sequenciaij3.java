package desafio.iniciante;

public class Sequenciaij3 {
    public static void main(String[] args) {




        for (int i = 1; i <= 9; i += 2) {
            int startj = i + 6;
            for (int j = startj; j >= startj - 2; j--) {
                System.out.printf("I=%d, j=%d\n", i, j);
            }

        }
    }
}
