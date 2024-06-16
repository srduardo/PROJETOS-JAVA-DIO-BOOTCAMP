import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main01 {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Eduardo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Eduardo: " + dev1.getConteudosInscritos());
        
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos concluídos Eduardo: " + dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXp());
        
        System.out.println("==================");
        
        Dev dev2 = new Dev();
        dev2.setNome("Augusto");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Augosto: " + dev2.getConteudosInscritos());
        
        dev2.progredir();
        System.out.println("Conteúdos concluídos Augosto: " + dev2.getConteudosConcluidos());
        System.out.println(dev2.calcularTotalXp());

    }
}
