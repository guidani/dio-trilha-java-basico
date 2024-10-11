package dio.security_jwt.controller;

import dio.security_jwt.dtos.LoginDTO;
import dio.security_jwt.dtos.SessaoDTO;
import dio.security_jwt.models.User;
import dio.security_jwt.repository.UserRepository;
import dio.security_jwt.security.JWTCreator;
import dio.security_jwt.security.JWTObject;
import dio.security_jwt.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Encoder;
import java.util.Date;

@RestController
public class LoginController {

    @Autowired
    private Encoder encoder ;
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public SessaoDTO logar(@RequestBody LoginDTO loginDTO){
        User user  = userRepository.findByUsername(loginDTO.getUsername());
        if(user != null){
            boolean passwordOK = encoder.equals(loginDTO.getPassword());
            if(!passwordOK){
                throw new RuntimeException("Senha inválida");
            }

            SessaoDTO sessaoDTO = new SessaoDTO();
            sessaoDTO.setLogin(user.getUsername());

            JWTObject jwtObject = new JWTObject();
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration(new Date(System.currentTimeMillis() + securityConfig.EXPIRATION));
            jwtObject.setRoles(JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject));
            return sessaoDTO;
        } else {
            throw new RuntimeException("Erro ao tentar fazer login");
        }
    }
}
