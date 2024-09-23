package br.com.digitalinnovationone;

import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void receberTecladoCriarDocumento() throws IOException{
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Digite 3 coisas: ");
        printWriter.flush();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File file = new File("Coisas.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getName()));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            line = scanner.nextLine();
        } while (!(line.equalsIgnoreCase("Fim")));

        printWriter.close();
        scanner.close();
        bufferedWriter.close();
    }

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
//        receberTecladoImprimirConsole();
        receberTecladoCriarDocumento();
    }
}