package com.karolis.ToDoApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todolist")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 128, nullable = false)
    private String task;

    @Column(length = 256)
    private String description;

    public ToDoList(){

    }

    public ToDoList(String task, String description) {
        this.task = task;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    }
