import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNovaConta(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        System.out.println("*** Lista de contas ***");
        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome() + " (Número: " + conta.getNumero() + ")");
        }
    }
}
