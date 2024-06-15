import java.util.Arrays;
import java.util.List;
// import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Declarando List de inteiros:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Declarando BinaryOperator:
        // BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;

        // Atribuindo resultado do BinaryOperator com reduce e method reference:
        // Reduce = Reduz ou transforma dois elementos em apenas um. Exemplo: elemento 1 + elemento 2 = elemento 3
        Integer resultado = numeros.stream().reduce(0, Integer::sum);
        
        System.out.println(resultado);
    }
}
