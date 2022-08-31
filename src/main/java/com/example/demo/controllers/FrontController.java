package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    TaskService service;

    public FrontController(TaskService service) {
        this.service = service;
    }
    @GetMapping("/")
    public String index(){
        return  "index";
    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        //Obtener informacion desde el servicio
        List<Task> tasks = this.service.getTaskLists();
        //Agregar variable al fronend
        model.addAttribute("tasks", tasks);
        //devolver el fronend
        return  "tasks";
    }

}
