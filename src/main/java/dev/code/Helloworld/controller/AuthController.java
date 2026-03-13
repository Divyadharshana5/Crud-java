package dev.code.Helloworld.controller;

import dev.code.Helloworld.models.User;
import dev.code.Helloworld.repository.UserRepository;
import dev.code.Helloworld.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    private final UserRepository userRepository;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Map<String, String> body){
        String email = body.get("email");
        String password=body.get("password");

        if(userRepository.findByEmail(email).isPresent()){
            return new ResponseEntity<>("Email already exists" ,HttpStatus.CONFLICT);

        }
        userService.createUser(User.builder().email(email).password(password).build());
        return new ResponseEntity<>("Successfully Registered" ,HttpStatus.CREATED);

    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Map<String, String> body){

    }
}
