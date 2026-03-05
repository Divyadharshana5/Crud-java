package dev.code.Helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Bean
public class TodoRepository {
    String getAllTodos(){
        return "Todo";
    }
}
