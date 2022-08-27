package com.example.demo.controllers;

//import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.services.TaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TaskController {
    TaskService services;

    public TaskController() {
        this.services = new TaskService();
    }

    @GetMapping("/task")
    public TaskList taskList(){
        return this.services.getTaskLists();
    }

/*    public Task taskList1(){
        Task t1 = new Task("Descripcion 1", false, LocalDate.of(2022, 1, 1));
        TaskList meta = new TaskList("Lista de Tareas");
        meta.addTask(t1);
        return t1;
    }*/
}
