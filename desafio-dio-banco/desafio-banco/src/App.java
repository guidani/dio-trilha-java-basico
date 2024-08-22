public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        banco.setNome("Banco Mundial");

        Cliente c1 = new Cliente();
        c1.setNome("Guilherme");
        Cliente c2 = new Cliente();
        c2.setNome("Daniel");

        ContaCorrente cc = new ContaCorrente(c1);
        cc.depositar(100);
        cc.imprimirExtrato();

        ContaPoupanca cp = new ContaPoupanca(c2);
        cp.depositar(100);
        cp.imprimirExtrato();

        banco.adicionarCliente(cp);
        banco.adicionarCliente(cc);

        banco.listarClientes();

        System.out.println("#".repeat(50));
        cc.transferir(12, cp);

        System.out.println("#".repeat(50));
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
