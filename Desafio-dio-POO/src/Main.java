import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

Curso curso1 = new Curso();
curso1.setTitulo("Curso Java");
curso1.setDescricao("Descriçaõ curso Java");
curso1.setCargaHoraria(8);

Curso curso2 = new Curso();
curso2.setTitulo("Curso JS");
curso2.setDescricao("Descriçaõ curso JS");
curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descriçãp BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro:" + devPedro.getConteudosConsumidos());
        System.out.println("XP:"+ devPedro.calcularTotalXp());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConsumidos());
        System.out.println("XP:"+ devJoao.calcularTotalXp());

    }
}
