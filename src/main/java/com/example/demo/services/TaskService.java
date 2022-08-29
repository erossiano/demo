package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService{
    private final TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public List getTaskLists() {
        return this.repository.findAll();
    }

    public Task createTask(Task task) {
        return this.repository.save(task);
    }
}
