package src.desafiosCodigos.POOPratica;

import src.desafiosCodigos.POOPratica.dominio.Curso;
import src.desafiosCodigos.POOPratica.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("CURSO JAVA");
        curso1.setDescricao("BY CLARO");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("CURSO JAVASCRIPT");
        curso2.setDescricao("BY NTT");
        curso2.setCargaHoraria(25);
        System.out.println(curso2);

        Mentoria m1  = new Mentoria();
        m1.setTitulo("mentoria de java");
        m1.setDescricao("By claro to help you");
        m1.setData(LocalDate.now());

        System.out.println(m1);
    }
}
