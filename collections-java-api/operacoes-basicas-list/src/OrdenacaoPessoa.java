import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenadosPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(ordenadosPorIdade);
        return ordenadosPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenadosPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(ordenadosPorAltura, new CompararPorAltura());
        return ordenadosPorAltura;
    }
}
