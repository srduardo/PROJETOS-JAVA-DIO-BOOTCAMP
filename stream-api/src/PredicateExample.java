import java.util.Arrays;
import java.util.List;
// import java.util.function.Predicate;

public class PredicateExample {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Declarando list com nomes:
        List<String> nomesLang = Arrays.asList("Python", "Java", "C", "Ruby", "Javascript", "Kotlyn");

        // Declarando Predicate:
        // Predicate<String> filtro = nome -> nome.length() > 5;

        // Usando lambda predicate no filter:
        // Filter: Avalia uma condição e retorna um valor boolean
        nomesLang.stream().filter(nome -> nome.length() < 5).forEach(System.out::println);
    }
}
