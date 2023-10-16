package com.karolis.ToDoApp.repository;

import com.karolis.ToDoApp.entity.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToDoListRepository extends JpaRepository<ToDoList, Integer> {

  List<ToDoList> findByTaskContainingIgnoreCase(String keyword);

}
