package dev.code.Helloworld.repository;

import dev.code.Helloworld.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
