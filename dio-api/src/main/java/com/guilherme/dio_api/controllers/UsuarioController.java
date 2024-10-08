package com.guilherme.dio_api.controllers;

import com.guilherme.dio_api.models.Usuario;
import com.guilherme.dio_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @GetMapping("/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario)   {
        repository.save(usuario);
    }

}
