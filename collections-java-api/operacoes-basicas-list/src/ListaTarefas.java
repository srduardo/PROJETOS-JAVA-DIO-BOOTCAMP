import java.util.ArrayList;
import java.util.Comparator;

public class ListaTarefas implements Comparator<String>{
    private ArrayList<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public int compare(String descricao1, String descricao2){
        return descricao1.compareTo(descricao2);
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            int aux = compare(descricao, listaDeTarefas.get(i).getDescricao());

            if (aux == 0){
                listaDeTarefas.remove(i);
            }
        }
    }

    public int obterNumeroTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println((i + 1) + " - " + listaDeTarefas.get(i).getDescricao());
        }
    }

    public ArrayList<Tarefa> getListaDeTarefas() {
        return listaDeTarefas;
    }

    public void setListaDeTarefas(ArrayList<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }
}
