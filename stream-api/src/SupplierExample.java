import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Declarando a interface funcional Supplier:
        Supplier<String> supplierString = () -> "Olá";

        // Atribuindo a interface funcional a uma list:
        List<String> listaString = Stream.generate(supplierString).limit(5).toList();

        // Declarando a interface fucnional dentro do generate:
        // Generate: gera um elemento pre definido no lambda
        // Limit: limita a quantidade elementos que serão gerados
        // List<String> listaString2 = Stream.generate(() -> "Olá").limit(5).toList();

        listaString.forEach(System.out::println);
    }
}
