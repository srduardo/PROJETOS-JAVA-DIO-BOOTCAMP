import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> listaContatos;

    public AgendaContatos() {
        this.listaContatos = new HashSet<>();
    }

    
    /** 
     * @param nome
     * @param telefone
     */
    public void adicionarContato(String nome, int telefone){
        listaContatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        for (Contato contato : listaContatos) {
            if (!listaContatos.isEmpty()) { break; }
            System.out.println(contato);
        }
    }

    public void pesquisarPorNome(String nome){
        for (Contato contato : listaContatos) {
            if (listaContatos.isEmpty()) { break; }
            if (contato.getNome().startsWith(nome)){
                System.out.println(contato);
            }
        }
    }

    public void atualizarNumero(String nome, int novoNumero){
        for (Contato contato : listaContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                System.out.println(contato);
                break;
            }
        }
    }
    

    public Set<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(Set<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }
}
