import java.time.LocalDate;

import com.dio.desafio.poo.Bootcamp;
import com.dio.desafio.poo.Curso;
import com.dio.desafio.poo.Dev;
import com.dio.desafio.poo.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição Curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPolly = new Dev();
        devPolly.setNome("Pollyanna");
        devPolly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pollyanna:" + devPolly.getConteudosInscritos());
        devPolly.progredir();
        devPolly.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pollyanna:" + devPolly.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pollyanna:" + devPolly.getConteudosConcluidos());
        System.out.println("XP:" + devPolly.calcularTotalXp());

        System.out.println("-------");

        Dev devJacks = new Dev();
        devJacks.setNome("Joao");
        devJacks.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jackson:" + devJacks.getConteudosInscritos());
        devJacks.progredir();
        devJacks.progredir();
        devJacks.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jackson:" + devJacks.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jackson:" + devJacks.getConteudosConcluidos());
        System.out.println("XP:" + devJacks.calcularTotalXp());
        
    }
}
