package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.entities.User;
import com.example.demo.services.TaskService;
import com.example.demo.services.UserServices;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    TaskService taskService;
    UserServices userService;

    public FrontController(TaskService service, UserServices userService) {
        this.taskService = service;
        this.userService = userService;
    }
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
            //System.out.println(principal.getClaims());
            User user = this.userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
        }


        return  "index";
    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        List<Task> tasks = this.taskService.getTaskLists();
        model.addAttribute("tasks", tasks);
        return  "tasks";
    }

    @GetMapping("/task/new")
    public String newTasks(Model model){
         model.addAttribute("task", new Task());
        return  "new-task";
    }

}
