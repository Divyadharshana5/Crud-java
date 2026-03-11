package dev.code.Helloworld;

import dev.code.Helloworld.models.Todo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    private static final Logger log = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoService todoService;

    // Get Todo by ID
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Todo Retrieved Successfully"),
            @ApiResponse(responseCode = "404", description = "Todo was not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable long id) {
        try {
            Todo todo = todoService.getTodoById(id);
            return new ResponseEntity<>(todo, HttpStatus.OK);
        } catch (RuntimeException exception) {
            log.warn("Todo not found for id {}", id);
            log.error("Exception while fetching todo", exception);
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    // Get all Todos
    @GetMapping
    public ResponseEntity<List<Todo>> getTodos() {
        List<Todo> todos = todoService.getTodos();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    // Get paginated Todos
    @GetMapping("/page")
    public ResponseEntity<Page<Todo>> getTodosPaged(
            @RequestParam int page,
            @RequestParam int size) {

        Page<Todo> todos = todoService.getAllTodosPages(page, size);
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    // Create Todo
    @PostMapping("/create")
    public ResponseEntity<Todo> createUser(@RequestBody Todo todo) {
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    // Update Todo
    @PutMapping
    public ResponseEntity<Todo> updateTodoById(@RequestBody Todo todo) {
        Todo updatedTodo = todoService.updateTodo(todo);
        return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
    }

    // Delete Todo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable long id) {
        todoService.deleteTodoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}