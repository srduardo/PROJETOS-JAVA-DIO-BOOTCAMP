package Condicionais;
public class CaixaEletronico {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        double saldo = 20.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
        
        System.out.println(saldo);
    }
}
