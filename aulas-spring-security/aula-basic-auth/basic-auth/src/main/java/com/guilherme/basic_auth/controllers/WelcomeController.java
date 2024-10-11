package com.guilherme.basic_auth.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping()
    public String index(){
        return "Welcome";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String users(){
        return "Usuário autorizado";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('MANAGERS')")
    public String managers(){
        return "Gerente autorizado";
    }
}
