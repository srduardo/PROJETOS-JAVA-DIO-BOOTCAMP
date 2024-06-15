import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MÁXIMO DE TENTATIVAS: " + tentativasRealizadas);
        }
    }

    public static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    public static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato n°" + (i + 1) + " é o " + candidatos[i]);
        }

        System.out.println("Forma abreviada do foreach");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    public static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("ESPERAR O RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
