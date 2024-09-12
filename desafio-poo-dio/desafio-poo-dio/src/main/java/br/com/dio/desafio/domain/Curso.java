package br.com.dio.desafio.domain;

public class Curso extends Conteudo {

    private int cargaHorario;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHorario) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHorario = cargaHorario;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRA * cargaHorario;
    }
}
