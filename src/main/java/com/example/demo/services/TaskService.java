package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.repositories.TaskRepository;

import java.time.LocalDate;
import java.util.List;


public class TaskService implements ITaskService{
    Task t1;
    Task t2;
    Task t3;
    Task t4;
    Task t5;
    TaskList meta;

    private final TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.t1 = new Task("Descripcion 1", false, LocalDate.of(2022, 1, 1));
        this.t2 = new Task("Descripcion 2", false, LocalDate.of(2022, 2, 10));
        this.t3 = new Task("Descripcion 3", false, LocalDate.of(2021, 10, 10));
        this.t4 = new Task("Descripcion 4", false, LocalDate.of(2022, 11, 30));
        this.t5 = new Task("Descripcion 5", false, LocalDate.of(2022, 12, 24));

        this.meta = new TaskList("Lista de Tareas");
        this.meta.addTask(t1);
        this.meta.addTask(t2);
        this.meta.addTask(t3);
        this.meta.addTask(t4);
        this.meta.addTask(t5);//return meta;
        this.repository = repository;
    }

     public TaskList getTaskLists(){
        return this.meta;
    }

    @Override
    public List<Task> findAll() {

        return (List<Task>) repository.findAll();
    }
}
