package dev.code.Helloworld.repository;

import dev.code.Helloworld.models.User;  // Your User entity
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository<User> extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Optional<Object> findByEmail(String email);
    // Add other custom queries if needed
}



