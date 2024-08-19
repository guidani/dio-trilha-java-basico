import java.util.Scanner;

public class Contaterminal {
    static Integer numero = 0;
    static String agencia = "";
    static String nomeCliente = "";
    static double saldo = 0.0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // ContaTerminal ct = new ContaTerminal(123, "null", "null", 0.0);
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu número: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
