package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    public Mentoria() {
    }

    public Mentoria(LocalDate data, String descricao, String titulo) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data='" + data + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRA + 20d;
    }
}
