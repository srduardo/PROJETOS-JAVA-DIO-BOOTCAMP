
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    
    /** 
     * @return Map<String, Integer>
     */
    public Map<String, Integer> getAgendaContatoMap() {
        return agendaContatoMap;
    }

    public void setAgendaContatoMap(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = agendaContatoMap;
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }
}
