package com.example.demo.controllers;


import com.example.demo.entities.Task;
import com.example.demo.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class TaskController {
    private final TaskService service;


    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/tasks")
    public List taskList(){
        List tasks = this.service.getTaskLists();
        return tasks;
    }

    @PostMapping("/tasks")
    public Task taskSave(@RequestBody Task task) {
        return this.service.createTask(task);
    }

}
