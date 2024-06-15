import java.util.Comparator;

public class CompararAnoAutorTitulo implements Comparator<Livro>{
    
    /** 
     * @param livro01
     * @param livro02
     * @return int
     */
    @Override
    public int compare(Livro livro01, Livro livro02){
        int ano = Integer.compare(livro01.getAno(), livro02.getAno());
        if (ano != 0){
            return ano;
        }

        int autor = livro01.getAutor().compareTo(livro02.getAutor());
        if (autor != 0){
            return autor;
        }

        return livro01.getTitulo().compareTo(livro02.getTitulo());
    }
}
