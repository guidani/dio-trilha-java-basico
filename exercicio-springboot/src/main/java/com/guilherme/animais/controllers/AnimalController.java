package com.guilherme.animais.controllers;

import com.guilherme.animais.models.Animal;
import com.guilherme.animais.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private final AnimalRepository animalRepository = new AnimalRepository();

    @GetMapping()
    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Animal getOneAnimal(@PathVariable("id") Integer id){
        return animalRepository.findById(id);
    }
}
