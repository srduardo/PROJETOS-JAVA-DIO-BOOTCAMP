package Exceções;

public class FormatadorCepExemplo {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExepition e){
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExepition {
        if (cep.length() != 8)
            throw new CepInvalidoExepition();

        return "23.765-064";
    }
}
