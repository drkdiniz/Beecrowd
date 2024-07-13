package b1048;

public class SequenciaS {
    public static void main(String[] args) {

        double s = 0.0;
        for (int i = 1; i <= 100; i++) {
            double aux = 1.0 / i;
            s += aux;
        }
        System.out.printf("%.2f\n", s);
    }
}
