package dio.desafio.dominio;

import java.time.LocalDate;

public class Main{

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(9);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(12);

        Mentorias mentorias = new Mentorias();
        mentorias.setTitulo("mentoria de java");
        mentorias.setDescricao("descricao de mentoria java");
        mentorias.setData(LocalDate.now());


                System.out.println(curso1);
                System.out.println(curso2);
                System.out.println(mentorias);

                Bootcamp bootcamp = new Bootcamp();
                bootcamp.setNome("Bootcamp Java Developer");
                bootcamp.setDescricao("Descrição Bootcamp Java Developer");
                bootcamp.getConteudos().add(curso1);
                bootcamp.getConteudos().add(curso2);
                bootcamp.getConteudos().add(mentorias);

                Dev devSamantha = new Dev();
                devSamantha.setNome("Samantha");
                devSamantha.inscreverBootcamp(bootcamp);
                System.out.println("Conteudos Inscritos" + devSamantha.getConteudosInscritos());
                devSamantha.progredir();
                System.out.println("-");
                System.out.println("Conteudos concluidos Samantha: " + devSamantha.getConteudosConcluidos());
                System.out.println("XP: " + devSamantha.calcularTotalXp());

                System.out.println("-----------");

                Dev devSamara = new Dev();
                devSamara.setNome("Samara");
                devSamara.inscreverBootcamp(bootcamp);
                System.out.println("Conteudos Inscritos" + devSamara.getConteudosInscritos());
                devSamara.progredir();
                devSamara.progredir();
                System.out.println("-");
                System.out.println("Conteudos concluidos Samara: " + devSamara.getConteudosConcluidos());
                System.out.println("XP: " + devSamara.calcularTotalXp());
    }

}