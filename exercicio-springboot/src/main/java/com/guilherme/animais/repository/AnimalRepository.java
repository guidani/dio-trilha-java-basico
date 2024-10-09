package com.guilherme.animais.repository;

import com.guilherme.animais.models.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    public List<Animal> findAll() {
        List<Animal> animais = new ArrayList<Animal>();
        animais.add(new Animal("Panda", "pequines", 10, "Guilherme"));
        animais.add(new Animal("Maxx", "pastor", 10, "João"));
        return animais;
    }

    public Animal findById(Integer id) {
        return new Animal("Dob", "vira-lata", 13, "Guilherme");
    }
}
