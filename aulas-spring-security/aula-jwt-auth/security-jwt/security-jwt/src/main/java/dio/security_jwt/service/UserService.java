package dio.security_jwt.service;

import dio.security_jwt.models.User;
import dio.security_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createUser(User user){
        String pass = user.getPassword();

        user.setPassword(passwordEncoder.encode(pass));
        userRepository.save(user);
    }
}
