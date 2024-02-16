package net.javaguides.todo.service;

import net.javaguides.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);
    TodoDto getTodo(Long id);
    List<TodoDto> getAllTodo();
    TodoDto updateTodo(Long todoId, TodoDto todoDto);
    void deleteTodo(Long todoId);
    TodoDto completeTodo(Long id);
    TodoDto inCompleteTodo(Long id);
}