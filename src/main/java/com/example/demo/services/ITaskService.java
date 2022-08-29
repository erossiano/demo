package com.example.demo.services;

import com.example.demo.entities.Task;

import java.util.List;

public interface ITaskService {
    List<Task> findAll();
}
