package br.com.dio.desafio;

import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Formação Java");
        curso.setDescricao("Formação");
        curso.setCargaHorario(8);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
