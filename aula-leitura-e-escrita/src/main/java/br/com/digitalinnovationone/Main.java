package br.com.digitalinnovationone;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void receberTecladoImprimirConsole() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line=bufferedReader.readLine();
        } while (!(line.isEmpty()));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
    public static void main(String[] args) throws IOException {
receberTecladoImprimirConsole();
    }
}