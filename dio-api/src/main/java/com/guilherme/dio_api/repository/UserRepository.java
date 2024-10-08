package com.guilherme.dio_api.repository;

import com.guilherme.dio_api.handler.BusinessException;
import com.guilherme.dio_api.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()== null){
            throw new BusinessException("O campo de login é obrigatoris");
        }

        if(usuario.getPassword() == null){
            throw new BusinessException("O campo senha é obrigatório");
        }
        if(usuario.getId() == null){
            System.out.println("SAVE - recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - recebendo o usuário na camada de repositório");
        }
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - recebendo o id: %id para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("Listando");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("asd","aiosdjopas"));
        usuarios.add(new Usuario("qwe","aosidjoasid"));
        return  usuarios;
    }

    public Usuario findById(Integer id){
        return new Usuario("asd","aposd");
    }

    public Usuario findByUsername(String username)
    {
        return new Usuario("asd","oasdkaos");
    }

}
