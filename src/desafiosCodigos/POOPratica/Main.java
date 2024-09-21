package src.desafiosCodigos.POOPratica;

import src.desafiosCodigos.POOPratica.dominio.Bootcamp;
import src.desafiosCodigos.POOPratica.dominio.Curso;
import src.desafiosCodigos.POOPratica.dominio.Dev;
import src.desafiosCodigos.POOPratica.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("CURSO JAVA");
        curso1.setDescricao("BY CLARO");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("CURSO JAVASCRIPT");
        curso2.setDescricao("BY NTT");
        curso2.setCargaHoraria(25);

        Mentoria m1  = new Mentoria();
        m1.setTitulo("mentoria de java");
        m1.setDescricao("By claro to help you");
        m1.setData(LocalDate.now());

        Bootcamp boot = new Bootcamp();
        boot.setNome("Bootcamp Java Developer");
        boot.setDescricao("Descrção Bootcamp Java Developer");
        boot.getConteudos().add(curso1);
        boot.getConteudos().add(curso2);
        boot.getConteudos().add(m1);

        Dev devEu = new Dev();
        devEu.setNome("Josefino");
        devEu.inscerverBootcamp(boot);
        System.out.println("Josefino");
        System.out.println("Conteudos Inscritos: " + devEu.getConteudosInscritos());
        devEu.progredir();
        devEu.progredir();
        System.out.println("----------------------");
        System.out.println("Conteudos Inscritos: " + devEu.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devEu.getConteudosConcluidos());
        System.out.println("XP: " + devEu.calcularTotalXP());


        Dev devEle = new Dev();
        devEle.setNome("Lucas");
        devEle.inscerverBootcamp(boot);
        System.out.println("Lucas");
        System.out.println("Conteudos Inscritos: " + devEle.getConteudosInscritos());
        devEle.progredir();
        System.out.println("----------------------");
        System.out.println("Conteudos Inscritos: " + devEle.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devEle.getConteudosConcluidos());
        System.out.println("XP: " + devEle.calcularTotalXP());


    }
}
