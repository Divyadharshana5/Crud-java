package dev.code.Helloworld.repository;


import dev.code.Helloworld.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, Long> {

}
