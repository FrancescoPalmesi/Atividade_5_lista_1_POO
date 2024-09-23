import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private List<Conta> contas; // Lista de contas associadas ao cliente

    public Cliente(int codigo, String nome, String cpf, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contas = new ArrayList<>(); // Inicializa a lista de contas
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    // Método para adicionar uma conta ao cliente
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para listar todas as contas do cliente
    public void listarContas() {
        System.out.println("Contas do cliente " + nome + ":");
        for (Conta conta : contas) {
            System.out.println("Conta criada em: " + conta.getDataCriacao() + ", Saldo: R$" + conta.getSaldo());
        }
    }

    public void imprimirDadosCliente() {
        System.out.println("Código do Cliente: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
}