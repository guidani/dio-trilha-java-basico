package com.guilherme.basic_auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

//WebSecurityConfigurerAdapter foi depreciado
//withDefaultPasswordEncoder foi depreciado para uso em produção. Ok para teste

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig  {

    @Bean
    public InMemoryUserDetailsManager configuration(){
        UserDetails userAdmin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("master123")
                .roles("MANAGERS")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("user123")
                .roles("USERS")
                .build();

        List<UserDetails> l = new ArrayList<>();
        l.add(user);
        l.add(userAdmin);
        return new InMemoryUserDetailsManager(l);
    }
}
