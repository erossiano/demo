package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Boolean setTaskDone(long id){
        try {
            Optional<Task> task = this.repository.findById(id);
            if(task.isPresent()){
                task.get().setDone(true);
                this.repository.save(task.get());
                return true;
            }

        }catch (Exception e){
            return false;
        }
        return false;
    }

    public Boolean deleteTask(long id){
        try {
                this.repository.deleteById(id);
                return true;
            } catch (Exception e){
            return false;
        }
    }
}
