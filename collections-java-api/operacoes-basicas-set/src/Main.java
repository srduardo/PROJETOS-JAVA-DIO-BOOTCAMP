public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 3",2);
        conjuntoConvidados.adicionarConvidado("Convidado 4",4);

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConvidado(4);
        conjuntoConvidados.exibirConvidados();
    }
}
