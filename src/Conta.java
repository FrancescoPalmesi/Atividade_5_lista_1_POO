import java.time.LocalDate;

public class Conta {
    private Cliente cliente;
    private LocalDate dataCriacao;
    private double saldo;

    public Conta(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.dataCriacao = LocalDate.now(); // Data atual de criação da conta
        this.saldo = saldoInicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para " + contaDestino.getCliente().getNome() + " realizada com sucesso.");
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente ou valor inválido.");
        }
    }
}