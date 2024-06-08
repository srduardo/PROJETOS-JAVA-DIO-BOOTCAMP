import java.util.Comparator;

public class CompararAno implements Comparator<Livro>{
    @Override
    public int compare(Livro livro01, Livro livro02){
        return livro01.getAno().compareTo(livro02.getAno());
    }

    /*
     *   if (livro01.getAno() < livro02.getAno()){
     * 
     *      return -1;   
     * 
     *   } else if (livro01.getAno() > livro02.getAno()) {
     * 
     *      return 1;
     * 
     *   } else {
     * 
     *      return 0;
     * 
     *   }
     */
}
