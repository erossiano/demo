package com.example.demo.services;

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
}
