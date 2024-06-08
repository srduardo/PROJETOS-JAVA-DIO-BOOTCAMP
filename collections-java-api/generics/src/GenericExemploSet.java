import java.util.HashSet;
import java.util.Set;

public class GenericExemploSet {
    public static void main(String[] args) {
        // Exemplo sem Generics:
        Set<Object> setSemGenerics = new HashSet<>(); // Ou Set setSemGenerics = new HashSet();
        setSemGenerics.add("Elemento 1");
        setSemGenerics.add(10);

        // Exemplo Generics:
        Set<String> setGenerics = new HashSet<>();
        setGenerics.add("Elemento 1");
        setGenerics.add("Elemento 2");

        for (String elemento : setGenerics) {
            System.out.println(elemento);
        }

        for (Object elemento : setSemGenerics) {
            System.out.println(elemento);
        }
    }
}
