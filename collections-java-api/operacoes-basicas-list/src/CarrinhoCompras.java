import java.util.ArrayList;
import java.util.Comparator;

public class CarrinhoCompras implements Comparator<String> {
    private ArrayList<ProdutoUm> carrinhoCompras;

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    
    /** 
     * @param nome01
     * @param nome02
     * @return int
     */
    public int compare(String nome01, String nome02){
        return nome01.compareTo(nome02);
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        carrinhoCompras.add(new ProdutoUm(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (int i = 0; i < carrinhoCompras.size(); i++) {
            int aux = compare(nome, carrinhoCompras.get(i).getNome());

            if (aux == 0){
                carrinhoCompras.remove(i);
            }
        }
    }

    public Double calcularValor(){
        double aux = 0.0;

        for (ProdutoUm produto : carrinhoCompras) {
            aux += produto.getPreco();
        }

        return aux;
    }

    public void exibirItens(){
        for (ProdutoUm produto : carrinhoCompras) {
            System.out.println("Nome: " + produto.getNome() + " Preço: " + produto.getPreco() + " Quantidade: " + produto.getQuantidade());
        }
    }

    public ArrayList<ProdutoUm> getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(ArrayList<ProdutoUm> carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }
}
