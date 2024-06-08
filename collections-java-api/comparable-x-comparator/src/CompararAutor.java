import java.util.Comparator;

public class CompararAutor implements Comparator<Livro>{
    @Override
    public int compare(Livro livro01, Livro livro02){
        return livro01.getAutor().compareTo(livro02.getAutor());
    }
}
