package Condicionais;
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7)
            System.out.println("Aprovado!");
        
        else if (nota >= 5 && nota < 7) 
            System.out.println("Recuperação.");
        
        else 
            System.out.println("Reprovado.");
        
        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Reprovado." : "Recuperação";
        System.out.println(resultado);
    }
}
