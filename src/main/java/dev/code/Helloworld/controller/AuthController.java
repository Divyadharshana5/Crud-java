package dev.code.Helloworld.controller;

import dev.code.Helloworld.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private UserRepository userRepository;
    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, String> body){
        String email = body.get("email");
        String password=body.get("password");
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Map<String, String> body){

    }
}
