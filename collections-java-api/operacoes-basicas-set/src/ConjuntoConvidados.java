import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        this.conjuntoConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        conjuntoConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        for (Convidado convidado : conjuntoConvidados) {
            if (convidado.getCodigoConvite() == codigoConvite){
                conjuntoConvidados.remove(convidado);
                break;
            }
        }
    }

    public int contarConvidados(){
        return conjuntoConvidados.size();
    }

    public void exibirConvidados(){
        for (Convidado convidado : conjuntoConvidados) {
            System.out.println(convidado);
        }
    }
}
