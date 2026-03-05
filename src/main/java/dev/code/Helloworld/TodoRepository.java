package dev.code.Helloworld;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {
    String getAllTodos(){
        return "Todo";
    }
}
