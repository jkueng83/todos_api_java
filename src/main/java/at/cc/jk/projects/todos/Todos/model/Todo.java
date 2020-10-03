package at.cc.jk.projects.todos.Todos.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    private int id;
    private String name;

    public Todo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
