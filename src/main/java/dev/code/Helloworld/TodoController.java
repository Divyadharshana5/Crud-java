package dev.code.Helloworld;

import dev.code.Helloworld.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/get")
        String getTodo(){

            return "Todo";
    }

    //Path Variable
    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable long id){
        try {
            Todo createdTodo = todoService.getTodoById(id);
            return new ResponseEntity<>(createdTodo, HttpStatus.OK)  ;
        }
        catch(RuntimeException exception) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND)  ;

        }    }

    //Request Param
    @GetMapping
    String getTodoByIdParam(@RequestParam("todoId") long id){
        return "Todo with Id" + id;
    }

    @PostMapping("/create")
    ResponseEntity<Todo> createUser (@RequestBody Todo todo) {
            Todo createdTodo = todoService.createTodo(todo);
            return new ResponseEntity<>(createdTodo, HttpStatus.CREATED)  ;
    }


    @PutMapping("/{id}")
    String updateTodoById(@PathVariable long id){
        return "Update Todo with Id" + id;
    }

    @DeleteMapping("/{id}")
    String deleteTodoById(@PathVariable long id){
        return "Delete Todo with Id" + id;
    }

}
