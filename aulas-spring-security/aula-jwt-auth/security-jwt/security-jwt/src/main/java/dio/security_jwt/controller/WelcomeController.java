package dio.security_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController          {
    @GetMapping
    public String welcome(){
        return "Welcome";
    }

    @GetMapping("/users")
    public String users(){
        return "User";
    }

    @GetMapping("/managers")
    public String managers()
    {
        return "Manager";
    }
}
