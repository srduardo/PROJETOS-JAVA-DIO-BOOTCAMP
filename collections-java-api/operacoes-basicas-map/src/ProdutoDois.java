public class ProdutoDois {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoDois(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

}
