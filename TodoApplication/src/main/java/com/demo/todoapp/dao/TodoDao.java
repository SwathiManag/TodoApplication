package com.demo.todoapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.demo.todoapp.model.Todo;

public interface TodoDao {

    void insertTodo(Todo todo) throws SQLException;

    Todo selectTodo(long todoId);

    List<Todo> selectAllTodos();

    boolean deleteTodo(int id) throws SQLException;

    boolean updateTodo(Todo todo) throws SQLException;

}
