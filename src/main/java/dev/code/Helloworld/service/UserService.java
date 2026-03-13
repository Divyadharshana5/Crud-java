package dev.code.Helloworld.service;

import dev.code.Helloworld.models.Todo;
import dev.code.Helloworld.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

//Bean
@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id){
      return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    //Pagination
    public Page<Todo> getAllTodosPages(int page, int size){
        Pageable pageable = (Pageable) PageRequest.of(page, size);
        return todoRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }

    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }

    public Todo updateTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id){
         todoRepository.delete(getTodoById(id));
    }

    public void deleteTodo(Todo todo){
        todoRepository.delete(todo);
    }
}
