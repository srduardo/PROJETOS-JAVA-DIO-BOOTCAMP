import java.util.ArrayList;

public class CatalogoLivros {
    private ArrayList<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        catalogoLivros.add(livro);
    }

    public void pesquisarPorAutor(String nomeAutor){
        for (int i = 0; i < catalogoLivros.size(); i++) {
            if (catalogoLivros.get(i).getAutor() == nomeAutor){
                System.out.println("Livro: " + catalogoLivros.get(i).getTitulo() + " Autor: " + catalogoLivros.get(i).getAutor() + " Ano: " + catalogoLivros.get(i).getAno());
            }
        }
    }

    public void pesquisarPorIntervaloDeAno(int ano01, int ano02){
        for (int i = 0; i < catalogoLivros.size(); i++) {
            if (catalogoLivros.get(i).getAno() <= ano01 && catalogoLivros.get(i).getAno() >= ano02){
                System.out.println("Livro: " + catalogoLivros.get(i).getTitulo() + " Autor: " + catalogoLivros.get(i).getAutor() + " Ano: " + catalogoLivros.get(i).getAno());
            }
        }
    }

    public void pesquisarPorTitulo(String titulo){
        for (int i = 0; i < catalogoLivros.size(); i++) {
            if (catalogoLivros.get(i).getTitulo() == titulo){
                System.out.println("Livro: " + catalogoLivros.get(i).getTitulo() + " Autor: " + catalogoLivros.get(i).getAutor() + " Ano: " + catalogoLivros.get(i).getAno());
                break;
            }
        }
    }

    public ArrayList<Livro> getCatalogoLivros() {
        return catalogoLivros;
    }

    public void setCatalogoLivros(ArrayList<Livro> catalogoLivros) {
        this.catalogoLivros = catalogoLivros;
    }

    
}
