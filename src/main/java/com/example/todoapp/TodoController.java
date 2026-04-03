package com.example.todoapp;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
private  TodoRepository repository;

    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }
    @GetMapping
public List<Todo> getALlTodos()
    {
return repository.findAll();
    }
@GetMapping("/{id}")

    public Todo getTodo(@PathVariable  Long id)
{
    return repository.findById(id)
            .orElseThrow(()-> new ResourceNotFoundException("Todo with id " + id + " not found"));
}

@PostMapping
    public Todo addTodo(@Valid @RequestBody Todo todo)
{

    return repository.save(todo);
}
@PutMapping("/{id}")
public Todo updateTodo(@Valid @RequestBody Todo todo , @PathVariable Long id)
{
Todo existingTodo = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo with id " + id + " not found"));

existingTodo.setTitle(todo.getTitle());
    existingTodo.setDescription(todo.getDescription());
    existingTodo.setCompleted(todo.getCompleted());

    return repository.save(existingTodo);
}
@DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable long id)
{
    repository.deleteById(id);
    return "todo deleted";
}
}
