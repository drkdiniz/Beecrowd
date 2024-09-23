package desafio.iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class SequenciasCrescentes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder output = new StringBuilder();

        while (true) {
            int x = Integer.parseInt(reader.readLine().trim());
            if (x == 0) {
                break;
            }

            for (int i = 1; i <= x; i++) {
                output.append(i);
                if (i < x) {
                    output.append(" ");
                } else {
                    output.append("\n");
                }
            }
        }

        writer.write(output.toString());
        writer.flush();
        reader.close();
        writer.close();
    }
}
