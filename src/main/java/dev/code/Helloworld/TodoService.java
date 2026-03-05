package dev.code.Helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

//Bean
@Service
public class TodoService {
    //Autowire
    private TodoRepository todoRepository;


    public void printTodos(){
          System.out.println(todoRepository.getAllTodos());
    }
}
