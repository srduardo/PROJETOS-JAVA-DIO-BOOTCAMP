public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        carrinho.adicionarItem("Tomate", 8.00, 2);
        carrinho.adicionarItem("Arroz", 38.00, 1);
        carrinho.adicionarItem("Laranja", 7.00, 1);

        System.out.println(carrinho.calcularValor());
        carrinho.removerItem("Tomate");
        carrinho.exibirItens();
    }
}
