package b1048;

import java.text.DecimalFormat;

public class teste {
    public static void main(String[] args) {

        double[] values = {1.0, 2.5, 3.0, 4.75, 5.0};

        DecimalFormat df = new DecimalFormat("#.##");

        for (double value : values) {
            if (value == (long) value) {
                System.out.printf("Valor: %d\n", (long) value);
            } else {
                System.out.printf("Valor: %s\n", df.format(value));
            }
        }
    }
}
