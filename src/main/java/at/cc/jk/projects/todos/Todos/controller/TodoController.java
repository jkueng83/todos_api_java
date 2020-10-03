package at.cc.jk.projects.todos.Todos.controller;

import at.cc.jk.projects.todos.Todos.model.Todo;
import at.cc.jk.projects.todos.Todos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class TodoController {

    @Autowired
    private TodoRepository repo;

    @GetMapping("/todos")
    List<Todo> getAllTodos() {

        List<Todo> todos = repo.findAll();

        return todos;
    }

}
