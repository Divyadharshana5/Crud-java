package dev.code.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @GetMapping("/get")
        String getTodo(){
            return "Todo";
    }
    @GetMapping("/id")
    String getTodoById(){
        return "Todo with Id";
    }
}
