import java.util.ArrayList;
import java.util.List;

public class GenericExemploList {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        //List sem generics:
        List<Object> listSemGenerics = new ArrayList<>(); // Ou "List listSemGenerics = new ArrayList();"
        listSemGenerics.add("Elemento 1");
        listSemGenerics.add(10);

        //List com generics:
        List<String> listGenerics = new ArrayList<>();
        listGenerics.add("Elemento 1");
        listGenerics.add("Elemento 2");

        for (String elemento : listGenerics) {
            System.out.println(elemento);
        }

        for (Object elemento : listSemGenerics) {
            System.out.println(elemento);
        }
    }
}
