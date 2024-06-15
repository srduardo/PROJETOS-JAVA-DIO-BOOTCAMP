import java.util.Comparator;

public class CompararPorAltura implements Comparator<Pessoa>{

    
    /** 
     * @param o1
     * @param o2
     * @return int
     */
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
    
}
