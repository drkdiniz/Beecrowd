package desafio.iniciante;

public class Sequenciaij1 {

    public static void main(String[] args) {



        int cont = 60;
        for (int i = 1; cont >= 0; i += 3) {
            System.out.printf("I=%d J=%d\n", i, cont);
            cont -= 5;
        }



    }
}
