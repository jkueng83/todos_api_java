package at.cc.jk.projects.todos.Todos.repositories;

import at.cc.jk.projects.todos.Todos.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {


}
