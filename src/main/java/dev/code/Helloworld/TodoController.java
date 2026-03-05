package dev.code.Helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @GetMapping("/get")
        String getTodo(){
            return "Todo";
    }

    //Path Variable
    @GetMapping("/{id}")
    String getTodoById(@PathVariable long id){
        return "Todo with Id" + id;
    }

    //Request Param
    @GetMapping
    String getTodoByIdParam(@RequestParam("todoId") long id){
        return "Todo with Id" + id;
    }

    @PostMapping("/create")
    String createUser (@RequestBody String body){
        return body ;
    }
}
