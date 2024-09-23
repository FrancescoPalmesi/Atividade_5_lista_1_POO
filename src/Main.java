public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente(1, "João Silva", "123.456.789-00", "Rua A, 123");
        Cliente cliente2 = new Cliente(2, "Maria Souza", "987.654.321-00", "Rua B, 456");

        // Criando contas para o cliente 1
        Conta conta1 = new Conta(cliente1, 1000.0);
        Conta conta2 = new Conta(cliente1, 2000.0); // Cliente 1 com mais de uma conta

        // Criando conta para o cliente 2
        Conta conta3 = new Conta(cliente2, 500.0);

        // Criando banco
        Banco banco = new Banco("Banco Central");

        // Adicionando contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        // Listando contas no banco
        banco.listarContas();

        // Operações em conta
        conta1.depositar(200.0);
        conta1.sacar(150.0);
        conta1.verificarSaldo();

        // Imprimindo dados do cliente 1 e suas contas
        cliente1.imprimirDadosCliente();
        cliente1.listarContas(); // Listando todas as contas do cliente 1

        // Imprimindo dados do cliente 2 e suas contas
        cliente2.imprimirDadosCliente();
        cliente2.listarContas(); // Listando todas as contas do cliente 2

        // Transferência de dinheiro da conta1 (João) para conta3 (Maria)
        conta1.transferir(conta3, 300.0);
    }
}