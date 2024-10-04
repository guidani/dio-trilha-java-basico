package com.guilherme.dio_api.models;

public class Usuario {
    private Integer id;
    private String login;
    private String password;
    public Usuario(){}
    public Usuario(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "password='" + password + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
