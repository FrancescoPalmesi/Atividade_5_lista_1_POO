import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada ao banco " + nome + " com sucesso.");
    }

    public void listarContas() {
        System.out.println("Contas no banco " + nome + ":");
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            System.out.println("Cliente: " + cliente.getNome() + ", Saldo: R$" + conta.getSaldo());
        }
    }
}