public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();

        Cliente cliente = new Cliente();
        cliente.setNome("Eduardo");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cc.depositar(200);
        cc.transferir(200, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.adicionarNovaConta(cp);
        banco.adicionarNovaConta(cc);
        banco.listarContas();
    }
}
