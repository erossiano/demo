package com.example.demo;


import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
/*
Task t1 = new Task("Descripcion 1", false, LocalDate.of(2022, 1, 1));
Task t2 = new Task("Descripcion 2", false, LocalDate.of(2022, 2, 10));
Task t3 = new Task("Descripcion 3", false, LocalDate.of(2021, 10, 10));
Task t4 = new Task("Descripcion 4", false, LocalDate.of(2022, 11, 30));
Task t5 = new Task("Descripcion 5", false, LocalDate.of(2022, 12, 24));
TaskList meta = new TaskList("Lista de Tareas");
meta.addTask(t1);
meta.addTask(t2);
meta.addTask(t3);
meta.addTask(t4);
meta.addTask(t5);

meta.removeTask2("Descripcion 2");

System.out.println("***************************");
System.out.println(meta.getName());
System.out.println("***************************");
meta.printTask2();*/

	}

	}

