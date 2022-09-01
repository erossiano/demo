package com.example.demo.controllers;


import com.example.demo.entities.Task;
import com.example.demo.services.TaskService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class TaskController {
    private final TaskService service;


    public TaskController(TaskService service) {
        this.service = service;
    }

/*    @GetMapping("/tasks")
    public List taskList(){
        List tasks = this.service.getTaskLists();
        return tasks;
    }*/

/* Permite hacer peticiones REST
   @PostMapping("/tasks")
    public Task taskSave(@RequestBody Task task) {
       return this.service.createTask(task);
    }*/

    //Permite hacer petifiocnes form
    @PostMapping("/tasks")
    public RedirectView taskSave(@ModelAttribute @DateTimeFormat(pattern="yyyy-MM-dd") Task task, Model model) {
        model.addAttribute(task);
        task.setDone(false);
        //return
        this.service.createTask(task);

        return new RedirectView("tasks");
    }

    @PatchMapping("/tasks/{id}")
    public RedirectView updateTask(@PathVariable("id") long id){
        this.service.setTaskDone(id);
        return new RedirectView("/tasks");
    }

    @DeleteMapping("/tasks/{id}")
    public RedirectView deleteTask(@PathVariable("id") long id){
        this.service.deleteTask(id);
        return new RedirectView("/tasks");
    }


}
