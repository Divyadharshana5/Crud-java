package dev.code.Helloworld.service;

import dev.code.Helloworld.models.User;
import dev.code.Helloworld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//Bean
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return (User) userRepository.save(user);
    }

    public User getUserById(Long id) throws Throwable {
        return (User) userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
