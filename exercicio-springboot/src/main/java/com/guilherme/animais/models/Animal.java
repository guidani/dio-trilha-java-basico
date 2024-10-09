package com.guilherme.animais.models;

public class Animal {
    private Integer id;
    private String name;
    private String race;
    private Integer age;
    private String tutor;

    public Animal(String name, String race, Integer age, String tutor) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", tutor='" + tutor + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
}
