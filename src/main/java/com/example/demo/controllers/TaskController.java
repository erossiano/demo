package com.example.demo.controllers;

//import com.example.demo.entities.Task;
import com.example.demo.entities.Task;
import com.example.demo.services.ITaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class TaskController {
    //TaskService services;

    private final ITaskService taskService;
    public TaskController(ITaskService taskService) {
        this.taskService = taskService;
        //this.services = new TaskService();
    }

    @GetMapping("/task")
    public List taskList(){
        //return this.services.getTaskLists();
        var tasks = (List<Task>) taskService.findAll();

        //var params = new HashMap<String, Object>();
        //params.put("countries", countries);

        //return new ModelAndView("showCountries", params);
        return tasks;
    }

/*    public Task taskList1(){
        Task t1 = new Task("Descripcion 1", false, LocalDate.of(2022, 1, 1));
        TaskList meta = new TaskList("Lista de Tareas");
        meta.addTask(t1);
        return t1;
    }*/
}
