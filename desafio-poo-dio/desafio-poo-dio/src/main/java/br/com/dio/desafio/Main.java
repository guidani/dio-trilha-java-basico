package br.com.dio.desafio;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Formação Java");
        curso.setDescricao("Formação");
        curso.setCargaHorario(8);
        //System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Formação Angular");
        curso2.setDescricao("Formação");
        curso2.setCargaHorario(8);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev d1 = new Dev();
        d1.setNome("Guilherme");
        d1.inscreverBootcamp(bootcamp);
        System.out.println("Detalhamento Dev: " + d1.getNome());
        System.out.println("Conteúdos Inscrito: " + d1.getConteudosInscritos());
        d1.progredir();
        d1.progredir();
        System.out.println("Conteúdos Inscrito: " + d1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + d1.getConteudosConcluidos());
        System.out.println("XP: " + d1.calcularTotalXp());

        System.out.println("-".repeat(50));

        Dev d2 = new Dev();
        d2.setNome("Daniel");
        d2.inscreverBootcamp(bootcamp);
        System.out.println("Detalhamento Dev: " + d2.getNome());
        System.out.println("Conteúdos Incrito: " + d2.getConteudosInscritos());
        d2.progredir();
        System.out.println("Conteúdos Inscrito: " + d2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + d2.getConteudosConcluidos());
        System.out.println("XP: " + d2.calcularTotalXp());


    }
}
