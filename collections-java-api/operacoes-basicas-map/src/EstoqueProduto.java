import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, ProdutoDois> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    
    /** 
     * @param cod
     * @param nome
     * @param preco
     * @param quantidade
     */
    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new ProdutoDois(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double estoqueTotal = 0d;

        if (!estoqueProdutosMap.isEmpty()){
            for (ProdutoDois p : estoqueProdutosMap.values()) {
                estoqueTotal += p.getQuantidade() * p.getPreco();
            }
        }

        return estoqueTotal;
    }

    public ProdutoDois obterProdutoMaisCaro(){
        ProdutoDois produtoMaiorPreco = null;
        double maiorPreco = Double.MIN_VALUE;
        
        if (!estoqueProdutosMap.isEmpty()){
            for(ProdutoDois p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaiorPreco = p;
                }
            }
        }

        return produtoMaiorPreco;

    }
}
