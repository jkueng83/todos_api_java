package at.cc.jk.projects.todos.Todos.controller;

import at.cc.jk.projects.todos.Todos.model.Todo;
import at.cc.jk.projects.todos.Todos.repositories.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TodoController {

    private final Logger log = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos;
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable("id") Integer id) {
        log.info("get todo by id: {} ", id);
        return todoRepository.getOne(id);
    }

    @PostMapping(value = "/todos", consumes = "application/json")
    public ResponseEntity insertTodo(@RequestBody Todo todo) {
        todoRepository.save(todo);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity deleteTodo(@PathVariable("id") int id) {

        todoRepository.deleteById(id);

        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping(value="/todos" , consumes = "application/json")
    public ResponseEntity updateTodo( @RequestBody Todo todo ){
        todoRepository.save(todo);
        return new ResponseEntity(HttpStatus.OK);
    }

}
