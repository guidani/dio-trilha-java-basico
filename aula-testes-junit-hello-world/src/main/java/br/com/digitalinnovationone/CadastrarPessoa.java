package br.com.digitalinnovationone;

import java.time.LocalDate;

public class CadastrarPessoa extends Pessoa {
    private String nome;
    private String documento;
    private LocalDate idade;
    private String CEP;

    public CadastrarPessoa(String nome, String documento, LocalDate idade, String CEP) {
        super(nome, idade);
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
        this.CEP = CEP;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate idade, String CEP) {
        return null;
    }
}
