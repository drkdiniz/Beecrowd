package b1048;

public class SequenciaS2 {
    public static void main(String[] args) {

        double s = 1.0;
        double aux = 0.0;
        double div = 2.0;

        for (int i = 2; i <= 38; i += 2) {
            aux = (i + 1.0) / div;
            s += aux;
            div *= 2;
        }
        System.out.printf("%.2f\n", s);
    }
}
