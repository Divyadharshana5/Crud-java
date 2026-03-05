package dev.code.Helloworld;

public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(){
        todoRepository=new TodoRepository();
    }

    public void printTodos(){
          System.out.println(todoRepository.getAllTodos());
    }
}
