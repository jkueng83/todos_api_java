package at.cc.jk.projects.todos.Todos.controller;

import at.cc.jk.projects.todos.Todos.model.Todo;
import at.cc.jk.projects.todos.Todos.repositories.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class TodoController {

    private final Logger log = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    List<Todo> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos;
    }

    @GetMapping("/todos/{id}")
    Todo getTodo(@PathVariable("id") Integer id) {
        log.info("get todo by id: {} ", id);
        return todoRepository.getOne(id);
    }

}
